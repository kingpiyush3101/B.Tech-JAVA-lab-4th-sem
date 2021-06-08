//wap to check magic number
import java.util.Scanner;

public class magicnumber
{
    public static void main(String[] args)
    {
        int n, r = 1, x, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        n = sc.nextInt();
        x = n;
        while (x!=0)
        {
            r=x%10;
            sum=r+sum;
            x=x/10;
        }
        if (sum == 1)
        {
            System.out.println(n+" is a Magic Number");
        }
        else
        {
            System.out.println(n+" is Not Magic Number");
        }
    }
}
