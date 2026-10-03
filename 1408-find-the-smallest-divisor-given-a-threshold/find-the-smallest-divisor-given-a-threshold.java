class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int ele : nums){
            high = Math.max(high , ele);
        }
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isValid(nums , mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public int isValid(int[] nums , int divisor){
        int sum = 0;
        for(int ele : nums){
            sum += Math.ceil((double)ele/divisor);//ceil in q , double is imp because ceil if use for float
        }
        return sum;
    }
}