class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if(k == 0) return result;
        int i , j;
        if(k > 0){
            i = 1;
            j = k;
        }
        else{
            k = -k;
            i = n - k;
            j = n - 1;
        }
        int sum = 0;
        for(int w = i; w <= j; w++){
            sum += code[w];
        }
        for(int v = 0; v < n; v++){
            result[v] = sum;

            sum -= code[i % n];
            i++;

            sum += code[(j+1) % n];
            j++;
        }
        return result;
    }
}