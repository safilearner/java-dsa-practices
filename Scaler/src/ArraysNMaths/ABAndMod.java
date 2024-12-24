package ArraysNMaths;

public class ABAndMod {
    public static void main(String[] args) {
        ABAndMod abAndMod = new ABAndMod();
        int A = 5565401;
        int B = 2424496;
        int res = abAndMod.solve1(A, B);
        System.out.println(res);
    }

    public int solve(int A, int B) {
        int M = 0;
        for (int i = 1; i <= Math.max(A, B); i++) {
            int X = A % i;
            int Y = B % i;
            if (X == Y) {
                M = i;
            }
        }
        return M;
    }


    public int solve1(int A, int B) {
        return Math.abs(A - B);
    }

}
