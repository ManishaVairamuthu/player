import java.util.*;
class kthsmallest
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.print(ar[k-1]);
     }
}
