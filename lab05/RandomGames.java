//lab05-RandomGames
//Noah Reifsnyder
//9/26/14
//CSE2
//
//This program should ask for a game, and then output a random number associated with that game. Roulette craps or pick a card
import java.util.Scanner; //import scanner
public class RandomGames{
    public static void main(String[] args){
    //declared class and main method
    Scanner myScanner;
    myScanner = new Scanner ( System.in ); //declared my scanner to accept input
    System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card:");
    String game;
    int roulette;
    game=myScanner.next();
    if (game.length()==1){ //only one letter entered
        switch (game){ //options for what was entered
            case "r":
            case "R":
                roulette=(int)(Math.random()*38);
                if (roulette==37){
                    System.out.println("Roulette:00");}
                else{
                    System.out.println("Roulette:"+roulette);}
                return;
            case "c":
            case "C":
                System.out.println ("Craps option is yet to be implemented");
                return;//exits
            case "P":
            case "p":
               System.out.println ("Picking a card option is yet to be implemented"); 
               return;//exits
            default : 
                System.out.println("(R/r/C/c/P/p) expected");
                return;//exits
        }//ends switch
    }//ends if
    else { //more than one letter entered
        System.out.println("Single character expected");
        return;//exits
    }//ends else
    }//ends main method
}//ends class