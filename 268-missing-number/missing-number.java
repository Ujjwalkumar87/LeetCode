class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int expectedsum = n*(n+1) / 2;
        int actualsum = 0;
        for(int ele : arr){
            actualsum += ele;
        }
        return expectedsum - actualsum;
    }
}