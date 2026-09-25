class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 , high = 0;
        for(int pile : piles) high = Math.max(high , pile);
        
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isValid(piles , mid) <= h){
                high = mid - 1;
                ans = mid;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public long isValid(int[] piles , int speed){
        long noh = 0;
        for(int pile : piles){
            if(pile % speed == 0) noh += pile / speed;
            else noh += (pile / speed + 1);
        }
        return noh;
    }
}