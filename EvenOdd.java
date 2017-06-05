import java.util.*;
public class EvenOdd {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        if(n%2==0)
        {
            System.out.println("even");
        }
        if(n%2!=0)
            System.out.println("odd");
    }
    
}
