class Solution {
    public int helper(StringBuilder sb1,StringBuilder sb2,int i,int j,int[][] dp){
        if(i < 0 || j < 0)return 0;

        if(dp[i][j] != -1) return dp[i][j];
        if(sb1.charAt(i) == sb2.charAt(j)){
            return dp[i][j] = 1+helper(sb1,sb2,i-1,j-1,dp);
        } else {
            return dp[i][j] = Math.max(helper(sb1,sb2,i-1,j,dp) , helper(sb1,sb2,i,j-1,dp));
        }

    }
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder sb1 = new StringBuilder(text1);
        StringBuilder sb2 = new StringBuilder(text2);

        int n = sb1.length() , m = sb2.length();
        int[][] dp = new int[n][m];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return helper(sb1,sb2,n-1,m-1,dp);
    }
}
