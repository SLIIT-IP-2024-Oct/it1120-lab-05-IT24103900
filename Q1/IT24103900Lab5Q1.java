import java.util.Scanner;

public class IT24103900Lab5Q1 {
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        //INPUT
        System.out.print("Enter the first integer : ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer : ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer : ");
        int num3 = input.nextInt();

        int sNum = num1;
        int lNum = num1;

        // find the smallest number
        if(sNum > num2 )
        {
            sNum = num2;
        }
        if(sNum > num3 )
        {
            sNum = num3;
        }

        // find the largest number
        if(lNum < num2 )
        {
            lNum = num2;
        }
        if(lNum < num3 )
        {
            lNum = num3;
        }

        // OUTPUT
        System.out.println("User entered numbers are : " +num1 + " " + num2 +" " +num3 );
        System.out.println("The smallest number is:" +sNum);
        System.out.println("The largest number is:" +lNum);

    }
}

