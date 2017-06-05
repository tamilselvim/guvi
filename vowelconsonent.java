import java.util.*;
public class vowelconsonent {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("vowels");   
        }
        else
        {
            System.out.println("consonant");
        }
        
    }
        
    
}
