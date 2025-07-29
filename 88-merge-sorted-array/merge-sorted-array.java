class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i<m + n;i++){
            nums1[i] = nums2[i-m]; // randomly puuting the elements of the second array in first
        }
        Arrays.sort(nums1);
        // for(int x = 0;x<m+n-1;x++){ //traverses throught the entire larger array
        //     for(int y = 0;y<m+n-x-1;y++){ //traverses through the rest unsorted array
        //         if(nums1[y]>nums1[y+1]){
        //             int temp = nums1[y];
        //             nums1[y] = nums1[y+1];
        //             nums1[y+1] = temp;
        //         }
        //     }
        // }
    }
}