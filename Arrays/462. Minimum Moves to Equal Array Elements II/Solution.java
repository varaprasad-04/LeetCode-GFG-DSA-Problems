import java.util.Arrays;
class Solution {
    public int minMoves2(int[] nums) {
        int median=0,n=nums.length,ans=0;
        Arrays.sort(nums);
        if(n%2!=0)
            median=nums[n/2];
        else median=(nums[(n/2)-1]+nums[(n/2)])/2;
        for(int ele:nums){
            ans+=Math.abs(median-ele);
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        System.out.println(sol.minMoves2(nums)); // Output: 2
    }   
}