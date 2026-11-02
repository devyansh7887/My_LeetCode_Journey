class Solution {
    public int findMaxLength(int[] nums) {
        //OPTIMAL APPROAH : TREAT 0'S AS -1'S AND USE PREFIX SUMA ND HASHMAP
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int psum = 0;
        int len = 0;
        for(int i = 0; i<n; i++){
            psum += (nums[i] == 0) ? -1:1;
            if(map.containsKey(psum)){
                len = Math.max(len, i-map.get(psum));
            }else{
                map.put(psum, i);
            }
        }
        return len;
    }
}