package Arrays;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        LeadersInArray leaders = new LeadersInArray();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(16);
        input.add(3);
        input.add(6);
        input.add(1);
        input.add(2);
        ArrayList<Integer> output = leaders.solve(input);
        for(int x : output)
        {
            System.out.print(x + " ");
        }

    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int N = A.size();
        int lastMax = A.get(N - 1);
        result.add(lastMax);
        for (int i = N - 2; i >= 0; i--) {
            if (A.get(i) > lastMax) {
                lastMax = A.get(i);
                result.add(lastMax);
            }
        }
        return result;
    }
}
