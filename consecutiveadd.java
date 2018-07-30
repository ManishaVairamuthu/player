import java.util.*;
class consecutiveadd
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int res=0;
        Arrays.sort(ar);
        for(int i=0;i<n;i++)
        {
            res=res+ar[i];
        }
        res=res-ar[0];
        System.out.print(res);
     }
}
