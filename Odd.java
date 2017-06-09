import java.util.*;
public class Odd 
{
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    int s=in.nextInt(); 
    int e=in.nextInt();
    int i;
  for(i=s;i<e;i++)
    {
        if(i%2!=0)
            System.out.println(i);
    }
}
