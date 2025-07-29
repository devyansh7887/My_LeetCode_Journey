class Solution {
    public boolean canJump(int[] nums) {
        int jumps = nums[0];
        //to trasverse through the array:
        for(int i = 0; i<nums.length; i++){
            //agar no. of jumps 0 hogya to aage hi nhi badh payega 
            if(i > 0 && jumps == 0){
                return false;
            }
            //agle step pe jaaney k liye, decrement the value by one
            jumps--;
            //ab agar agla elemnt bada hua, to uski value ko prefer karo
            if(nums[i] > jumps){
                jumps = nums[i];
            }
        }
        return true;
    }
}