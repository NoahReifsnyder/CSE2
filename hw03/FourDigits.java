//hw03-3-FourDigits
//9/12/14
//Noah Reifsnyder
//CSE2
//
//the user enters a double, and my program prints back the first 4 digits after the decimal place
import java.util.Scanner; //importing scanner
public class FourDigits{
    public static void main(String[] args){
    //create class and main methoid
    Scanner myScanner=new Scanner (System.in); //defining my Scanner
    System.out.print("Enter a double and I will display the first 4 digits after the decimal:");
    double input= myScanner.nextDouble(); //recieve the users input
    int castedInput = (int) input; //the numbers before the decimal place
    input-=castedInput; //removes the numbers before the decimal place
    input*=10000; //move the first four decimals infront of the decimal place
    int output=(int) input; //remove the extra decimal places/what I want to output to the user
    System.out.println("The first four digits after the decimal place are "+ output);
    System.out.println(castedInput);
    }//end of main method
}//end of class