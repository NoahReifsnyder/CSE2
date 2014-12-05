//lab 7 MoreLoops
//Noah Reifsnyder
//12/4/14
//CSE2
//practice with loops, changing loops
import java.util.Scanner;
public class MoreLoops{
	public static void main(String[] arg){
    Scanner myScanner=new Scanner(System.in);
    //int n=0;
    //System.out.print("Enter an int- ");
    //while(!scan.hasNextInt()){
    //	scan.next(); //get rid of the junk entered by user
    //	System.out.print("You did not enter an int; try again- ");
    int n=0;
    System.out.print("Enter an int- ");
    if (!myScanner.hasNextInt()){
        do{
            myScanner.next();//get rid of the junk entered by user
            System.out.print("You did not enter an int; ty again- ");
        }while (!myScanner.hasNextInt());//loops do while
    }//ends if
    //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
    //DO-WHILE LOOP
    //	n=scan.nextInt();
    //for(int j=0;j<n && j<40;j++){
    //	for(int k=0;k<j+1;k++){
   	//    System.out.print('*');
    //	}
    //	System.out.println();
    //}
    n=myScanner.nextInt();
    int j=0;
    int k=0;
    while (j<n && j<40){
        k=0;
        while (k<j+1){
            k++;
            System.out.print('*');
        }//end while
        j++;
        System.out.println();
    }//ends while
    //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
    //WHILE STATEMENTS
 	 
    //int k=4;
    //do{
    //	System.out.println("k="+k);
    //	k++;
    //}
    //while(k<4);
    k=4;
    System.out.println("k="+k);
    k++;
    while (k<4){
            System.out.println("k="+k);
        	k++;
    }//end while
    //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
    //WITH A WHILE LOOP

    //int count=0;
    //   while(true){
    //	    switch(n){
    //	        default: System.out.println(n + " is > 5 or <1");
   	//                    break;
    //	        case 1:
    //	        case 2: System.out.print("Case 2 ");
   	//                    continue;
    //	        case 3: break;
    //	        case 4: System.out.println("Case 4");
    //	        case 5: System.out.println("Case 5");
   	//                  break;
    //	}
    //	count++;
    //	if(count>10)
   	//      break;
    //}
    //
    for (int count=0; count < 11 ; count++){
        if (n==1){
            System.out.print("Case 2 ");
            count=0;     
        }//ends if
        else if (n==2){
            System.out.print("Case 2 ");
            count=0;  
        }//ends else if
        else if (n==4){
            System.out.println("Case 4");
            System.out.println("Case 5");
        }//ends else if
        else if (n==5){
            System.out.println("Case 5");
        }//ends else if
        else {
            System.out.println(n + " is > 5 or <1");
        }//ends else
    }//ends for while
    
    
    //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE USING
    // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
    //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
    //   -5, 1, 20, 5, ETC.
    //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
    //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
	}//ends main method
}//ends class
