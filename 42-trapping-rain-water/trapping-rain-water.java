class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int left_max = Integer.MIN_VALUE;
        int right_max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            prefix[i] = Math.max(left_max, height[i]);
            if(left_max < height[i]){
                left_max = height[i];
            }
        }
        for(int j = n-1; j>=0; j--){
            suffix[j] = Math.max(right_max, height[j]);
            if(right_max < height[j]){
                right_max = height[j];
            }
        }
        int water = 0;
        for(int k = 0; k<n; k++){
            water += Math.min(prefix[k], suffix[k]) - height[k];
        }
        return water;
    }
}