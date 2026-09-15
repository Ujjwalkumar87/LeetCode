class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String join1 = String.join("" , word1);
        String join2 = String.join("" , word2);
        return join1.equals(join2);
    }
}