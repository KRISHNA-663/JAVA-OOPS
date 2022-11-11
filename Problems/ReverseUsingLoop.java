import java.util.*;

class Main {
	public static void main(String[] args)
	{
		int a=56;
		int rem=0;
		int rev=0;
		while(a!=0)
		{
		    rem=a%10;
		    rev=rev*10+rem;
		    a=a/10;
		}
		System.out.print(rev);
	}
}
/*
input - 56
output - 65
*/
