class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // <USING HASHMAPS>
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through the array
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Iterate through the map
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > n/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}