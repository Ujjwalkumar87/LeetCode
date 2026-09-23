class Solution {
    public int majorityElement(int[] arr) {
        Arrays.sort(arr);
        int i = 0 , j= 0;
        int max = 0;
        int freq = 0;
        int maxf = arr[0];
        while(j < arr.length){
            if(arr[i] == arr[j]) j++;
            else{
                freq = j - i;
                if(freq > max){
                    max = freq;
                    maxf = arr[i];
                }
                i = j;
            }
        }
                freq = j - i;
                if(freq > max){
                    max = freq;
                    maxf = arr[i];
                }
                return maxf;
    }
}