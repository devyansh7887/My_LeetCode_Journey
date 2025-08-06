class Solution {
    public int[] rearrangeArray(int[] nums) {
        //Two new arrays, each to negative and positive numbers
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i : nums){
            if(i > 0){
                pos.add(i);
            }else{
                neg.add(i);
            }
        }
        int even = 0;
        int odd = 1;
        int count = 0; 
        while(odd <= nums.length-1){
            nums[even] = pos.get(count);
            nums[odd] = neg.get(count);
            count++;
            even += 2;
            odd += 2;
        }
        return nums;
    }
}