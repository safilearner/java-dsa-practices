package ArraysNMaths;

public class LeapYear {

    public static void main(String[] args) {

    }

    public int solve(int A) {
        if ((A % 4 == 0 && A % 100 != 0) || A % 400 == 0)
            return 1;
        return 0;
    }
}
