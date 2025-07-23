class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]",""); //worthy
        String reversed = "";
        if(clean.isEmpty()){//worthy
            return true;
        }else{
            for (int i = clean.length() - 1; i >= 0; i--) {
                 reversed += clean.charAt(i);
            }
        }
        if(!reversed.equals(clean)){//worthy
            return false;
        }
        return true;
    }
}