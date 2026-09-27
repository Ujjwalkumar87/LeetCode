class Solution {
    public int findMin(int[] nums) {
        // if(nums.length == 1) return nums[0];
        // if(nums.length == 2) return nums[1];
        // int low = 0;
        // int high = nums.length - 1;
        // while(low <= high){
        //     int mid = low + (high - low)/2;
        //     if(nums[mid] < nums[mid-1] && nums[mid] < nums[mid+1]) return nums[mid];
        //     else if(nums[mid] < nums[mid + 1]) low = mid + 1;
        //     else high = mid - 1;
        // }
        // return 12;

        int low = 0;
        int high = nums.length - 1;
        while(low < high){ // <
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[high]) low = mid + 1;
            else high = mid;
        }
        return nums[low];
    }
}