class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        //skip leading space
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        //if entire string was spaces or empty
        if(i==n) return 0;
        //read optional sign
        int sign = 1;
        char first = s.charAt(i);
        if(first == '+' || first == '-'){
            sign = (first == '-')? -1:1;
            i++;
        }
        //read digits with overflow check before each append
        int result = 0;
        while(i<n){
            char ch = s.charAt(i);
            if(ch < '0' || ch > '9') break;
            int digit = ch-'0';
            //clamp
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)){
                return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result *10 + digit;
            i++;
        }
        return sign*result;
    }
}