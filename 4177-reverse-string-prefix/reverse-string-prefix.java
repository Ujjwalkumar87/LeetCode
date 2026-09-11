class Solution {
    public String reversePrefix(String s, int k) {
        // string to char array
        char[] arr = s.toCharArray();
        int i = 0;
        int j = k - 1;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // convert back to string
        return new String(arr);
    }
}