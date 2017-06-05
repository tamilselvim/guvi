# guvi
import java.util.*;
public class PNZ {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        int n;
        n=in.nextInt();
        if(n>0)
            System.out.println("positive");
        if(n<0)
            System.out.println("negative");
        if(n==0)
            System.out.println("zero");
    }
}
