package Bits;

public class Add2BinaryStrings {

    public static void main(String[] args) {
        Add2BinaryStrings add2Binary = new Add2BinaryStrings();
        String A = "1101";
        String B = "11";
        String output = add2Binary.addBinary(A, B);
        System.out.println(output);
        String output2 = add2Binary.addBinary2(A,B);
        System.out.println(output2);
    }

    public String addBinary(String A, String B) {
        String result = "";
        int aLen = A.length() - 1;
        int bLen = B.length() - 1;
        int carry = 0;
        while (aLen >= 0 || bLen >= 0 || carry == 1) {
            int sum = 0;
            if (aLen >= 0) {
                sum = sum + A.charAt(aLen) - '0';
                aLen--;
            }

            if (bLen >= 0) {
                sum = sum + B.charAt(bLen) - '0';
                bLen--;
            }

            sum = sum + carry;

            int digit = sum % 2;
            carry = sum / 2;

            result = digit + result;
        }
        return result;
    }

    public String addBinary2(String A, String B) {
        String result = "";
        int aLen = A.length();
        int bLen = B.length();
        int maxLen = Math.max(aLen, bLen);
        int carry = 0;
        for (int i = 0; i < maxLen; i++) {
            int sum = 0;
            int X = i < aLen ? A.charAt(aLen - 1 - i) - '0' : 0;
            int Y = i < bLen ? B.charAt(bLen - 1 - i) - '0' : 0;
            sum = X + Y + carry;
            int digit = sum % 2;
            carry = sum / 2;
            result = digit + result;
        }
        return carry > 0 ? carry + result : result;
    }
}
