class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] arr = new int[matrix.length];
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                sum += matrix[i][j];
                arr[i] = sum;
            }
            sum = 0;
        }
        return arr;
    }
}