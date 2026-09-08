class Solution {
    public int mirrorDistance(int n) {
        int og = n;
        int r = 0;
        while(n > 0){
            r *= 10;
            r += n % 10;
            n /= 10;
        }
        int diff = og - r;
        if(diff < 0) diff *= -1;
        return diff;
    }
}