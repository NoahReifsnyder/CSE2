//hw04-1-Incometax
//Noah Reifsnyder
//9/19/14
//CSE2
//
//This program will output the tax on an inputed income amount in the thousands of dollars
import java.util.Scanner;
public class IncomeTax{
    public static void main(String[] args){
    //declared class and main method
    Scanner myScanner;
    myScanner = new Scanner ( System.in ); //declared my scanner to accept input
    int income;
    double taxPercent=0;
    double taxAmount;
    System.out.print("Please enter you income in the thousands of dollars:") ;
    if (myScanner.hasNextInt()) {
        income=myScanner.nextInt() ;
    }//end if
    else {
        System.out.println("You didn't enter an integer");
        return;
    }//end else
    if (income <0)
        {System.out.println("You didn't enter a positive integer");
        return;}
    if (income >77) 
        {taxPercent =.14;}
    if (income <78) 
        {taxPercent =.12;}
    if (income <40)
        {taxPercent =.07;}
    if (income <20) 
        {taxPercent =.05;}
    income*=1000;
    taxAmount=income*taxPercent;
    taxAmount*=100;
    taxAmount=(int) taxAmount;
    taxAmount/=100;
    taxPercent*=100;
    taxPercent=(int) taxPercent;
    System.out.println("The tax rate on $"+ income +" is "+ taxPercent +"%, and the tax is $"+ taxAmount);
    }//end of main method
}//end of class
        
