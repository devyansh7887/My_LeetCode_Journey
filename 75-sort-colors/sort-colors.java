class Solution {
    public void sortColors(int[] nums) {
        //Selection Sorting
        int n = nums.length;
        for(int i = 0; i<n-1; i++){
            int min = i; //Initialise a minimum index
            //Now, find the minimum element's index
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[min]){
                    min = j; 
                }
            }
            //Swapping
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
}