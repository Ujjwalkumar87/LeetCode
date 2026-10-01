class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int sum = 0;
        int windowlen = 0;
        int minwindowlen = Integer.MAX_VALUE; // imp
        int low = 0 , high = 0;
        while(high < arr.length){
            sum += arr[high];
            high++;
            while(sum >= target){
                windowlen = high - low;
                minwindowlen = Math.min(minwindowlen , windowlen);

                sum -= arr[low];
                low++;
            }
        }
        return minwindowlen == Integer.MAX_VALUE ? 0 : minwindowlen;

        // Arrays.sort(arr);
        // for (int num : arr){
        //     if (num >= target) return 1;
        // }
        // int i = 0;
        // int j = arr.length - 1;
        // while(i < j){
        //     if(arr[i] + arr[j] > target) j--;
        //     else if(arr[i] + arr[j] < target) i++;
        //     else{
        //         if(arr[i] == target) return 1;
        //         if(arr[j] == target) return 1;
        //         if(arr[i] + arr[j] == target) return 2;
        //     } 
        // }
        // return 0;
    }
}