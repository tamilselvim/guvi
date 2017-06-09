import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {   Scanner in=new Scanner(System.in);
        int num =in.nextInt();
        int n = num; 
        int check=0,remainder;
        while(num > 0)
        {
            remainder = num % 10;
            check = check + (int)Math.pow(remainder,3);
            num = num / 10;
        }
        if(check == n)
            System.out.println(n+" is an Armstrong Number");
        else
            System.out.println(n+" is not a Armstrong Number");
    }
}
