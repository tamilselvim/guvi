import java.util.*;
 
class Factorial
{
    public static void main(String args[]) throws IOException
    {
       Scanner in=new Scanner(System.in);
 
        System.out.println("Enter Number: ");
        int num=in.nextInt();
 
        int result = 1;
        while(num>0)
        {
            result = result * num;
            num--;
        }
        System.out.println("Factorial of Given Number is : "+result);
    }
}
