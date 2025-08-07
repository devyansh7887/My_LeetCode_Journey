class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int pos = 0; //The insert position where the next non zero element would be inserted
        for(int num:nums){//Moving all nonZero elements to front
            if(num != 0){
                nums[pos] = num;
                pos++;
            }
        }
        //Moving all zeroes to the end
        while(pos<n){
            nums[pos++] = 0;
        }
    }
}