class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        //<-----Brute force Method--------->
        // int pos = 0; //The insert position where the next non zero element would be inserted
        // for(int num:nums){//Moving all nonZero elements to front
        //     if(num != 0){
        //         nums[pos] = num;
        //         pos++;
        //     }
        // }
        // //
        // //Moving all zeroes to the end
        // while(pos<n){
        //     nums[pos++] = 0;
        // }
        //<--------Optimised approach---------->
        //Two pointers
        int j = -1;
        for(int i = 0; i<n; i++){//So this loop sets the var j as the first zero in the array
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1; i<n; i++){
            if(nums[i]!=0 && j != -1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}