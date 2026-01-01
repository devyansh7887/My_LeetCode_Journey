import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        StringBuilder sb = new StringBuilder();
        for(int digit: digits){
            sb.append(digit);
        }
        BigInteger bigNums = new BigInteger(sb.toString());
        BigInteger bigNum = bigNums.add(BigInteger.valueOf(1));
        String str = bigNum.toString();
        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i) - '0';
        }
        return result;
    }
}