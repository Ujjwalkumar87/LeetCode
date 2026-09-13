class Solution {
    public int minElement(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            int sum = 0;
            while(temp > 0){
                sum += temp % 10;
                temp /= 10;
            }
            arr[i] = sum;
        }
        int min = Integer.MAX_VALUE;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] < min) min = arr[j];
            }
        return min;
    }
}