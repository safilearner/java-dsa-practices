import java.util.ArrayList;

public class PatternPrintingI {
    public static void main(String[] args) {
        PatternPrintingI ppI = new PatternPrintingI();
        ArrayList<ArrayList<Integer>> result = ppI.solve(4);
        for (ArrayList<Integer> x : result) {
            for (int y : x) {
                System.out.println(y);
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int j = 1; j <= A; j++) {
                if (j <= i) {
                    tempList.add(j);
                } else {
                    tempList.add(0);
                }

            }
            result.add(tempList);
        }
        return result;
    }
}
