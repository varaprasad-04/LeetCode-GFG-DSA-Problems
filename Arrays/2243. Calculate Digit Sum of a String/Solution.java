class Solution {
    public String digitSum(String s, int k) {
        int n=s.length();
        if(n<=k)return s;
        StringBuilder s1=new StringBuilder();
 
        for(int i=0;i<n;i+=k){
            int sum=0;
            for(int j=0;j<k;j++){
                if(j+i<n)
                    sum+=s.charAt(i+j)-'0';
            }
            s1.append(sum);
        }
        String rem=s1.toString();

       return digitSum(rem,k);
    }
}