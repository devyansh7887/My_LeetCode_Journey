class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0; int sum = 0;
        for(int i : nums){
            sum += i;
            int rem = ((sum%k)+k)%k;
            count += map.getOrDefault(rem,0);
            map.put(rem, map.getOrDefault(rem, 0)+ 1);
        }
        return count;
    }
}