class Solution {
    public int pivotIndex(int[] nums) {
        // 1991
        int sum = 0;
        for(int num : nums) sum += num;
        int leftsum = 0 , rightsum = sum;
        for(int i = 0; i < nums.length; i++){
            rightsum -= nums[i]; // -
            if(rightsum == leftsum) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}