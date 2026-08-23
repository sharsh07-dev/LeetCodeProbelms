class Solution {
    public boolean isPalindrome(int x) {
        int originalno = x;
            int rev=0;
        while(x>0){
            int lastdigit = x %10;
            x = x/10 ;
            rev = (rev *10) + lastdigit ;
    }
    if(originalno==rev){
        return true;
       }
       else  return false;
     
   
}
}