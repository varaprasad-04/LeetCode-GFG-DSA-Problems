class Solution {
    public int maximumSubarray(int[] arr) {
        int nor=arr[0];
        int sqr=arr[0]*arr[0],ans=Math.max(nor,sqr);
        for(int i=1;i<arr.length;i++){
            int val=arr[i];
            int sq=arr[i]*arr[i];
            int newsqr=Math.max(Math.max(nor+sq,sqr+val),sq);
            int newnor=Math.max(val,val+nor);
            
            nor=newnor;
            sqr=newsqr;
            ans=Math.max(ans,Math.max(nor,sqr));
            
        }
        return ans;
        
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {-1, -2, 3, -2, 3};
        System.out.println(sol.maximumSubarray(arr1)); // Output: 10

        int[] arr2 = {-4, -4, -2, 5, 2, -1};
        System.out.println(sol.maximumSubarray(arr2)); // Output: 27
    }
}