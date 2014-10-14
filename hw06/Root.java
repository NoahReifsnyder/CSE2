//hw06-2-Root
//10-13-14
//Noah Reifsnyder
//CSE2
//
//This program will attempt to determine the square root of an inputed number
import java.util.Scanner;
public class Root {
    public static void main(String[] args){
        //declares class and method and imports scanner
        Scanner myScanner;
        myScanner= new Scanner (System.in); //allows scanner to accept input
        double high;
        double low=0;
        double middle=0;
        double input;
        boolean boolLoop=true;
        int testCounter=0;
        System.out.print("Enter a double you would like to know the square root of (Greater than 0):");
        if (myScanner.hasNextDouble()){
            input=myScanner.nextDouble();
            if (input<=0){
                System.out.println("You did not enter a double greater than 0");
                return;//exits program
            }//ends if
        }//ends if
        else{
            System.out.println("You did not enter a double");
            return;//exits program
        }//ends else
        high=input+1;
        while (boolLoop){
            testCounter++;
            middle=((high+low)/2);
            if (middle*middle>input){
                high=middle;
            }//ends if
            else{
                low=middle;
            }//ends else
            if ((high-low)<(.0000001*(input+1))){
                boolLoop=false;
            }//ends if
        }//ends loop
        System.out.println("The square root of "+input+" is "+middle);
    }//ends main method
}//ends class