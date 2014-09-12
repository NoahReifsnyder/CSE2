//lab03-BigMac
//9/12/14
//Noah Reifsnyder
//CSE002
// 
//recieve input from user to calculate cost of some Big macs, when given 
//the amount of big macs and the cost for 1, and the tax
import java.util.Scanner;
//importated a utility that allows me to accept input from user
public class BigMac {
    public static void main(String[] args) {
    //created class and main method
    Scanner myScanner;
    myScanner = new Scanner ( System.in); //commands to allow the scanner to work
    System.out.println("Enter the number of Big Macs (an integer > 0) : "); //prompt for how many big macs are being purchased
    int nBigMacs= myScanner.nextInt () ; //recieve amount of big macs purchased
    System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): " ); //prompt user for cost of big mac
    double bigMac$ = myScanner.nextDouble(); //recieving cost of Big Mac
	System.out.print("Enter the percent tax as a whole number (xx): "); //prompt user to give tax percentage
    double taxRate = myScanner.nextDouble(); //recieve users tax percent
    taxRate/=100; //user eneter the number as a percent, I want it as a decimal i can apply to the cost
    double cost$;
    int dollars,   
    dimes,
    pennies; //defining variables to store cost
    cost$ = nBigMacs*bigMac$*(1+taxRate); //total cost, extra decimal places
    dollars=(int)cost$; //round down, total dollars minus cents
    dimes=(int)(cost$*10)%10; //the tenths place from the cost
    pennies=(int)(cost$*100)%10; //the hundreths place from the cost
    System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +
    " per BigMac, with a sales tax of "+ (int)(taxRate*100) +"%, is $" +dollars+
    "." +dimes+pennies);
    //output the values given along with the total cost of the meal
    }//end of main method
}//end of class