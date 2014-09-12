//hw03-2-Root
//9/12/14
//Noah Reifsnyder
//CSE2
//
//This program should should give a crude guess at the cube root of an inputed number,
//and then show how close it is by cubing this guess and allowing the user to see how close it is
//to the number they inputed
import java.util.Scanner ; //imported Scanner to allow my program to recieve inputs
public class Root {
    public static void main(String[] args) {
    //create class and main method
    Scanner myScanner;
    myScanner= new Scanner (System.in); //commands to allow the scanner to work, defining it'
    System.out.print("Input a number you would like to know the cube root of:");
    double number= myScanner.nextDouble ();
    double guess= number/3;
    guess= (2*guess*guess*guess+number)/(3*guess*guess);
    guess= (2*guess*guess*guess+number)/(3*guess*guess);
    guess= (2*guess*guess*guess+number)/(3*guess*guess);
    guess= (2*guess*guess*guess+number)/(3*guess*guess);
    guess= (2*guess*guess*guess+number)/(3*guess*guess);
    double cubedGuess=(guess*guess*guess);
    System.out.println("The appoximate cube root of "+ number +" is "+ guess);
    System.out.println("This cubed equals "+ cubedGuess);
    }//end of main method
}//end of class