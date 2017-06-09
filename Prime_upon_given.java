import java.io.*;
import java.util.*;
class Prime_upon_given
{
    public static void main(String args[]) throws IOException
    {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n=in.nextInt();
        System.out.println("Prime numbers are: ");
        for(int i=1;i<=n;i++)
        {
            int p=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    p++;
            }
            if(p==2)
                    System.out.print(" "+i);
 
        }
    }
}

