class Solution {
    public boolean checkDivisibility(int n) {

        int n1=n;
        int sum=0;
        int prod=1;
       

        while(n>0){
            int digit=n % 10;
            sum=sum + digit;
            prod=prod * digit;
            n = n / 10;
        }

        if( n1 % (sum + prod) == 0){
            return true;
        }
        else{
            return false;
        }
    }
}