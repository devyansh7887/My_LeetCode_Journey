class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if(rowIndex == 0){
            list.add(1);
            return list;
        }
        if(rowIndex == 1){
            Collections.addAll(list,1,1);
            return list;
        }
        long ans = 1;
        list.add((int)ans);
        for(int i = 1; i<=rowIndex; i++){
            ans *= (rowIndex - i + 1);
            ans /= i;
            list.add((int)ans);
        }
        return list;
    }
}