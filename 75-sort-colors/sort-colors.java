class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int k = n-1;
        while(j<=k){
            if(nums[j] == 0){
                swap(nums, i, j);
                j++;
                i++;
            }else if(nums[j] == 1){
                j++;
            }else{
                swap(nums, j, k);
                k--;
            }
        }
    }
    public void swap (int[] nums, int m, int n){
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }
}