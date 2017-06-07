import java.util.*;
public class Count_Digit 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        int n1=(int)Math.log10(n)+1;
        System.out.println(n1);
    }   
}

