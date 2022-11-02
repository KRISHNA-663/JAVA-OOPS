import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        float amt=0;
        if(n>100 && n<=200)
        {
            amt+=(n-100)*1.5;
        }
        else if(n<200 && n<=500)
        {
            amt+=200;
            amt+=(n-200)*3;
        }
        else{
            amt+=1730;
            amt+=(n-500)*6.6;
        }
        System.out.println(amt);
    }
}
