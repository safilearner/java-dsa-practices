package ArraysNMaths;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        ExcelColumnNumber excelCol = new ExcelColumnNumber();
        int result = excelCol.titleToNumber("ABC");
        int result1 = excelCol.titleToNumberI("ABC");
        System.out.println(result);
        System.out.println(result1);
    }

    public int titleToNumber(String A) {
        int res = 0;
        int len = A.length();
        for (int i = 0; i < len; i++) {
            res = res * 26;
            res = res + A.charAt(i) - 'A' + 1;
        }
        return res;
    }

    public int titleToNumberI(String A) {
        int res = 0;
        int len = A.length();
        for (int i = 0; i < len; i++) {
            res = (int) (res + (A.charAt(i) - 'A' + 1) * Math.pow(26, len - 1 - i));
        }
        return res;
    }
















    public int solve1()
    {
        return 1;
    }

}
