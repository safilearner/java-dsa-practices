package ArraysNMaths;

import java.util.Arrays;

public class Concatenate3Numbers {

    public static void main(String[] args) {

        Concatenate3Numbers concat = new Concatenate3Numbers();
        int A = 10;
        int B = 40;
        int C = 20;
        int result = concat.solve(A, B, C);
        System.out.println(result);
        result = concat.solveI(A, B, C);
        System.out.println(result);

    }

    public int solve(int A, int B, int C) {
        int[] inpArr = new int[3];
        inpArr[0] = A;
        inpArr[1] = B;
        inpArr[2] = C;
        Arrays.sort(inpArr);
        String temp = String.valueOf(inpArr[0]) + String.valueOf(inpArr[1]) + String.valueOf(inpArr[2]);
        return Integer.parseInt(temp);
    }

    public int solveI(int A, int B, int C) {
        int[] inputArr = {A, B, C};
        Arrays.sort(inputArr);
        return 10000 * inputArr[0] + 100 * inputArr[1] + inputArr[2];
    }

}
