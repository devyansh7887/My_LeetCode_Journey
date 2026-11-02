class Solution {
    public int[] productExceptSelf(int[] nums) {
        //OPTIMAL APPROACH : PREFIX/SUFFIX SUM
        int n = nums.length;
        int[] result = new int[n];
        int p = 1;
        int s = 1;
        for(int i = 0; i<n; i++){
            result[i] = p;
            p *= nums[i];
        }
        for(int j = n-1; j>=0; j--){
            result[j] *= s;
            s *= nums[j];
        }
        return result;
    }
}