import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[])
    {
        Queue<Integer> q=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            q.add(ele);
        }
        System.out.println(q);
        int r=q.remove();
        //System.out.println("\n");
        System.out.println("removed element : "+r);
        System.out.println(q);
        int x=q.peek();
        System.out.println("head of the queue : "+x);
        int y=q.size();
        System.out.println("Size of the queue : "+y);
        int z=sc.nextInt();
       
        if(q.contains(z))
        {
            System.out.println("The element is present.");
        }
        else
        {
            System.out.println("The element is not present.");
        }
    }
}
