class Solution {
    long dps(int h){
        long dp[]=new long[h+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=h;i++){
            dp[i]=(dp[i-1]*dp[i-1]+2*dp[i-1]*dp[i-2])%1000000007;
        }
        return dp[h];
    }
    public int countBT(int h) {
        long ans=dps(h);
        return (int)ans%1000000007;
    }
}
