class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num*9 || (sum==0 && num>1))
            return "";
        if(sum==0)return "0";
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<num;i++){
            int n=Math.min(9,sum);
            ans.append(n);
            sum-=n;
        }
        return sum==0?ans.toString():"";
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 3;
        int sum = 20;
        String result = sol.maxSumOfSquares(num, sum);
        System.out.println(result); // Output: "992"
    }
}