class Solution {
    public int numDistinct(String s, String t) {
        int t2=t.length(),s2=s.length();
        int dp[][]=new int[s2+1][t2+1];
        for(int i=0;i<s2+1;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=s2;i++){
            for(int j=1;j<=t2;j++){
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                else dp[i][j]=dp[i-1][j];
            }

        }
        return dp[s2][t2];
    }
}