class Solution {
    public int minOperations(String s) {
        int n=s.length();
        
        boolean sorted=true;
        char min=s.charAt(0),max=s.charAt(0);
        for(int i=1;i<n;i++){
            if(s.charAt(i)<s.charAt(i-1))sorted=false;
            if(s.charAt(i)<min)min=s.charAt(i);
            if(s.charAt(i)>max)max=s.charAt(i);
        }
        if(sorted)return 0;
        if(n==2)return -1;
        if(min==s.charAt(0) || max==s.charAt(n-1))return 1;
        for(int i=1;i<=n-2;i++)
            if(min==s.charAt(i) || max==s.charAt(i))
                return 2;
        return 3;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        String str="cba";
        System.out.println(s.minOperations(str));
    }   
}