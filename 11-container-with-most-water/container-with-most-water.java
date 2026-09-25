class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0 , r = n - 1;
        int w = 0;
        int h = 0;
        int area = 1;
        int max = Integer.MIN_VALUE;
        while(l < r){
            w = r - l;
            h = Math.min(height[l] , height[r]);
            area = w * h;
            max = Math.max(max , area);
            if(height[l] < height[r]) l++;
            else r--;
        }
        return max;

        //TLE
        // int max = Integer.MIN_VALUE;
        // int area = 1;
        // for(int i = 0; i < height.length; i++){
        //     int width = 0;
        //     int ht = 0;
        //     for(int j = i; j < height.length; j++){
        //         width = j - i;
        //         ht = Math.min(height[i] , height[j]);
        //         area = width * ht;
        //         max = Math.max(max , area);
        //     }
        // }
        // return max;
    }
}