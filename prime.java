import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int number =in.nextInt();
        int flag=0;
        for(int i=2; i<number; i++)
    {
        if(number%i==0)
            {
                System.out.println("not a Prime Number");
                flag = 1;
                break;
            }
        }
        if(flag==0)
        System.out.println(" is a Prime Number");
    }
}
