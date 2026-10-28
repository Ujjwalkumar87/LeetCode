class Solution {
    public int lastStoneWeight(int[] stones) {
        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : stones){
            pq.add(ele);
        }
            while(pq.size() > 1){
                int x = pq.peek();
                pq.remove();
                int y = pq.peek();
                pq.remove();
            if(x != y) pq.add(x - y);
            }
        return pq.size() == 0 ? 0 : pq.peek();
    }
}