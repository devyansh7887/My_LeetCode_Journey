class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for(int price : prices){
            if(price < min){
                min = price; // Updates the minimum value of the priceif lower value found
            }else if(price - min > diff){//Maximising the profit earned
                diff = price - min;
            }
        }
        return diff;
    }
}
// I couldn't think of this approach 