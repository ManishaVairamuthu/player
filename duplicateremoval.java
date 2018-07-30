import java.util.*;
class duplicateremoval
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
        String res="";
        for(int i=0;i<n;i++)
        {
            if(!res.contains(String.valueOf(ar[i])))
            res=res+" "+ar[i];
        }
        System.out.print(res);
     }
}
