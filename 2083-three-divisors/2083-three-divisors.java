class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int m=1;m<=n;m++)
        {
            if(n%m==0)
            {
                count++;
            }
        }
        return count==3?true:false;
    }
}