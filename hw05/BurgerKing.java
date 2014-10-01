//hw05-1-BurgerKing
//Noah Reifsnyder
//9/29/14
//CSE2
//
//This program will ask a customer if they went a soda, fries or a burger, and then some questions about the option they choose.
import java.util.Scanner; //import scanner
public class BurgerKing{
    public static void main(String[] args){
    //declared class and main method
    Scanner myScanner;
    myScanner = new Scanner ( System.in ); //declared my scanner to accept input
    System.out.print("Enter a letter to indicate choice of \n Burger (B,b) \n Soda (S,s) \n Fries (F,f) :");
    String choice=myScanner.next();
    String secondChoice;
    if (choice.length()==1){
        switch (choice){
            case "B":
            case "b":
                System.out.print("Would you like \n All the fixins (A,a) \n Cheese (C,c) \n none of the above (N,n) :");
                secondChoice=myScanner.next();
                if (secondChoice.length()==1){
                    switch (secondChoice){
                        case "A":
                        case "a":
                            System.out.println("You have ordered a burger with all the fixins");
                            break;
                        case "C":
                        case "c":
                            System.out.println("You have ordered a burger with cheese");
                            break;
                        case "N":
                        case "n":
                            System.out.println("You have ordered a plain burger");
                            break;
                        default:
                            System.out.println("(A,a,C,c,N,n) expected");
                    }//ends switch
                }//ends if
                else{//if more than one character is entered
                System.out.println("Single charater expected");
                return;//exits
                }//ends else
                break;
            case "S":
            case "s":
                System.out.print ("Would you like \n Coke (C,c) \n Pepsi (P,p) \n Sprite (S,s) \n Mountain Dew (M,m) :");
                secondChoice=myScanner.next();
                if (secondChoice.length()==1){
                    switch (secondChoice){
                        case "C":
                        case "c":
                            System.out.println("You have ordered a Coke");
                            break;
                        case "P":
                        case "p":
                            System.out.println("You have ordered a Pepsi");
                            break;
                        case "S":
                        case "s":
                            System.out.println("You have ordered a Sprite");
                            break;
                        case "M":
                        case "m":
                            System.out.println("You have ordered a Mountain Dew");
                            break;
                        default:
                            System.out.println("(C,c,P,p,S,s,M,m) expected");
                    }//ends switch
                }//ends if
                else{//if more than one character is entered
                System.out.println("Single charater expected");
                return;//exits
                }//ends else
                break;
            case "F":
            case "f":
                System.out.print("Would you like \n Large Fry (L,l) \n Small Fry(S,s) :");
                secondChoice=myScanner.next();
                if (secondChoice.length()==1){
                    switch (secondChoice){
                        case "L":
                        case "l":
                            System.out.println("You have ordered a large fry");
                            break;
                        case "S":
                        case "s":
                            System.out.println("You have ordered a small fry");
                            break;
                        default:
                            System.out.println("(L,l,S,s) expected");
                    }//ends switch
                }//ends if
                else{//if more than one character is entered
                System.out.println("Single charater expected");
                return;//exits
                }//ends else
                break;
            default:
                System.out.println("(B,b,S,s,F,f) expected");
                return;//exits
        }//ends switch
    }//ends if
    else{//if more than one character is entered
    System.out.println("Single charater expected");
    return;//exits
    }//ends else
    }//end main method
}//end class