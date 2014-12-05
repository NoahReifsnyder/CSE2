//lab07-LoopTheLoop
//Noah Reifsnyder
//10/20/14
//CSE2
//Practicing using loops
import java.util.Scanner;
public class LoopTheLoop{
public static void main(String[] args){
    //define class and main method
    Scanner myScanner=new Scanner (System.in);//define scanner
    int nStars=0;
    System.out.print("Please enter an int between 1 and 15:");
    boolean loop=true;
    do{
        if (!myScanner.hasNextInt()){
                System.out.println("You did not enter an int, please try again");
                System.out.print("Please enter an int between 1 and 15:");
                nStars=0;
        }//ends if
        else{
            nStars=myScanner.nextInt();
            System.out.println(nStars);
            loop=false;
            if (nStars>=16 || nStars<=0){
                System.out.println("Your input was not between 1 and 15, please try again");
                System.out.print("Please enter an int between 1 and 15:");
                loop=true;
            }//ends if
        }//ends else
    }while (loop);//loops until appropriate input
    int count=0;
    while (count<nStars){
        count++;
        System.out.print("*");
    }//ends while
    count=0;
    int secondCount;
    while (count<nStars+1){
        secondCount=0;
        while (secondCount<count){
            secondCount++;
            System.out.print("*");
        }//ends while
        System.out.println();
        count++;
    }//ends while
    }//ends main method
}//ends class