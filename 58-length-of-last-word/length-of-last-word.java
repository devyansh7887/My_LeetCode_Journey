class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split("\\s+");//this would remove extra space.
        char[] last = arr[arr.length-1].toCharArray();
        return last.length;
    }
}