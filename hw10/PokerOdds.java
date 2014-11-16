import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] arg){
        showHands();
        simulateOdds();
    }//end main method
    public static void showHands(){
        Scanner myScanner=new Scanner (System.in);
        int deck[]=new int[52];
        int hand[]=new int[5];//allocate for my arrays
        String clubs, diamonds, hearts, spades, out, input;
        boolean loop;
        do{
            loop=false;
            clubs=""; diamonds=""; hearts=""; spades=""; out="";
            int suit;
            for (int i=0; i<52; i++){//fill in a deck of 52 cards
                deck[i]=i;
            }//end forwhile
            for (int i=0; i<5; i++){
                int x=(int)(Math.random()*(52-i));//generates a number from 0-51, represent cards in a deck
                hand[i]=deck[x];
                deck[x]=deck[51-i];//puts the last card into the taken cards spot
            }//end forwhile
            for (int i=0;i<5;i++){
                suit=(int)(hand[i]/13);
                switch (suit){
                    case 0://if its a club
                        switch (hand[i]%13){
                            case 12:
                                clubs+="A ";
                                break;
                            case 11:
                                clubs+="K ";
                                break;
                            case 10:
                                clubs+="Q ";
                                break;
                            case 9:
                                clubs+="J ";
                                break;
                            default:
                                clubs+=hand[i]%13+1+" ";
                                break;
                        }//end switch
                        break;
                    case 1://if its a diamond
                        switch (hand[i]%13){
                            case 12:
                                diamonds+="A ";
                                break;
                            case 11:
                                diamonds+="K ";
                                break;
                            case 10:
                                diamonds+="Q ";
                                break;
                            case 9:
                                diamonds+="J ";
                                break;
                            default:
                                diamonds+=hand[i]%13+1+" ";
                                break;
                        }//end switch
                        break;
                    case 2://if its a heart
                        switch (hand[i]%13){
                            case 12:
                                hearts+="A ";
                                break;
                            case 11:
                                hearts+="K ";
                                break;
                            case 10:
                                hearts+="Q ";
                                break;
                            case 9:
                                hearts+="J ";
                                break;
                            default:
                                hearts+=hand[i]%13+1+" ";
                                break;
                        }//end switch
                        break;
                    case 3://if its a spade
                        switch (hand[i]%13){
                            case 12:
                                spades+="A ";
                                break;
                            case 11:
                                spades+="K ";
                                break;
                            case 10:
                                spades+="Q ";
                                break;
                            case 9:
                                spades+="J ";
                                break;
                            default:
                                spades+=hand[i]%13+1+" ";
                                break;
                        }//end switch
                        break;
                }//end switch
            }//end forwhile
            out="Clubs: "+clubs+"\nDiamonds: "+diamonds+"\nHearts: "+hearts+"\nSpades: "+spades;
            System.out.print(out+"\n\nGo again? Enter 'y' or 'Y', anything else to quit-");
            input=myScanner.next();
            if (input.equals("Y") || input.equals("y")){
                loop=true;
            }//end if
        }while(loop);
    }//end showHands
    public static void simulateOdds(){
        int[] duplicates= new int[13];//see which card is the dup.
        int deck[]=new int[52];
        int hand[]=new int[5];//allocate for my arrays
        int numDups=0;
        String out="";
        for (int i=0; i<13; i++){
            duplicates[i]=0;
        }//end forwhile//initialize duplicates
        for (int j=0; j<10000; j++){
            for (int i=0; i<52; i++){//fill in a deck of 52 cards
                deck[i]=i;
            }//end forwhile
            for (int i=0; i<5; i++){
                int x=(int)(Math.random()*(52-i));//generates a number from 0-51, represent cards in a deck
                hand[i]=deck[x];
                deck[x]=deck[51-i];//puts the last card into the taken cards spot
                if (FindDuplicates.exactlyOneDup(hand)){
                    duplicates[(int)(hand[i]/4)]+=1;   
                }//end if
            }//end forwhile
        }//end for while
        out+="rank    freq of exactly one pair\n";
        for (int i=12; i>-1; i--){
            switch (i){
                case 12:
                    out+="  A      "+duplicates[i]+"\n";
                    break;
                case 11:
                    out+="  K      "+duplicates[i]+"\n";
                    break;
                case 10:
                    out+="  Q      "+duplicates[i]+"\n";
                    break;
                case 9:
                    out+="  J      "+duplicates[i]+"\n";
                    break;
                default:
                out+="  "+(i+2)+"      "+duplicates[i]+"\n";
            }//end switch to compile string
            numDups+=duplicates[i];
        }//ends forwhile
        numDups=10000-numDups;
        out+="------------------\n total not exactly one pair: "+numDups;
        System.out.println(out);
    }//end simulateOdds
}//end class