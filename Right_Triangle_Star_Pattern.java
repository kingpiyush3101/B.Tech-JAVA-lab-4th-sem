/*
QUE: Java Program to print Right Triangle Star Pattern.
*/
public class Right_Triangle_Star_Pattern
{
    public static void main(String args[])
    {
        int i, j, row=6;
        for(i=0; i<row; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
