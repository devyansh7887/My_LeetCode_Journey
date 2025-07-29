class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        int rev=0;
        int a = num;
        int b;
        while(a>0)
        { 
            b=a%10;
            // Overflow check
            if (rev > (Integer.MAX_VALUE - b)/ 10) 
            {
                return 0;  
            }
            rev=rev*10+b;
            a=a/10;
           
        }
        if(x<0)
        return -rev;
        else
        return rev;
        
    }
}