class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[2];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2;i<cost.length;i++){
            int costSt= cost[i]+Math.min(dp[0],dp[1]);
            dp[0] = dp[1];
            dp[1] = costSt;
        }

        return Math.min(dp[0],dp[1]);
    }
}
