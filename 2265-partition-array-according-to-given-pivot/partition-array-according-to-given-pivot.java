class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less = 0;
        int pv = 0;
        int greater = 0;
        for(int ele : nums){
            if(ele < pivot) less++;
            else if(ele > pivot) greater++;
            else pv++;
        }
        int i = 0;
        int j = less;
        int k = pv + less;
        int[] arr = new int[nums.length];
        for(int ele : nums){
            if(ele < pivot){
                arr[i] = ele;
                i++;
            }
            else if(ele > pivot){
                arr[k] = ele;
                k++;
            }
            else{
                arr[j] = ele;
                j++;
            }
        }
        return arr;
    }
}