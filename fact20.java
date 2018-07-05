import java.util.*;
class fact20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int out=1;
        for(int i=1;i<=n;i++)
        {
            out=out*i;
        }
        System.out.print(out);
    }
}
