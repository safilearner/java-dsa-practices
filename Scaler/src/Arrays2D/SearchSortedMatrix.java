package Arrays2D;

public class SearchSortedMatrix {
    public static void main(String[] args) {
        int[][] A = {{2, 8, 8, 8}, {2, 8, 8, 8}, {2, 8, 8, 8}};
        int[][] A1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B = 8;
        SearchSortedMatrix searchSorted = new SearchSortedMatrix();
        int result = searchSorted.solve(A, B);
        //System.out.println(result);
        //result = searchSorted.solve(A1, 2);
        //System.out.println(result);
        result = searchSorted.solution(A, B);
        System.out.println(result);
        result = searchSorted.solution(A1, 2);
        System.out.println(result);
    }

    // SOLUTION 1: Will work for duplicate B values
    public int solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;

        int i = 0;
        int j = M - 1;
        int result = Integer.MAX_VALUE;
        while (i < N && j >= 0) {
            if (A[i][j] == B) {
                int ans = (i + 1) * 1009 + (j + 1);
                if (ans < result) {
                    result = ans;
                }
            }
            if (A[i][j] < B) {
                i++;
            } else {
                j--;
            }
        }
        if (result != Integer.MAX_VALUE) {
            return result;
        }
        return -1;
    }


    // SOLUTION 2
    public int solution(int[][] A, int B) {
        int ans = -1;
        int N = A.length;
        int M = A[0].length;

        int i = 0;
        int j = M - 1;
        while (i < N && j >= 0) {
            // if the value is greater than B, skip column(ie) decrease column
            if (A[i][j] > B) {
                j--;
                // if the value is lesser than B. skip the row(ie) increase the row
            } else if (A[i][j] < B) {
                i++;
                // if the value is equal to B, iterate from current j to 0
                // iterating the row because if there is duplicate values, we have to find the lower index
            } else {
                for (int k = j; k >= 0; k--) {
                    if (A[i][k] == B) {
                        ans = (i + 1) * 1009 + (k + 1);
                    }
                }
                break;
            }
        }
        return ans;
    }

}
