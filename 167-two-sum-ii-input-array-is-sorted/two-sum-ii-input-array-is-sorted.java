class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Using two pointer approach
        //Make a new array to return
        int[] arr = new int[2];
        int left = 0;//first index
        int right = numbers.length - 1;//last index
        while(left < right){
            //Shift the right pointer to left if sum is greater as we would want to reduce it
            if(numbers[left] + numbers[right] > target) right--;
            //If the target matches return the elements
            if(numbers[left] + numbers[right] == target){
                arr[0] = left + 1; //As it is 1-Indexed array
                arr[1] = right + 1; //As it is 1-Indexed array
                break;
            }
            //Shift the left pointer to right if sum is smaller as we would want to increase it
            if(numbers[left] + numbers[right] < target) left++;
        }
        return arr;
    }
}