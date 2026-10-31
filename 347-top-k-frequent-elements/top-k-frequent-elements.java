class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        Integer[] keys = map.keySet().toArray(new Integer[0]);
        Arrays.sort(keys, (a,b) -> Integer.compare(map.get(b) , map.get(a)));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys[i]; // Integer automatically unboxes to int
        }
        return result;
    }
}