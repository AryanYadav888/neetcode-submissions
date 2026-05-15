class Solution {
    public void swap(int i,int j,int[] nums){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;j--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int split = nums.length-k-1;

        swap(0,split,nums);
        swap(split+1,nums.length-1,nums);
        swap(0,nums.length-1,nums);
    }
}