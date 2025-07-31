class Solution {
    public int removeDuplicates(int[] nums) {
        // Initial approach - Make a new arrayList, copy all unique elements to it, and then trace it back to original array.
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])) continue; // To check wheather a element is present in the ArrayList.
            list.add(nums[i]);
        }
        // Add the Elements back to the array
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i); // 
        }
        // Return the length of the arraylist
        return list.size();
    }
}