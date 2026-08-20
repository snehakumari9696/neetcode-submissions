class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        int case1= helper(nums, 0, nums.length-2);
        int case2= helper(nums, 1, nums.length-1);

        return Math.max(case1, case2);
    }

    private int helper(int[]nums , int start , int end){
        if(start==end){
            return nums[start];
        }

        int n= end-start+1;
        int[]dp = new int[n];

        dp[0]= nums[start];
        dp[1]= Math.max(nums[start], nums[start+1]);

        for(int i=2; i<n; i++){
            dp[i]= Math.max(nums[start+i]+dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }
}
