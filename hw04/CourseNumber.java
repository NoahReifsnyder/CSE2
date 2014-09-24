//hw04-3-CourseNumber
//Noah Reifsnyder
//9/22/14
//CSE2
//
//this program will print out the number of days in a given month, accounting for leap years
import java.util.Scanner;
public class CourseNumber{
    public static void main(String[] args){
    //declared class and main method
    Scanner myScanner;
    myScanner = new Scanner ( System.in ); //declared my scanner to accept input
    System.out.print("What is the 6 digit course number?:");
    int courseNumber;
    int year;
    int semester;
    int semesterCheck;
    String semesterName="semester";//initialized it
    if (myScanner.hasNextInt()){
        courseNumber=myScanner.nextInt();
    }//ends if
    else{
        System.out.print("You didn't enter a valid input.");
        return;
    }//ends else, exits
    if (courseNumber<=186509 || courseNumber>=201441){
        System.out.println("The number was outside of the range (186510,201440)");
        return;//exits program
    }//ends if
    year=courseNumber/100;
    semester=courseNumber-(year*100);
    semesterCheck=semester/10;
    semesterCheck=semester-(semesterCheck*10);
    System.out.println(year+"   "+semester+"   "+semesterCheck);
    if (semesterCheck!=0){
        System.out.println(semester+" is not a valid semester number.");
        return;
    }//ends if, exits program
    switch (semester){
        case 10:
            semesterName="Spring";
            break;
        case 20:
            semesterName="Summer 1";
             break;
        case 30:
            semesterName="Summer 2";
             break;
        case 40:
            semesterName="Fall";
             break;
        default:
            System.out.println(semester+" is not a valid semester number.");
            return;
    }//end of switch
    System.out.println("The course was offered in the "+semesterName+" semester in the year "+year);
    }//ends main method
}//ends class