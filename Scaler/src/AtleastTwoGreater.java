import java.util.ArrayList;

public class AtleastTwoGreater {

    public static void main(String[] args) {
        AtleastTwoGreater atleast2 = new AtleastTwoGreater();
        int[] A = {1, 2, 3, 5, 4};
        int[] result = atleast2.solve(A);
        for(int x : result)
        {
            System.out.print(x + " ");
        }

        ArrayList<Integer> aList = new ArrayList<>();
        for(int X: A)
        {
            aList.add(X);
        }

        ArrayList<Integer> result1 = new ArrayList<>();
        result1 = atleast2.solve(aList);

        System.out.println(result1.toString());



    }

    public int[] solve(int[] A) {
        int N = A.length;
        int[] result = new int[N - 2];
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (firstMax < A[i]) {
                secondMax = firstMax;
                firstMax = A[i];
            } else if (secondMax < A[i]) {
                secondMax = A[i];
            }
        }

        int j = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] != firstMax && A[i] != secondMax) {
                result[j] = A[i];
                j++;
            }
        }

        return result;
    }


    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();
        // initialize first greatest with integer min, so that we can check for the max element
        int firstGreatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;
        // find first and second greatest
        for (int i = 0; i < N; i++) {
            if (A.get(i) > firstGreatest) {
                secondGreatest = firstGreatest;
                firstGreatest = A.get(i);
            } else if (A.get(i) > secondGreatest) {
                secondGreatest = A.get(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (A.get(i) != firstGreatest && A.get(i) != secondGreatest) {
                result.add(A.get(i));
            }
        }

        return result;
    }
}
