class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int total = 0;
        for(int i : stones) total += i;

        int tar = total/2;
        boolean[] dp = new boolean[tar+1];
        dp[0] = true;
        for(int i=0;i<n;i++){
            for(int j=tar;j>=stones[i];j--){
                if(dp[j-stones[i]]){
                    dp[j] = true;
                }
            }
        }

        for(int i=tar;i>=0;i--){
            if(dp[i]) return total - 2*i;
        }
        return tar;
    }
}