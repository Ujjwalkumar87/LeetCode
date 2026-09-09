class Solution {
    public int[] concatWithReverse(int[] arr) {
        int[] ans = new int[arr.length * 2];
        for(int i = 0; i < arr.length; i++){
            ans[i] = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            ans[arr.length + (arr.length - 1 - i)] = arr[i];
        }
        return ans;
    }
}