class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // APPROACH -> Store elements and their frequency in a map
        // Then put them in an Arraylist, sort them in decsending
        // Return the first k elements
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Convert map to list of pairs
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        // Sort
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return b.getValue() - a.getValue(); // descending
            }
        });
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}