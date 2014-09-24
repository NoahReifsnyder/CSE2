//hw04-4-TimePadding
//Noah Reifsnyder
//9/23/14
//CSE2
//
//this program will take an input of seconds in the day, and output the time in conventional form,
//including padded 0s
import java.util.Scanner;
public class TimePadding{
    public static void main(String[] args){
    //declared class and main method
    Scanner myScanner;
    myScanner = new Scanner ( System.in ); //declared my scanner to accept input
    System.out.print("how many seconds have passed this day?:");
    int seconds;
    int minutes;
    int hours;
    if (myScanner.hasNextInt()){
        seconds=myScanner.nextInt();
    }//ends if
    else{
        System.out.println("You did not enter an integer");
        return;
    }//ends else, exits program
    if (seconds<=-1 || seconds>=86400){
        System.out.println("The number entered was out of the range (0 to 86400)");  
        return;
    }//ends if
    minutes=seconds/60;
    seconds-=(minutes*60);
    hours=minutes/60;
    minutes-=(hours*60);
    System.out.printf("%02d",hours);
    System.out.printf(":%02d",minutes);
    System.out.printf(":%02d\n",seconds);
    }//end main method
}//end class
    