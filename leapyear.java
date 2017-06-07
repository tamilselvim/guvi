
import java.util.*;
public class leapyear {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%4==0)
         System.out.println("leap year");
        else
            System.out.println("not leap year");
    }
}
