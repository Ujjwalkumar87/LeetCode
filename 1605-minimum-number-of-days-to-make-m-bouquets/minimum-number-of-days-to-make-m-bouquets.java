class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int bloom : bloomDay){
            high = Math.max(high , bloom);
            low = Math.min(low , bloom);
        }
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isValid(bloomDay , mid , k) >= m){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public int isValid(int[] bloomDay , int mid , int k){
        int bcount = 0;
        int consecutiveflower = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                consecutiveflower++;
            }
            else consecutiveflower = 0;
            if(consecutiveflower == k){
                bcount++;
                consecutiveflower = 0;
            }
        }
        return bcount;
    }
}