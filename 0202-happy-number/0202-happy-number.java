class Solution {
    
    public int sumOf(int n){
        int sum=0;
        int digit=0;
        while( n !=0){
            digit = n %10;
            sum += digit * digit;
            n = n/10;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        int Fast = n;
        int Slow = n;

do{
    Slow = sumOf(Slow);
    Fast = sumOf(sumOf(Fast));
}
    while( Fast != Slow);
    return Slow==1;
    }
}