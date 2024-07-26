package Bits;

public class SmallestXOR {
    public static void main(String[] args) {
        SmallestXOR smallest = new SmallestXOR();
        int A = 15;
        int B = 2;
        int result = smallest.solve1(15, 0);
        System.out.println(result);



    }

    public int solve(int A, int B) {
        int X = 0;
        //check for every bit position for set bits in A
        for (int i = 30; i >= 0; i--) {
            if (B == 0) {
                return X;
            }
            if (((1 << i) & A) > 0) {
                X = X | (1 << i);
                B--;
            }
        }
        //check for unset bits in X
        for (int i = 0; i < 31; i++) {
            if (B == 0) {
                return X;
            }
            if (((1 << i) & X) == 0) {
                X = X | (1 << i);
                B--;
            }
        }
        return X;
    }

    public int solve1(int A, int B) {
        int X = 0;
        for (int i = 30; i >= 0; i--) {
            if (B == 0) {
                return X;
            }
            if (((A >> i) & 1) == 1) {
                X = X | (1 << i);
                B--;
            }
        }
        for (int i = 0; i < 31; i++) {
            if (B == 0) {
                return X;
            }
            if (((X >> i) & 1) == 0) {
                X = X | (1 << i);
                B--;
            }
        }
        return X;
    }
}
