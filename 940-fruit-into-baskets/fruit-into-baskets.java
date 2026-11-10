class Solution {
    public int totalFruit(int[] fruits) {
        // hashmap

        int i = 0 , j = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Integer , Integer> map = new HashMap();
        while(j < fruits.length){
                map.put(fruits[j] , map.getOrDefault(fruits[j] , 0) + 1);
            j++;
            while(map.size() > 2){
                map.put(fruits[i] , map.get(fruits[i]) - 1);
                if(map.get(fruits[i]) == 0) map.remove(fruits[i]);
                i++;
            }
            max = Math.max(max , j - i);
        }
        return max;


        // int i = 0 , j = 0;
        // int max = Integer.MIN_VALUE;
        // HashSet<Integer> set = new HashSet<>();
        // while(j < fruits.length){
        //     if(!set.contains(fruits[j])){
        //         set.add(fruits[j]);
        //     }
        //     j++;
        //     while(set.size() > 2){
        //         set.remove(fruits[i]);
        //         i++;
        //     }
        //     max = Math.max(max , j - i);
        // }
        // return max;
    } 
}