class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        StringBuilder sb = new StringBuilder();
        int i = 0 , j = 0 , idx = 0;
        while(j < chars.length){
            if(chars[i] == chars[j]) j++;
            else {
                idx = j - i;
                sb.append(chars[i]);
                if(idx > 1) sb.append(idx);
                i = j;
            }
        }
                idx = j - i;
                sb.append(chars[i]);
                if(idx > 1) sb.append(idx);
                i = j;
                for(int k = 0; k < sb.length(); k++){ // copy is imp
                    chars[k] = sb.charAt(k);
                }
                return sb.length();
    }
}