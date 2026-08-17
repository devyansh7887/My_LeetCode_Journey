class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        // Approach#1 : check each element against every other element.
        // for(int i = 0; i<n; i++){
        //     for(int j = i+1; j<n; j++){
        //         if(nums[i] == nums[j]) return true;
        //     }
        // }
        // return false;
        // TC : O(N^2)
        // TLE

        // Approach#2 : make another arraylist, and check whether they are equal
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 0; i<n; i++){
        //     if(!list.contains(nums[i])){
        //         list.add(nums[i]);
        //     }
        // }
        // if(n == list.size()) return false;
        // else return true;
        // TC : O(N^2)
        // TLE

        //Approach#3 : Sorting
        Arrays.sort(nums);
        for(int i = 0; i<n-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
        // TC : O(N) 
    }
}