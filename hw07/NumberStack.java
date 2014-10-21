//hw07-NumberStack
//Noah Reifsnyder
//10/20/14
//CSE2
//Practicing using loops, stacking numbers using loops
import java.util.Scanner;
public class NumberStack{
public static void main(String[] args){
    //define class and main method
    Scanner myScanner=new Scanner (System.in);//define scanner
    int input=0;
    boolean loop=true;
    do{
    System.out.print("Enter a number between 1 and 9:");
    if (myScanner.hasNextInt()){
        input=myScanner.nextInt();
        loop=false;
    }//ends if
    else{
        System.out.println("You did not enter an int, please try again.");
        myScanner.next();
    }//ends else
    if ((input<1 || input>9) && (!loop)){
        System.out.println("Number entered was outside of range (1-9) please try again.");
        loop=true;
    }//ends if 
    }while (loop);//loops do while
    //Makes sure input is valid for my program.
    int i;//first nest
    int j;//second nest
    int k;//third nest
    int space=input-1;//to center the numbers
    System.out.println("Using for loops:");
    for (i=0; i < (input); i++){
        for (j=0; j<(i+2); j++){
            for (k=0; k<space; k++){
                System.out.print(" ");
            }//ends for loop
            for (k=0; k < (2*i+1); k++){
                if (j==(i+1) && j!=0){
                    System.out.print("-");
                }//ends if
                else {
                    System.out.print(i+1);
                }//ends else
            }//ends for loop  
            System.out.println();
        }//ends for loop
        space--;
    }//ends for loop
    System.out.println("Using while loops:");
    i=0;
    j=0;
    k=0;
    space=input-1;
    while (i<input){
        while (j<i+2){
            while (k<space){
                System.out.print(" ");
                k++;
            }//ends while
            k=0;
            while (k<(2*i+1)){
                 if (j==(i+1) && j!=0){
                    System.out.print("-");
                }//ends if
                else {
                    System.out.print(i+1);
                }//ends else
                k++;
            }//ends while
            k=0;
            j++;
            System.out.println();
        }//ends while
        j=0;
        space--;
        i++;
    }//ends while
    System.out.println("Using do-while loops:");
    i=0;
    j=0;
    k=0;
    space=input-1;
    do{
        do{
            do{
                if (space!=0){
                    System.out.print(" ");
                    k++;
                }//ends if
            }while (k<(space));//ends while
            k=0;
            do{
                 if (j==(i+1) && j!=0){
                    System.out.print("-");
                }//ends if
                else {
                    System.out.print(i+1);
                }//ends else
                k++;
            }while (k<(2*i+1));//ends while
            k=0;
            j++;
            System.out.println();
        }while (j<i+2);//ends while
        j=0;
        space--;
        i++;
    }while (i<input);//ends while
    }//ends main method
}//ends class