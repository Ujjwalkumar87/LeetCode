class Solution {
    public void reverseString(char[] s) {
        int i = 0 , j = s.length - 1;
        while(i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
        // int j = 0;
        // for(int i = s.length - 1; i >=0; i--){
        //     s[j] = s[i];
        //     j++;
        // }