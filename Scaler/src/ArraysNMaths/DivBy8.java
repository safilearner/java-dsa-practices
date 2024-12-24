package ArraysNMaths;

public class DivBy8 {
    public static void main(String[] args) {
        DivBy8 divBy8 = new DivBy8();
        String A = "3888";
        String B = "777";
        String C = "43888";
        String D = "543888";

        int ans = divBy8.solve("1000");
        System.out.println(ans);

        int ans1 = divBy8.solve1("16");
        System.out.println(ans1);

    }

    public int solve(String A) {
        int len = A.length();
        String S = "";
        if (len > 3) {
            for (int i = len - 1; i > len - 1 - 3; i--) {
                S = A.charAt(i) + S;
            }
        } else {
            S = A;
        }

        if (S.equals("000")) {
            return 1;
        }

        int X = Integer.parseInt(S);

        if (X % 8 == 0) {
            return 1;
        }
        return 0;
    }


    public int solve1(String A) {
        int N = A.length();
        if (N == 1) {
            if ((A.charAt(0) - '0') % 8 == 0) {
                return 1;
            }
            return 0;
        }
        if (N == 2) {
            int X = ((A.charAt(0) - '0') * 10 + A.charAt(1) - '0');
            if (X % 8 == 0) {
                return 1;
            }
            return 0;
        }

        int Y = A.charAt(N - 1) - '0' + (A.charAt(N - 2) - '0') * 10 + (A.charAt(N - 3) - '0') * 10 * 10;

        if (Y % 8 == 0) {
            return 1;
        }

        return 0;
    }
}
