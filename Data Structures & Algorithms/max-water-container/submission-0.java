class Solution {
    public int maxArea(int[] heights) {
        int maxAmount = 0;
        int i=0 , j = heights.length-1;
        while(i<j){
            int area = Math.min(heights[i] , heights[j])*(j-i);
            maxAmount = Math.max(maxAmount,area);
            if(heights[i] <= heights[j]){
                i++;
            } else {
                j--;
            }
        }
        return maxAmount;
    }
}
