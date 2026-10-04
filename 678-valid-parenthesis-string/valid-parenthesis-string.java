class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(') st1.push(i);
            else if(ch == '*') st2.push(i);
            else{ // ch == ')'
                if(st1.size() != 0) st1.pop(); // pop ( to balance )
                else if(st2.size() != 0) st2.pop(); // pop * to balance )
                else return false;
            }
        }
        while(st1.size() != 0){
            if(st2.size() == 0) return false; // if there is no * 
            else if(st1.pop() > st2.pop()) return false; // if index of ( is >= *
        }
        return st1.size() == 0; //
    }
}