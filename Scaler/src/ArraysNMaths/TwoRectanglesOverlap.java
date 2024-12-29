package ArraysNMaths;

public class TwoRectanglesOverlap {

    public static void main(String[] args) {
        TwoRectanglesOverlap twoRectanglesOverlap = new TwoRectanglesOverlap();
        int A = 0;
        int B = 0;

        int C = 4;
        int D = 4;

        int E = 2;
        int F = 2;

        int G = 6;
        int H = 6;

        int result = twoRectanglesOverlap.solve(A, B, C, D, E, F, G, H);
        System.out.println(result);
    }

    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        // check for not overlapping, if true return 0
        if ((C <= E) || (A >= G) || (B >= H) || (D <= F)) {
            return 0;
        }
        return 1;
    }
}
