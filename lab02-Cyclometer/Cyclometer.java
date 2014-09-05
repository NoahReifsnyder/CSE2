//lab02-Cyclometer
//9/5/14
//Noah Reifsnyder
//CSE002
//A program to print minutes of each trip, counts for each trip,
//distance in miles, and distance of two trips combined
//
//Defining class
public class Cyclometer{
    //main method
    public static void main(String[] args ){
        int secsTrip1=480; //time for trip 1
        int secsTrip2=3220; //time for trip2
        int countsTrip1=1561; //wheel rotation for trip 1
        int countsTrip2=9037; //wheel rotations for trip 2
        double wheelDiamter=27.0, //diameter of wheel
        PI=3.14159, //value of pi
        feetPerMile=5280, //feet in a mile
        inchesPerFoot=12, //inches in a foot
        secondsPerMinute=60; //seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance;
        //outputting the minutes each trip took
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute) +" minutes and had " +
            countsTrip2+" counts.");
        //calculations for distance of trip 1 and 2 and total distance traveled
        distanceTrip1=countsTrip1*wheelDiamter*PI;
        // Above gives distance traveled for trip one
        // (each count is a rotation of the wheel)
        distanceTrip1 /=inchesPerFoot*feetPerMile; // Gives trip 1 distance in miles
        distanceTrip2=countsTrip2*wheelDiamter*PI/inchesPerFoot/feetPerMile;
        // Above gives distance for trip two in miles
        totalDistance=distanceTrip1+distanceTrip2; //total distance traveled
        //
        //output distances traveled
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    } //end of main methoid
} //end of class