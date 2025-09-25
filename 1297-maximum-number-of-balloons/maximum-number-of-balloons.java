import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // If any required char is missing, return 0
        if (!map.containsKey('b') ||
            !map.containsKey('a') ||
            !map.containsKey('l') ||
            !map.containsKey('o') ||
            !map.containsKey('n')) {
            return 0;
        }
        
        // Find min after adjusting counts for l and o
        int countB = map.get('b');
        int countA = map.get('a');
        int countL = map.get('l') / 2;
        int countO = map.get('o') / 2;
        int countN = map.get('n');
        
        return Math.min(
                Math.min(Math.min(countB, countA), Math.min(countL, countO)),
                countN
        );
    }
}
