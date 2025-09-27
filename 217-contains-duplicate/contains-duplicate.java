class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], i);
            else return true;
        }
        return false; 
    }//
}