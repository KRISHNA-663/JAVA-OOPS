import java.util.*;
import java.io.*;
class Main
{
    public static void main(String args[])
    {
        Stack<Integer> stack=new Stack<Integer>();
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            stack.push(ele);
        }
        int y=stack.pop();
        System.out.println(y);
        int x=stack.peek();
        System.out.println("Top Element : "+x);
        int s=sc.nextInt();
        int p=stack.search(s);
        if(p==-1)
        {
            System.out.println("Element not found");
        }
        else{
        System.out.println("Element is found at position : "+p);
}
    }
}
