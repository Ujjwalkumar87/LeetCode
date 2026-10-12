class Solution {
    public boolean threeFibonacciSum(int n) {
        int a = 0 , b = 1 , c = 1;
        while(a + b + c <= n){
            if(a + b + c == n) return true;
            else{
                int temp = c + b;
                a = b;
                b = c;
                c = temp;
            }
        }
        return false;
    }
}