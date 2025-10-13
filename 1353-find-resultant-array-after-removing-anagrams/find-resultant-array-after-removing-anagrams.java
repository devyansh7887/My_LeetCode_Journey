import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        String prevSorted = "";

        for (String word : words) {
            // Sort the characters of the current word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // If current word is not an anagram of the last added one
            if (!sorted.equals(prevSorted)) {
                result.add(word);
                prevSorted = sorted; // update last kept pattern
            }
        }

        return result;
    }
}
