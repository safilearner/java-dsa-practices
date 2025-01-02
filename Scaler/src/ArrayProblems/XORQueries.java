package ArrayProblems;

import java.util.ArrayList;

public class XORQueries {

    public static void main(String[] args) {
        XORQueries xQueries = new XORQueries();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(0);
        A.add(1);
        A.add(0);
        A.add(0);
        A.add(0);
        A.add(1);
        A.add(1);

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<Integer> W = new ArrayList<>();
        W.add(2);
        W.add(4);
        B.add(W);
        ArrayList<Integer> X = new ArrayList<>();
        X.add(1);
        X.add(5);
        B.add(X);
        ArrayList<Integer> Y = new ArrayList<>();
        Y.add(3);
        Y.add(5);
        B.add(Y);
        ArrayList<Integer> Z = new ArrayList<>();
        Z.add(2);
        Z.add(6);
        B.add(Z);

        ArrayList<ArrayList<Integer>> result = xQueries.solve(A, B);
        for (ArrayList<Integer> aList : result) {
            for (int ans : aList) {
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int N = A.size();

        // create prefix sum array to count the number of 1's from left
        ArrayList<Integer> countList = new ArrayList<>();
        countList.add(A.get(0));
        for (int i = 1; i < N; i++) {
            countList.add(A.get(i) + countList.get(i - 1));
        }

        //System.out.println(countList.toString());

        // create prefix XOR
        ArrayList<Integer> xorList = new ArrayList<>();
        xorList.add(A.get(0));
        for (int i = 1; i < N; i++) {
            xorList.add(A.get(i) ^ xorList.get(i - 1));
        }

        //System.out.println(xorList.toString());

        for (int i = 0; i < B.size(); i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < B.get(i).size(); j++) {
                // get L and R
                int L = B.get(i).get(j);
                j++;
                int R = B.get(i).get(j);
                int length = R - L + 1;
                temp.add(xorList.get(R - 1) ^ xorList.get(L - 1) ^ A.get(L - 1));

                int cntZeros = countList.get(R - 1) - countList.get(L - 1) + A.get(L - 1);
                temp.add(length - cntZeros);
            }
            result.add(temp);
        }
        return result;
    }


}
