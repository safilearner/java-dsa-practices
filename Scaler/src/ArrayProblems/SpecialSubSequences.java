package ArrayProblems;

public class SpecialSubSequences {
    public static void main(String[] args) {
        String input = "ABCGAG";
        SpecialSubSequences subSequnces = new SpecialSubSequences();
        int output = subSequnces.solve1(input);
        System.out.println(output);
    }

    public int solve(String A) {
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                for (int j = i + 1; j < A.length(); j++) {
                    if (A.charAt(j) == 'G') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int solve1(String A) {
        int count = 0;
        int ans=0;
        int mod = 1000 * 1000 * 1000 + 7;

        for (int i = A.length() - 1; i >= 0; i--) {
            if (A.charAt(i) == 'G') {
                count++;
            }
            else if (A.charAt(i) == 'A') {
                ans = ans + count;
            }
        }
        int finalAns = ans % mod;
        return finalAns;
    }

    public int solve2(String A) {

        // find the Count of 'A' and iterate for 'G' once encountered incerase the ans count with count of A.
        long ans=0;
        int Acount=0;
        for(int i=0; i<A.length(); i++){
            char ch=A.charAt(i);
            if(ch=='A'){
                Acount+=1;
            }
            if(ch=='G'){
                ans+=Acount;
            }
        }
        double constant=Math.pow(10,9)+7;
        System.out.println(constant);//As per question used this caluclation
        double FinalAns=(ans)%constant;
        System.out.println(FinalAns);
        return (int) FinalAns;

    }

    public int solve3(String A) {
        int n = A.length();
        int ans = 0;
        int MOD = 1000*1000*1000 + 7;
        int cnt_G[] = new int[n];
        int count = 0;

        //Suffix count of G
        for(int i = n - 1 ; i >= 0 ; i--){
            if(A.charAt(i) == 'G')
                count = count + 1; {
            }
            cnt_G[i] = count;
        }

        // traverse the string again from beginning
        for(int i = 0; i < n; i++){
            // if current character is "A" then add number of G's after that
            if(A.charAt(i) == 'A') {
                ans = ans + cnt_G[i];
                ans = ans % MOD;
            }
        }
        return ans;
    }

}
