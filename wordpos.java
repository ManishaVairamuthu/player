import java.util.*;
class wordpos
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.next();
        String ar[]=s.split(" ");
        int pos=0;
        for(int i=0;i<ar.length;i++)
        {
            if(s1.equals(ar[i]))
            {
                pos=i;
                break;
            }
        }
        System.out.print(pos+1);
     }
}
