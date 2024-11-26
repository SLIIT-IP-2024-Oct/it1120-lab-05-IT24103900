 import java.util.Scanner;

public class IT24103900Lab5Q2 {
    public static void main (String [] args)
    {
        int count;
        String output;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of new customers introduced : ");
        count = input.nextInt();

        if(count<0)
        {
            System.out.println("Input must be a number 0 or greater");
            return;

        }

        switch(count)
        {
            case '0' :System.out.println("No Prize");
            break;

            case '1' :System.out.println("Prize is a : Pen");
            break;

            case '2' :System.out.println("Prize is a : Umbrella");
            break;

            case '3' :System.out.println("Prize is a : Bag");
            break;

            case '5' :System.out.println("Prize is a : Travelling Chair");
            break;

        }

        if(count>=5)
        {
            System.out.println("Prize is a : Headphone");
        }

    }
}