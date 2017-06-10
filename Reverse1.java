import java.util.*;
public class Reverse1 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int t,r=0;
        while(n!=0)
        {
                t=n%10;
                r=r*10+t;
                //System.out.print(t);
                n=n/10;
            }
        System.out.println(r);
        }
    }
    
