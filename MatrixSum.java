import java.util.Scanner;
public class MatrixSum {

    public  static void main ( String [] srgs)
    {
        int i,j;
        int a[][]=new int[10][10];
        int b[][]=new int [10][10];
        Scanner input =new Scanner(System.in);
        System.out.println("**Enter input for Matrix 1**");

        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println("Enter any number:");
                a[i][j]=input.nextInt();
            }

        }

        System.out.println("**Enter input for Matrix 2**");

        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println("Enter any number:");
                b[i][j]=input.nextInt();
            }
        }

        System.out.println("Sum = ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+b[i][j]);

            }

        }

    }

}
