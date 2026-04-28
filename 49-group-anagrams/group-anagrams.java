class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> str = new HashMap<>();
        for(String i : strs){
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String value = new String(chars);
            if(!str.containsKey(value)){
                str.put(value, new ArrayList<>());
            }
            str.get(value).add(i);
        }
        return new ArrayList<>(str.values());
    }
}