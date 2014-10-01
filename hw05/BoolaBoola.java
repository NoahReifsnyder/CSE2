//hw05-2-BoolaBoola
//Noah Reifsnyder
//9/29/14
//CSE2
//
//This program will randomly generate a question to see if you can tell if an output will be true or false
import java.util.Scanner; //import scanner
public class BoolaBoola{
    public static void main(String[] args){
    //declared class and main method
    Scanner myScanner;
    myScanner = new Scanner ( System.in ); //declared my scanner to accept input
    boolean one;
    int first;
    boolean two;
    int second;
    boolean three;
    int third;
    //the three booleans needed for the program to generate a question
    //the ints are for the random numbers to assign values to the booleans
    String operatorOne;
    int firstOperator;
    String operatorTwo;
    int secondOperator;
    //These will define the operators in the question
    boolean operatorBoolOne;
    boolean operatorBoolTwo;
    //to help with finding the answer
    boolean answer;
    //the answer value
    String inputGuess;
    boolean guess;
    //guessed answer
    first=((int)(Math.random()+.5));
    second=((int)(Math.random()+.5));
    third=((int)(Math.random()+.5));
    firstOperator=((int)(Math.random()+.5));
    secondOperator=((int)(Math.random()+.5));
    if (first==1){
        one=true;
    }//ends if
    else{
        one=false;
    }//ends else
    if (second==1){
        two=true;
    }//ends if
    else{
        two=false;
    }//ends else
    if (third==1){
        three=true;
    }//ends if
    else{
        three=false;
    }//ends else
    if (firstOperator==1){
        operatorBoolOne=true;
        operatorOne="&&";
    }//ends if
    else{
        operatorOne="||";
        operatorBoolOne=false;
    }//ends else
    if (secondOperator==1){
        operatorTwo="&&";
        operatorBoolTwo=true;
    }//ends if
    else{
        operatorTwo="||";
        operatorBoolTwo=false;
    }//ends else
    if (operatorBoolOne){
        if (operatorBoolTwo){
            answer=one&&two&&three;
        }//ends if
        else{
            answer=one&&two||three;
        }//ends else
    }//ends if
    else{
        if (operatorBoolTwo){
            answer=one||two&&three;
        }//ends if
        else{
            answer=one||two||three;
        }//ends else
    }//ends else
    System.out.println("Does "+one+" "+operatorOne+" "+two+" "+operatorTwo+" "+three+" have the value true (T,t) or false (F,f):");
    inputGuess=myScanner.next();
    if (inputGuess.length()==1){
        switch (inputGuess){
            case "T":
            case "t":
                guess=true;
                break;
            case "F":
            case "f":
                guess=false;
                break;
            default:
                System.out.println("(T,t,F,f) expected");
                return;
        }//ends switch
    }//ends if
    else{
        System.out.println("Single character expected");
        return;
    }//ends else
    if (guess){
        if (answer){
            System.out.println("Correct");
        }//ends if
        else{
            System.out.println("Incorrect");
        }//ends else
    }//ends if
    else{
        if (answer){
            System.out.println("Incorrect");
        }//ends if
        else{
            System.out.println("Correct");
        }//ends else
    }//ends else
    System.out.println(answer);
    }//ends main method
}//ends class