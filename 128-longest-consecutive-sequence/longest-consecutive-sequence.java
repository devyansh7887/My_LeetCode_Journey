class Solution {
    public int longestConsecutive(int[] nums) {
        // <--------BRUTE FORCE APPROACH---------->
        // Create an arraylist and copy all elements of the array onto it.
        // Then check wheteher for any number its consecutive number exists or not.
        // EXCEEDS TIME LIMIT : O(N LOGN)
        // <-----------BETTER APPROACH------------>
        // 
        Arrays.sort(nums);
        int n = nums.length;
        int currCount = 1;
        int lastSmaller = Integer.MIN_VALUE;
        int largest = 0;
        for(int i = 0; i< n; i++){
            if(nums[i] - 1 == lastSmaller){
                currCount++;
                lastSmaller++;
            }else if(nums[i] != lastSmaller){
                currCount = 1;
                lastSmaller = nums[i];
            }
            largest = Math.max(largest, currCount); 
        }
        return largest;
    }
}