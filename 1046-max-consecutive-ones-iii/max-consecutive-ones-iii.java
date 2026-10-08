class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0 , end = 0 , zerocount = 0 ,  maxones = 0;
        while(end < nums.length){
            if(nums[end] == 0) zerocount++;
            end++;
            while(zerocount > k){
                if(nums[start] == 0) zerocount--;
                start++;
            }
            maxones = Math.max(maxones , end - start);
        }
        return maxones;
    }
}