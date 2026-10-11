class Solution {
    public boolean isPalindrome(String s) {
     s=  s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int na = s.length()-1;
        return helper(s,0,na);
    }
    public boolean helper(String a, int st , int e){
        if(st > e){
            return true;
        }
        if(a.charAt(st) != (a.charAt(e))){
            return false;
        }
        return helper(a, st+1 , e-1);
    }
}