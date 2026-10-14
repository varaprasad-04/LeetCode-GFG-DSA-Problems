class Solution {
    public int distinctSubseqII(String s) {
        int dp[]=new int[26];
        long mod=1000000007;
        for(char c:s.toCharArray()){
            int index=c-'a';
            long count=0;
            for(int co:dp){
                count+=co%mod;
            }
            dp[index]=(int)((count+1)%mod);
        }
        long ans=0;
        for(int ind:dp){
            ans=(ans+ind)%mod;
        }
        return (int)ans;
    }
}