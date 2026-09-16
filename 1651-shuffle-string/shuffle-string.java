class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        char[] arr2 = new char[arr.length];
        for(int i = 0; i < arr.length; i++){
           arr2[indices[i]] = arr[i];
        }
        return new String(arr2);
    }
}