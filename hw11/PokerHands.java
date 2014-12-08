import java.util.Scanner;
public class PokerHands {
    public static void checkHand(int hand[]){
        int[] frequency=new int[13];
        int[] pattern=new int [5];
        int[] suits=new int [5];
        boolean flush=false;
        boolean straight=false;
        boolean checkRoyal=false;
        String out="hi";
        int inARow=0;
        int result=0;
        for (int i=0;i<13;i++){
            frequency[i]=0;
            if (i<5){
                pattern[i]=0;
                suits[i]=0;
            }//ends if
        }//ends loop
        for (int i=0;i<5;i++){
            suits[(int)(hand[i]/13)]+=1;
            frequency[hand[i]%13]+=1;
        }//ends loop
        if (frequency[12]==1){
            checkRoyal=true;
        }//end if
        for (int i=0;i<4;i++){
            if (suits[i]==5){
                flush=true;
            }//ends if
        }//ends loop
        for (int i=0;i<5;i++){
            for (int j=0;j<13;j++){
                if (frequency[j]==1){
                    inARow++;
                }//ends if
                else{
                    inARow=0;
                }//ends else
                if (inARow==5){
                straight=true;
            }//ends if
                if (frequency[j]==i){
                    pattern[i]+=1;
                }//ends if
            }//ends loop
        }//ends loop

        for (int i=2;i<5;i++){
            if (i==3&&result==3){
                result++;
            }//end if
            if (i==4&&result==4){
                result=3;
            }//end if
            result+=pattern[i]*pattern[i];
            if (result==0){
                result+=3;
            }//end if
        }//ends loop
        switch (result){
            case 1:
                out="This hand has one pair";
                if (flush){
                    out="This hand is a flush";
                }//end if
                break;
            case 2:
                out="This hand is a full house";
                 break;
            case 3:
                if (flush){
                    out="This hand is a flush";
                    if (straight){
                        out="This hand is a striaght flush";
                        if (checkRoyal){
                            out="This hand is a royal flush";
                        }//end if
                    }//end if
                }//end if
                else if (straight){
                    out="This hand is a straight";
                }//end if
                else{
                    out="This is a high card hand";
                }//end else
                 break;
            case 4:
                out="This hand has two pairs";
                if (flush){
                    out="This hand is a flush";
                }//end if
                 break;
            case 5:
                out="This hand has three of a kind";
                if (flush){
                    out="This hand is a flush";
                }//end if
                 break;
            case 6:
                out="This hand has four of a kind";
        }//ends swith
        System.out.println(out);
        System.out.println(flush);
        System.out.println(straight);
    }//ends checkHand
    public static void showOneHand(int hand[]){
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
    	String face[]={
          "2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ",
      	"J ","Q ","K ","A "};
    	String out="";
    	for(int s=0;s<4;s++){
      	out+=suit[s];
      	for(int rank=0;rank<13;rank++)
        	for(int card=0;card<5;card++)
         	if(hand[card]/13==s && hand[card]%13==rank)
          	out+=face[rank];
      	out+='\n';
    	}
    	System.out.println(out);
    }//ends showOneHand
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        boolean loop=true;
        String newHand;
        String suit;
        String face;
        int suitVal=0;
        int faceVal=0;
        int[] deck=new int[52];
        for (int i=0;i<52;i++){
            deck[i]=i;
        }//ends for loop
        String[] suits={ "c", "d", "h", "s"};
        String[] faces={ "2","3","4","5","6","7","8","9","10","j","q","k","a"};
        int[] hand=new int[5];
        do{
            System.out.print("Enter 'Y' or 'y' to enter a(nother) hand- ");
            newHand=scan.next();
            if (!newHand.equals("y") && !newHand.equals("Y")){
                    break;
            }//ends if
            for (int i=0;i<5;i++){
                hand[i]=-1;
            }//ends loop
            for(int j=0;j<5;j++){
                do{
                    System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
                    suit=scan.next();
                    loop=true;
                    for (int i=0; i<4; i++){
                        if (suit.equals(suits[i])){
                            loop=false;
                            break;
                        }//ends if
                        if (i==3){
                            System.out.println("You did not enter a valid response");
                        }//ends if
                    }//ends loop to check suits
                }while (loop);//ends loop to get suit
                loop=true;
                do{
                    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ... '2'- ");
                    face=scan.next();
                    for (int i=0;i<13;i++){
                        if (face.equals(faces[i])){
                            loop=false;
                            break;
                        }//ends if
                        if (i==12){
                            System.out.println("You did not enter a valid response");
                        }//ends if
                    }//ends loop for checking face validity
                }while(loop);//ends loop for face
                loop=true;
                switch (suit){
                    case "c": 
                        suitVal=1;
                        break;
                    case "h": 
                        suitVal=3;
                        break;
                    case "d": 
                        suitVal=2;
                        break;
                    case "s": 
                        suitVal=4;
                        break;
                }//end switch
                switch (face){
                    case "a":
                        faceVal=12;
                        break;
                    case "k":
                        faceVal=11;
                        break;
                    case "q":
                        faceVal=10;
                        break;
                    case "j":
                        faceVal=9;
                        break;
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                    case "10":
                         faceVal=(Integer.parseInt(face)-2);
                       
                }//end switch
                hand[j]=(faceVal+(13*(suitVal-1)));
                for (int i=0;i<5;i++){
                    if (hand[j]==hand[i]&& i!=j){
                        System.out.println("You already entered that card, please try again");
                        j--;
                        break;
                    }//ends if 
                }//ends loop
            }//ends for while to make hande
            showOneHand(hand);
            checkHand(hand);
        }while (loop);//ends program loop
    }//end main method
}//ends class
    