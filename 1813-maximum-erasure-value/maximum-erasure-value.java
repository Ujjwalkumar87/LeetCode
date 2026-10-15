class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i = 0 , j = 0;
        int sum = 0;
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        while(j < nums.length){
            if(!set.contains(nums[j])){
                set.add(nums[j]);
                sum += nums[j];
                j++;
            }
            else{
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            max = Math.max(max , sum);
        }
        return max;
    }
}