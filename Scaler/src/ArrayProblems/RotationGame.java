package ArrayProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        int B = sc.nextInt();
        sc.close();

        B = B % N;

        int x = 0;
        int y = N - 1;
        // reverse the array
        while (x < y) {
            int temp = A.get(x);
            A.set(x, A.get(y));
            A.set(y, temp);
            x++;
            y--;
        }

        // reverse the sub array from
        x = 0;
        y = B - 1;
        while (x < y) {
            int temp = A.get(x);
            A.set(x, A.get(y));
            A.set(y, temp);
            x++;
            y--;
        }

        x = B;
        y = N - 1;
        while (x < y) {
            int temp = A.get(x);
            A.set(x, A.get(y));
            A.set(y, temp);
            x++;
            y--;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A.get(i) + " ");
        }
    }
}
