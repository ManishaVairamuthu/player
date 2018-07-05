import java.util.*;
class numrev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String out="";
        while(n>0)
        {
            int t=n%10;
            out=out+t;
            n=n/10;
        }
        System.out.print(out);
    }
}
