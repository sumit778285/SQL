class Solution {
    public boolean isPalindrome(int x) {
        int r,n=0;
        int m=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            r=x%10;
            n=n*10+r;
            x=x/10;
        }
        if(m==n)
            return true;
        else
            return false;
    }   
    
}