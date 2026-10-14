class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int ele : nums){
            max = Math.max(max , ele);
        }
        int i = 0 , j = 0;
        int maxcount = 0;
        long count = 0;
        while(j < nums.length){
            if(nums[j] == max){
                maxcount++;
            }
            j++;
            while(maxcount >= k){
                count += nums.length - j + 1;
                if(nums[i] == max){
                    maxcount--;
                }
                i++;
            }
        }
        return count;
    }
}