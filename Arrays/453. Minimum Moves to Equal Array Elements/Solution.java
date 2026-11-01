class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int ele:nums){
            min=Math.min(min,ele);
        }
        int sum=0;
        for(int ele:nums){
            sum+=ele-min;
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        System.out.println(sol.minMoves(nums)); // Output: 3
    }   
}