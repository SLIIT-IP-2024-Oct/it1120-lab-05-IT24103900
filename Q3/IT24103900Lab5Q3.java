import java.util.Scanner;

public class IT24103900Lab5Q3 {
    public static void main (String [] args)
    {
        final double ROOM_CHARGE = 48000.0;

        Scanner input = new Scanner(System.in);

        // input and validation 01
        System.out.print("Enter Start date (1-31) : ");
        int sDate = input.nextInt();
        if(sDate<1 || sDate>31)
        {
            System.out.println("Start date cannot be less than 1 or greater than 31");
            return;
        }

        System.out.print("Enter End date (1-31) : ");
        int eDate = input.nextInt();
        if(eDate<1 || eDate>31)
        {
            System.out.println("End date cannot be less than 1 or greater than 31");
            return;
        }

        // validation 02
        if(eDate < sDate)
        {
            System.out.println("Start Date must be less than End Date");
            return;
        }

        // define variables
        int noOfDays = eDate - sDate;
        double totalAmount = 0.0;

        // calculations
        if (noOfDays < 3)
        {
            totalAmount = noOfDays*ROOM_CHARGE;
        }
        else if (noOfDays < 5)
        {
            totalAmount = noOfDays*ROOM_CHARGE - (noOfDays*ROOM_CHARGE)/10;
        }
        else
        {
            totalAmount = noOfDays*ROOM_CHARGE - (noOfDays*ROOM_CHARGE)/5;
        }

        //output
        System.out.println("Room Charge Per Day: Rs." +ROOM_CHARGE +"/=");
        System.out.println("Number of Days Reserved: " +noOfDays);
        System.out.println("Total Amount to be paid: Rs." +totalAmount +"/=");

    }
}