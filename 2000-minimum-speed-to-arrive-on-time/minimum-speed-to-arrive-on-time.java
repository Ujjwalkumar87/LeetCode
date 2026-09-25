class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1 , high = 100000000;

        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isValid(dist , mid) <= hour){
                high = mid - 1;
                ans = mid;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public double isValid(int[] dist , int speed){
        double s = 0;
        for(int i = 0; i < dist.length; i++){
            double a = (double)dist[i] / speed;
            if(i != dist.length - 1) s += Math.ceil(a);
            else s += a;
        }
        return s;
    }
}