package Bits;

public class NumberOf1Bits {

    public static void main(String[] args) {
        NumberOf1Bits oneBits = new NumberOf1Bits();
        int count = oneBits.numSetBits(10);
        System.out.println(count);
    }

    public int numSetBits(int A) {
        int result = 0;
        while (A > 0) {
            result++;
            A = A & (A - 1);
        }
        return result;
    }
}
