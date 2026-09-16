class Solution {
    // recursion
    public static int helper(int[] nums , int target , int low , int high){
        if(low > high) return -1;
        int mid = low + (high - low)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return helper(nums , target , low , mid - 1);
        else return helper(nums , target , mid + 1 , high);
    }
    public int search(int[] nums, int target) {
        //  int n = nums.length;
        // int left = 0;
        // int right = n - 1;
        // while (left <= right){
        //     int mid = (left + right)/2;
        //     if(nums[mid] == target) return mid;
        //     else if(nums[mid] < target) left = mid + 1;
        //     else right = mid - 1;
        // }
        // return -1;

        // by recursion 
        int n = nums.length;
        return helper(nums , target , 0 , n - 1);
    }
}