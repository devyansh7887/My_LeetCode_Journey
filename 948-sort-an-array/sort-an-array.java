class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int left = 0, right = n-1;
        return mergeSort(nums, left, right);
    }
    public static int[] mergeSort(int[] arr, int left, int right){
        int mid = (left + right) / 2;
        if(left < right){
            mergeSort(arr,left, mid);
            mergeSort(arr, mid + 1, right);
        }
        return merge(arr, left, mid, right);
    }
    public static int[] merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        // Copy data into temp arrays
        for(int i = 0; i<n1; i++) L[i] = arr[left + i];
        for(int j = 0; j<n2; j++) R[j] = arr[mid + 1 + j];
        // Merge temp arrays back
        int i = 0;
        int j = 0;
        int k = left;
        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
        return arr;
    }
}