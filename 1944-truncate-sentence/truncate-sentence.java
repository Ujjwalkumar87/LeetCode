class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String st = "";
        for(int i = 0; i < k; i++){
            st += arr[i];
            if(i < k - 1){
                st += " ";
            }
        }
        return st;
    }
}