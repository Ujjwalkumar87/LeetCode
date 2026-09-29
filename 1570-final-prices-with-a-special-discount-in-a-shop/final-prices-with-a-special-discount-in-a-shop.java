class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        for(int i = prices.length - 1; i >= 0; i--){
            while(st.size() > 0 && prices[i] < st.peek()) st.pop();
            if(st.size() == 0) st.push(prices[i]);
            else{
                int val = prices[i];
                prices[i] -= st.peek(); // prices[i]
                st.push(val);
            }
        }
        return prices;
    }
}