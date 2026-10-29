class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            boolean f1 = true;
            boolean f2 = true;
            boolean f3 = true;
            char[] arr = words[i].toCharArray();
            for(int j = 0; j < arr.length; j++){
                if(!s1.contains("" + arr[j])) f1 = false;
                if(!s2.contains("" + arr[j])) f2 = false;
                if(!s3.contains("" + arr[j])) f3 = false;
            }
            if(f1 || f2 || f3) ans.add(words[i]);
        }
        return ans.toArray(new String[0]);
    }
}