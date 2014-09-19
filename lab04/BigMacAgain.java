//lab04-BigMacAgain
//Noah Reifsnyder
//9/19/14
//CSE2
//
//This program should ask for how many big macs you want, then ask if you want fries, and give you the total cost of the order.
//If an improper value is entered to the scanner, an error message should appear and the program should terminate
import java.util.Scanner; //import scanner
public class BigMacAgain{
    public static void main(String[] args){
    //declared class and main method
    Scanner myScanner;
    myScanner = new Scanner ( System.in ); //declared my scanner to accept input
    int nBigMacs;
    double bigMac$=2.22;
    double fryCost$=2.15;
    System.out.print("How many Big Macs would you like to order? :");
    if (myScanner.hasNextInt()) //if the input is an integer
        {nBigMacs=myScanner.nextInt(); //set nBigMacs equal to the inputed integer
        }//end of if
    else  //if the input is not an integer
        {System.out.println("You did not enter an integer");
        return; //leaves the program
        }//end of else
    if (nBigMacs==0)
        { System.out.println("You don't want any BigMacs? Please enter a value greater than 0");
        return;
        }//end of if
    double cost$=nBigMacs*bigMac$; //inputed amount of bigmacs multiplied by cost per bigmac
    cost$*=100;
    cost$=(int)cost$;
    cost$/=100;
    //remove excess decimals
    System.out.println("You have ourdered "+ nBigMacs +" at $"+ bigMac$ +" each for a total of "+ cost$);
    System.out.print("would you like fires? (Y/y/N/n) :");
    String answer = myScanner.next();
    if (answer.equals("y")|| answer.equals("Y"))  //if they said yes to fries
       { System.out.println("You have added an order of Fries for $" + fryCost$);
        cost$+=fryCost$;
        cost$*=100;
        cost$=(int)cost$;
        cost$/=100;
        //remove excess decimals
        System.out.println("The total of your order is $"+ cost$);
       }
    else 
        {//if they didn't say yes to fries
        if (answer.equals("N")|| answer.equals("n"))  //if they choose to not order fries
            { System.out.println("The total of your order is $"+ cost$);
            }
        else
            {System.out.println("You did not enter a valid answer for if you wanted fries. Please enter either (Y/y/N/n)");
            return; //ends program
            }//ends if statment for if they didn't say yes to fries
        }//end of else for if they didn't say yes to friest
    }//end of main method
}//end of class