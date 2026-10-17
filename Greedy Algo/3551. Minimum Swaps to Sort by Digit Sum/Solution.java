class Solution {
    int digits(int a){
        int sum=0;
        while(a!=0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n=nums.length;
        Integer sorted[]=new Integer[n];
        for(int i=0;i<n;i++)
            sorted[i]=nums[i];
        Arrays.sort(sorted,(a,b)->{
            int s1=digits(a),s2=digits(b);
            if(s1!=s2)return Integer.compare(s1,s2);
            return Integer.compare(a,b);
        });
        HashMap<Integer,Integer>pos=new HashMap<>();
        for(int i=0;i<n;i++)
            pos.put(sorted[i],i);
        int cycles=0;
        boolean visit[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visit[i]){
                cycles++;
                int j=i;
                while(!visit[j]){
                    visit[j]=true;
                    j=pos.get(nums[j]);
                }
            }
        }
        return n-cycles;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {21, 12, 30, 4};
        int result = sol.minSwaps(nums);
        System.out.println(result); // Output: 2
    }
}