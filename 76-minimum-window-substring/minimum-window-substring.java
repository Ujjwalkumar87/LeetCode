class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int freq[] = new int[128];
        for(int k = 0; k < t.length(); k++){
            char c = t.charAt(k);
            freq[c]++;
        }
        int i = 0 , j = 0;
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        int count = t.length();

        while(j < s.length()){
            // exland window
            if(freq[s.charAt(j)] > 0){
                count--;
            }
            freq[s.charAt(j)]--;
            j++;
            // shrink window
            while(count == 0){
                if(j - i < minlen){
                    minlen = j-i;
                    start = i;
                }
                freq[s.charAt(i)]++;
                if(freq[s.charAt(i)] > 0){
                    count++;
                }
                i++;
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}