import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int s=0;
     int m=n;
     int ch;
    while(m>0)
    { //int temp=n;
      ch=m%10;
      s=(s*10)+ch;
      m=m/10;
    }
    if(n==s)
       System.out.println("palindrome");
   else
        System.out.println("not palindrome");
    }
}
