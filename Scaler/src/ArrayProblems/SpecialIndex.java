package ArrayProblems;

public class SpecialIndex {

    public static void main(String[] args) {
        SpecialIndex specIndex = new SpecialIndex();
        int[] A = {2, 1, 6, 4};
        int result = specIndex.solution(A);
        System.out.println(result);

        int[] B = {1, 1, 1};
        result = specIndex.solution(B);
        System.out.println(result);
    }


    // NOTE: THIS SOLUTION HAS AN ERROR!!!!!!!!!!!!!!!!!!!!!!
    public int solve(int[] A) {
        int N = A.length;

        // initialize even prefix and odd prefix
        int[] oddPF = new int[N];
        int[] evenPF = new int[N];

        oddPF[0] = 0;
        evenPF[0] = A[0];

        // create prefix arrays for even index sum and odd index sum
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                evenPF[i] = evenPF[i - 1] + A[i];
                oddPF[i] = oddPF[i - 1];
            } else {
                oddPF[i] = oddPF[i - 1] + A[i];
                evenPF[i] = evenPF[i - 1];
            }
        }

        int evenSum;
        int oddSum;
        int equalCount = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                evenSum = evenPF[N - 1];
                oddSum = oddPF[N - 1];
            } else {
                evenSum = evenPF[i - 1] + (oddPF[N - 1] - oddPF[i]);
                oddSum = oddPF[i - 1] + (evenPF[N - 1] - evenPF[i]);
            }
            if (oddSum == evenSum) {
                equalCount++;
            }
        }
        return equalCount;
    }

    public int solution(int[] A) {
        int N = A.length;
        int totalCount = 0;
        int[] evenPf = new int[N];
        int[] oddPf = new int[N];

        // construct odd and even prefix sum
        evenPf[0] = A[0];
        oddPf[0] = 0;

        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                evenPf[i] = evenPf[i - 1] + A[i];
                oddPf[i] = oddPf[i - 1];
            } else {
                evenPf[i] = evenPf[i - 1];
                oddPf[i] = oddPf[i - 1] + A[i];
            }
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                evenSum = oddPf[N - 1];
                oddSum = evenPf[N - 1] - evenPf[0];
            } else {
                evenSum = evenPf[i - 1] + (oddPf[N - 1] - oddPf[i]);
                oddSum = oddPf[i - 1] + (evenPf[N - 1] - evenPf[i]);
            }
            if (evenSum == oddSum) {
                totalCount++;
            }
        }
        return totalCount;
    }
}
