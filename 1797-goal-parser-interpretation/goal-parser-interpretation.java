class Solution {
    public String interpret(String command) {
        char[] arr = command.toCharArray();
        String s = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '(' && arr[i+1] == ')') s += 'o';
            else if(arr[i] == '(' && arr[i+1] == 'a' && arr[i+2] == 'l' && arr[i+3] == ')') s += "al";
            else if(arr[i] == 'G') s += 'G';
        }
        return s;
    }
}