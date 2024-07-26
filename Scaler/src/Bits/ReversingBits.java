package Bits;

public class ReversingBits {

    public static void main(String[] args) {
        ReversingBits reverseBits = new ReversingBits();
        long input = 3;
        System.out.println(reverseBits.reverse(3));
    }

    public long reverse(long a) {
        long result = 0L;
        for (int i = 0; i < 32; i++) {
            if (((a >> i) & 1) == 1) {
                result = result | (1L << 31 - i);
            }
        }
        return result;
    }


    public long reverse2(long a) {
        long result = 0L;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            if (((a >> i) & 1) == 1) {
                result = result | 1;
            }
        }
        return result;
    }


    public long reverse1(long a) {
        long result = 0L;
        for (int i = 0; i < 31; i++) {
            if (((a >> i) & 1) == 1) {
                result = (long) (result + Math.pow(2,31-i));
            }
        }
        return result;
    }
}
