class Solution {
    public int subarraySum(int[] nums, int k) {
        //<----------USING THE HASH AND PREFIX SUM APROACH------------->
        // HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            int psum = 0;
            for(int j = i; j<n; j++){
                psum += nums[j];
                if(psum == k) count++;
            }
        }
        return count;
    }
}