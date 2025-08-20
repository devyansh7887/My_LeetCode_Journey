class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // <----------OPTIMAL APPROACH SOLUTION------------>
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> outerList = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    ArrayList<Integer> innerList = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    outerList.add(innerList);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1])j++;
                    while(k>j && nums[k] == nums[k+1])k--;
                }
            }
        }
        return outerList;
    }
}