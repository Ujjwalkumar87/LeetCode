class Solution {
    public void sub(List<Integer> list , int[] nums , int i , List<List<Integer>> result){
        if(i == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        sub(list , nums , i + 1 , result); // pick
        list.remove(list.size() - 1);
        sub(list , nums , i + 1 , result); // skip
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        sub(new ArrayList<>() , nums , 0 , result);
        return result;
    }
}