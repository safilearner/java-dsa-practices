package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray revArray = new ReverseArray();
        int A[] = {1, 2, 3, 4, 5, 6};
        int B[] = revArray.reverseI(A);
        for (int x : B) {
            System.out.print(x + " ");
        }

    }

    public int[] reverse(final int[] A) {
        int[] B = new int[A.length];
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }

    public int[] reverseI(final int[] A) {
        int N = A.length;
        for (int i = 0; i < N / 2; i++) {
            int temp = A[i];
            A[i] = A[N - 1 - i];
            A[N - 1 - i] = temp;
        }
        return A;
    }
}
