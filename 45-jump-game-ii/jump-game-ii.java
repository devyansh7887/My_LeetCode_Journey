class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0, curEnd = 0, far = 0;
        for(int i = 0; i<n-1; i++){
            far = Math.max(far, i + nums[i]);
            if(i == curEnd){
                jumps++;
                curEnd = far;
            }
        }
        return jumps;
    }
}