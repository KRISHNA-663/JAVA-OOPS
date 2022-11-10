import java.util.*;
class Main
{
    static void Missing(int arr[],int N)
    {
        int i;
        int temp[]=new int[N+1];
        for(i=0;i<=N;i++)
        {
            temp[i]=0;
        }
        for(i=0;i<N;i++)
        {
            temp[arr[i]-1]=1;
        }
        int ans=0;
        for(i=0;i<=N;i++)
        {
            if(temp[i]==0)
            {
                ans=i+1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        Missing(arr,n);
    }
    
}
