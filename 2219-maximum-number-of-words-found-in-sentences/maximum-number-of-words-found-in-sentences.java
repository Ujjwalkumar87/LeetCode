class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount = Integer.MIN_VALUE;
        int count;
        for(int i = 0; i < sentences.length; i++){
            String[] st = sentences[i].split(" ");
            count = st.length;
            if (maxcount < count) {
                maxcount = count;
            }
        }
        return maxcount;
    }
}