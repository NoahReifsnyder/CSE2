//hw04-2-Incometax
//Noah Reifsnyder
//9/22/14
//CSE2
//
//this program will print out the number of days in a given month, accounting for leap years
import java.util.Scanner;
public class Month{
    public static void main(String[] args){
    //declared class and main method
    Scanner myScanner;
    myScanner = new Scanner ( System.in ); //declared my scanner to accept input
    int month;
    double leapCheck;
    System.out.print("Enter the number of the month (1-12):");
    if (myScanner.hasNextInt()){
        month=myScanner.nextInt();
    }//end of if
    else {
        System.out.println("You did not enter an integer.");
        return; //exits program
    }//end of else   
    switch (month){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("This month has 31 days");
            break;//end of this section of inputs
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("This month has 30 days");
            break;//end of this section of inputs
        case 2: //Febuary, account for leap years
            System.out.print("Enter the year:");
            if (myScanner.hasNextInt()){
                leapCheck=myScanner.nextDouble();
                leapCheck/=4;
                leapCheck-=(int)leapCheck;
                if (leapCheck==0){
                    System.out.println("This month has 29 days");
                }//end of if
                else {
                    System.out.println("This month has 28 days");
                }//end of else
            }//end of if
            else{
                System.out.println("You did not enter a valid input for the year");
                return;}//exits program
    }//end of switch
    }//end of main mehtod
}//end of class