class Solution {
    public int helper(int[] nums,int i,int[] dp){
        if(i>=nums.length) return 0;
        if(dp[i] != -1) return dp[i];

        return dp[i] = Math.max(nums[i]+helper(nums,i+2,dp) , helper(nums,i+1,dp));
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return helper(nums,0,dp);
    }
}
