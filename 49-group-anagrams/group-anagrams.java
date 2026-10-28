class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String, List<String>> group = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            group.computeIfAbsent(key, k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(group.values());
    }
}