class Solution {
    public boolean prime(int n){
        if(n <= 1) return false;
        for(int i = 2; i*i <= n; i++){ //i <= rootn
            if(n % i == 0) return false;
        }
        return true;
    }
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        for(int i = 2; i <= n; i++){
            if(prime(i)){
                if(sum + i > s) break;
                ans.add(i);
                sum += i;
            }
        }
        return ans;
    }
}