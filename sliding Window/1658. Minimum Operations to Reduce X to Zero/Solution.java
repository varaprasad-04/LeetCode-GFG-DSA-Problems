class Solution {
    int largest_subarray(int nums[],int k){
        int l=0,r=0,maxlen=-1,sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>k && l<=r){
                sum-=nums[l];
                l++;
            }
            if(sum==k)maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int ele:nums)sum+=ele;
        if(x>sum)return -1;
        int tar=sum-x;
        int maxlen=largest_subarray(nums,tar);
        if(maxlen==-1)return -1;
        return nums.length-maxlen;
    }
}