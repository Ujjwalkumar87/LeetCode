class Solution {
    public int arraySign(int[] arr) {
        int mul = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0) mul *= -1;
            else if(arr[i] == 0) mul *= 0;
        }
        if(mul > 0) return 1;
        else if(mul < 0) return -1;
        return 0;
    }
}