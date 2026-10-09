class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int flips = 0;
        int flipcount = 0;
        boolean[] isflipped = new boolean[n];

        for(int i = 0; i < n; i++){
            if(i >= 3 && isflipped[i-3]){
                flipcount--;
            }
            if(flipcount % 2 == nums[i]){
                if(i + 3 > n) return -1;
                flips++;
                flipcount++;
                isflipped[i] = true;
            }
        }
        return flips;
    }
} //995