class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for(int i = 0; i < sentence.length(); i++){ // sentence.length() not -1
            freq[sentence.charAt(i) - 'a']++;
        }
        for(int i = 0; i < freq.length; i++){
            if(freq[i] < 1) return false;
        }
        return true;
    }
}