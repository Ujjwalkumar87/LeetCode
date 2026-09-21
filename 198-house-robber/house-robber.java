class Solution {
    public int rob(int[] arr) {
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i < arr.length; i++){
            int curr = Math.max(max2, max1 + arr[i]);
            max1 = max2;
            max2 = curr;
        }
        return max2;
    }
}