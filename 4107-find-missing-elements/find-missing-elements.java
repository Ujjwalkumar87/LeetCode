class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(int ele : arr){
            set.add(ele);
            max = Math.max(max , ele);
            min = Math.min(min , ele);
        }
        for(int i = min; i <= max; i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;


        // ArrayList<Integer> ans = new ArrayList<>();
        // int n = nums.length;
        // int expectedsum = n*(n+1)/2;
        // int actualsum = 0;
        // for(int i = 0; i < n; i++){
        //     actualsum += nums[i];
        // }
        // ans.add(expectedsum - actualsum);
        // return ans;
    }
}