class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int num : nums2){
            list2.add(num);
        }
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < list2.size(); j++){
                if(nums1[i] == list2.get(j)){
                     ans.add(nums1[i]);
                     list2.remove(j);
                     break;
                }
            }
        }
        int[] arr = new int[ans.size()];
        for(int k = 0; k < ans.size(); k++){
            arr[k] = ans.get(k);
        }
        return arr;
    }
}