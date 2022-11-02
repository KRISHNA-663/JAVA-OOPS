import java.util.*;
import java.lang.Math;
class Main
{ 
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int f=Math.abs((a+c)-b);
        int k=Math.abs((b+c)-a);
        int l=f<k?f:k;
        System.out.println(l);
    }
}
