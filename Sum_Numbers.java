import java.util.*;
public class Sum_Numbers
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n1[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
           n1[i]=in.nextInt();
                       
        }
        for(int j=0;j<n;j++)
        {
        s=s+n1[j];
        }
         System.out.println(s);
    }
    
}
