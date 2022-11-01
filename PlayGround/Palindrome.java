import java.util.*;
class Solution {
   
    public boolean isPalindrome(int x) 
    {
    int temp=x,r,sum=0;
    while(x>0)
    {
        r=x%10;
        sum=(sum*10)+r;
        x=x/10;
    }
    if(sum==temp)
    {
        return true;
    }
    else
    
        return false;
    
    
}
}
class Main{
    //int n;
   public static void main(String args[])
    {
    //int sum=0,r;
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    Solution s1=new Solution();
    s1.isPalindrome(x);
    }
}
