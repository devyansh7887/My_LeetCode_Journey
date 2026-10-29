class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        //BRUTE FORCE METHOD: SORT THEN TWO POINTER
        Collections.sort(nums);
        int i = 0;
        int j = n-1;
        int count = 0;
        while(i<j){
            int sum = nums.get(i) + nums.get(j);
            if(sum >= target) j--;
            else if(sum < target){
                count+= j-i;
                i++;
            }
        }
        return count;
    }
}