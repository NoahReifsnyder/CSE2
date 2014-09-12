//hw03-1-Bicycle
//9/12/14
//Noah Reifsnyder
//CSE002
//
//This program should take the input of counts of wheel rotations and seconds of bicycle trip
//and output the distance traveled, the time of travel, and the average mph
import java.util.Scanner; //imported Scanner to allow my program to recieve inputs
public class Bicycle{
    public static void main(String[] args){
    //creat class and main method
    Scanner myScanner;
    myScanner = new Scanner ( System.in); //commands to allow the scanner to work
    System.out.print("Enter the number of seconds for your trip:");
    int nSeconds= myScanner.nextInt () ; //recieve time of travel
    System.out.print("Enter the amount of wheel rotations:");
    int nCounts= myScanner.nextInt () ; //recieve count of wheel rotations
    //define wheel diameter, value of pi, inches in a mile, and seconds in a minute to use in calculations
    int wheelDiamter=27;
    double pi=3.14159;
    int inchesPerMile=63360;
    int secondsPerMinute=60;
    //
    double distance= (nCounts*wheelDiamter*pi); //calculation to find inches traveld
    distance/= inchesPerMile; //converting inches to miles
    double time= nSeconds/secondsPerMinute; //calculation to take the seconds and convert to minutes
    //
    double mph= distance/time;
    mph*=60; //calculating the average mph of the trip
    //cast the time, distance, and speed to remove the excess decimal places;
    time*=10;
    time=(int) time;
    time/=10;
    distance*=100;
    distance=(int) distance;
    distance/=100;
    mph*=100;
    mph=(int) mph;
    mph/=100;
    
    //print out the calculated distance, time, and average mph to the user
    System.out.println("The distance traveld was "+ distance +" miles and the trip took "+ time +" minutes.");
    System.out.println("The average mph was "+ mph);
    
    }//end of main method
}//end of class
    