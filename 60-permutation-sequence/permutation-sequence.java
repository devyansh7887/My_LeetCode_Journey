import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        int[] fact = new int[n+1];
        fact[0] = 1;

        for(int i = 1; i <= n; i++){
            nums.add(i);
            fact[i] = i * fact[i-1];
        }

        k--; 
        StringBuilder sb = new StringBuilder();

        for(int i = n; i > 0; i--){
            int block = fact[i-1];
            int idx = k / block;
            sb.append(nums.get(idx));
            nums.remove(idx);
            k = k % block;
        }

        return sb.toString();
    }
}
