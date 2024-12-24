package ArraysNMaths;

public class ModString {
    public static void main(String[] args) {
        ModString modString = new ModString();
        String A = "43535321";
        int B = 47;
        int result = modString.Solve1(A, B);
        System.out.println(result);
    }

    public int Solve(String A, int B) {
        int N = A.length();
        int pow = 1;
        int res = 0;
        for (int i = N - 1; i >= 0; i--) {
            res = (A.charAt(i) - '0') * pow + res;
            res = res % B;
            pow = pow * 10;
            pow = pow % B;
        }
        return res;
    }

    public int Solve1(String A, int B) {
        int N = A.length();
        long power = 1;
        long res = 0;
        for (int i = N - 1; i >= 0; i--) {
            long digit = A.charAt(i) - '0';
            long product = (digit * power) % B;
            res = (res + product) % B;
            power = (power * 10) % B;
        }
        return (int) res;
    }

}
