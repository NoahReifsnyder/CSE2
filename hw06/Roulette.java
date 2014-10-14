//hw06-1-Roulette
//Noah Reifsnyder
//10-13-14
//CSE2
//
//This program will test a theory that betting on one Roulette number 100 times will make you money.
public class Roulette {
    public static void main(String[] args){
    // class and method declared
    int mainCounter=0;
    int secondCounter;
    int money;
    int loss=0;
    int profit=0;
    int wins=0;
    while (mainCounter<1000){ //the 1000 trials of 100 spins
        mainCounter++;
        secondCounter=0;
        money=0;
        int pick=(int)(Math.random()*38); //random pick
        while (secondCounter<100){ //the 100 set of spins
            secondCounter++;
            int spin=(int)(Math.random()*38); //random spin
            if (spin==pick){
                money+=36;
            }//ends if
        }//ends loop
        if (money==0){
            loss++;
        }//ends if
        else if (money>100){
            wins++;
        }//ends else if
        profit+=(money-100);
    }//ends loop
    System.out.println("There were "+loss+" times that everything was lossed");
    System.out.println("There were "+wins+" times that a profit was made");
    System.out.println("Over 1000 trials of 100 spins, the total profit was $"+profit);
    }//end main method
}//end class