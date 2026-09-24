class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 , high = 0;
        for(int pile : piles) high = Math.max(high, pile);

        while(low <= high){
            int mid = low + (high - low)/2;
            if(isValid(piles , h , mid)) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
    public boolean isValid(int[] piles , int h , int speed){
            long noh = 0;
            for(int pile : piles){
                if((pile % speed) == 0) noh += (pile / speed);
                else noh += (pile / speed) + 1;
            }
            return noh <= h;
        }
}