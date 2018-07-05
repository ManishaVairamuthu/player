import java.util.*;
class strrev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String out="";
        for(int i=s.length()-1;i>=0;i--)
        {
            out=out+s.charAt(i);
        }
        System.out.print(out);
    }
}
