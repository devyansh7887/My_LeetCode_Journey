class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Using two pointer approach
        //Make a new array to return
        int[] arr = new int[2];
        int left = 0;//first index
        int right = numbers.length - 1;//last index
        while(left < right){
            if(numbers[left] + numbers[right] > target) right--;
            if(numbers[left] + numbers[right] == target){
                arr[0] = left + 1;
                arr[1] = right + 1;
                break;
            }
            if(numbers[left] + numbers[right] < target) left++;
        }
        return arr;
    }
}