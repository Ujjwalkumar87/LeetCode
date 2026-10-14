class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];
        for(String word : arr){
            int index = word.charAt(word.length() - 1) - '0' - 1;
            ans[index] = word.substring(0 , word.length() - 1);
        }
        return String.join(" " , ans);
    }
}