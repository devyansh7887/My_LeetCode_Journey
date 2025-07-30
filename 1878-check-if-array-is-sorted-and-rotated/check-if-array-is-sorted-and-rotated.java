class Solution {
    public boolean check(int[] nums) {
        int n = nums.length; //Store the length of the array
        int count = 0; //Count to mark the point of deflections, to mark rotations 
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1])
                count++;
        }
        //Edge case
        if (nums[n - 1] > nums[0]) {
            count++;
        }
        // To handle the case of array being already sorted, or case of equal elements
        int[] temp = new int[n];
        System.arraycopy(nums,0,temp,0,n);
        Arrays.sort(temp);
        if(Arrays.equals(nums,temp)) return true;
        return (count == 1);
    }
}