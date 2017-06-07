import java.util.*;
public class alphabets {
    public static void main(String args[])
    {   Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);
        if(ch>'a'&&ch<'z')
            System.out.println("alphabets");
        else
            System.out.println("not alphabet");
            
    }
    
}
