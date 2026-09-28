class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int s1 = source[0]; // row
        int s2 = source[1]; // column
        int t1 = target[0]; // row
        int t2 = target[1]; // column

        if(s1 == t1 && s2 == t2) return 0;
        else if(s1 == t1 || s2 == t2) return 1;
        else if(Math.abs(s1 - t1) == Math.abs(s2 - t2)) return 1;
        return 2;
    }
}