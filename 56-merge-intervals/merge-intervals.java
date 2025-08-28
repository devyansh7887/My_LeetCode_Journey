class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        ArrayList<int[]> mintervals = new ArrayList<>();
        int[] current = intervals[0];
        mintervals.add(current);
        for(int[] interval : intervals){
            if(current[1] >= interval[0]){
                current[1] = Math.max(current[1], interval[1]);
            }else{
                current = interval;
                mintervals.add(current);
            }
        }
        return(mintervals.toArray(new int[mintervals.size()][]));
    }
}