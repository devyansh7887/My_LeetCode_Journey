class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int area = 0;
        while(i<j){
            int prod = Math.min(height[i], height[j]) * (j-i);
            area = Math.max(area, prod); 
            if(height[i] < height[j]) i++;
            else{
                j--;
            }
        }
        return area;
    }
}