class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        // set row to 0
        for(int r : rows){
            for(int j = 0; j < m; j++){
            matrix[r][j] = 0;
            }
        }
        // set cols to 0
        for(int c : cols){
            for(int i = 0; i < n; i++){
            matrix[i][c] = 0;
            }
        }
    }
}