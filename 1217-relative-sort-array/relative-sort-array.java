class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer , Integer> map = new HashMap();
        for(int ele : arr1){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele , freq + 1);
            }
            else map.put(ele , 1);
        }
        int[] ans = new int[arr1.length];
        int j = 0;
        for(int i = 0; i < arr2.length; i++){
            int freq = map.get(arr2[i]);
            while(freq > 0){
                ans[j] = arr2[i];
                j++;
                freq--;
            }
            map.put(arr2[i] , 0);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            while(freq > 0){
                list.add(ele);
                freq--;
            }
        }
        Collections.sort(list);
        for(int ele : list){
            ans[j] = ele;
            j++;
        }
        return ans;
    }
}