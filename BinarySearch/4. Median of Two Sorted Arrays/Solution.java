class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        if(n2<n1)return findMedianSortedArrays(nums2,nums1);
        int low=0,high=n1;
        int tot=(n1+n2+1)/2;
        while(low <= high){
            int m=(low+high)/2;
            int left=tot-m;
            int l1=Integer.MIN_VALUE,r1=Integer.MAX_VALUE;
            int l2=Integer.MIN_VALUE,r2=Integer.MAX_VALUE;
            if(m <n1)r1=nums1[m];
            if(left <n2)r2=nums2[left];
            if(m-1 >=0 )l1=nums1[m-1];
            if(left-1>=0)l2=nums2[left-1];
            if(l1<=r2 && l2 <= r1){
                if((n1+n2)%2==1)return (double)(Math.max(l1,l2));
                else return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            }
            else if(l1 > r2)high=m-1;
            else low=m+1;
        }
        return -1;
    }
}