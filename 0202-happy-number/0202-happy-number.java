class Solution {
    public boolean isHappy(int n) {

    int fast =n;
    int slow =n;

    do{
 fast = isSum(isSum(fast));
 slow = isSum(slow);
    }
    while(fast != slow);
    return slow==1;
    }
    public int isSum(int n){
        int sum =0;
        while( n!=0){
        int digit = n %10;
        sum += digit * digit;
        n = n /10;
        }
        return sum;
    }
}