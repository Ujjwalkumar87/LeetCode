class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int flips = 0;
        int flipcount = 0;
        boolean[] isflipped = new boolean[n];

        for(int i = 0; i < n; i++){
            if(i >= k && isflipped[i-k]){
                flipcount--;
            }
            if(flipcount % 2 == nums[i]){
                if(i + k > n) return -1;
                flips++;
                flipcount++;
                isflipped[i] = true;
            }
        }
        return flips;
    }
} //3191