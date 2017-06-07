import java.util.*;
public class Sum_Natural
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+i;
           
        }
         System.out.println(s);
    }
    
}
