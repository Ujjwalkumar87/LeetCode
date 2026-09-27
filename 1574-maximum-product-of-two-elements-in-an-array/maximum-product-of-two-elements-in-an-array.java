class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int idx = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max1){
                max1 = nums[i];
                idx = i;
            }
        }
        int max2 = Integer.MIN_VALUE;
        for(int j = 0; j < nums.length; j++){
            if(j != idx && nums[j] > max2) max2 = nums[j];
        }
        return (max1 - 1) * (max2 - 1);
    }
}