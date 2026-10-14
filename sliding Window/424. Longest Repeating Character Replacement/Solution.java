class Solution {
    public int characterReplacement(String s, int k) {
        s=s.toLowerCase();
        int maxfreq=Integer.MIN_VALUE;
        int l=0,r=0,maxlen=Integer.MIN_VALUE;
        int freq[]=new int[26];
        while(r<s.length()){
            char ch=s.charAt(r);
            freq[ch-'a']++;
            maxfreq=Math.max(maxfreq,freq[ch-'a']);
            if((r-l+1)-maxfreq >k){
                freq[s.charAt(l)-'a']--;
                l++;
            }
            maxlen=Math.max(r-l+1,maxlen);
            r++;
        }
        return maxlen;
    }
}