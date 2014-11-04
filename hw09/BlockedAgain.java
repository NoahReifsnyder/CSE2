import java.util.Scanner;
public class BlockedAgain{
    public static boolean checkRange(int input){
        boolean inRange;
        if (input>0 && input<10){
            inRange=true;
        }//ends if
        else{
            inRange=false;
            System.out.println("Your input was not within the range (1-9). Please try again.");        }
        return inRange;
    }//ends checkRange
    
    public static Scanner checkInt(){
        Scanner myScanner=new Scanner(System.in);
        boolean loop=true;
        while (loop){
            System.out.print("Enter an int between 1 and 9:");
            if (myScanner.hasNextInt()){
                return myScanner;
            }//ends if
            else{
                System.out.println("You did not enter an int, please try again");
                myScanner.next();
            }
        }//ends loop
        return myScanner;
    }//ends checkInt
    
    public static int getInt(){
        Scanner myScanner;
        int input;
        boolean aInt;
        boolean loop=true;
        boolean range;
        while(loop){
            input=0;
            myScanner=checkInt();//runs checkInt method to make them enter an int
            input=myScanner.nextInt();
            range=checkRange(input);//runs checkRange method to see if the input is between 1-9
            if (range){
                return input;
            }//ends if
        }//ends while
        return 0;
    }//ends getInt
    /////////////////////////////////////////////////////////////////////// Above is all for getInt method. Below is allBlocks method
    public static String line(int m, int i){
        String output="";
        for (int k=1; k<=m-i; k++){
            output+=" ";
        }//ends for-while
        for (int j=0; j<(i-1)*2+1; j++){
            output+=i;
        }//ends for-while
            output+="\n";
            return output;
    }//ends line
    
    public static String block(int m, int i){
        String output="";
        for (int k=1; k<=i; k++){
            output+=line(m,i);
        }//end for-while
        for (int k=1; k<=m-i; k++){
            output+=" ";
        }//ends for-while
        for (int k=1; k<=(i-1)*2+1; k++){
            output+="-";
        }//ends for-while
        output+="\n";
        return output;
    }//ends block
    
    public static void allBlocks(int m){
        String output="";
        for(int i=1; i<=m; i++){
            output+=block(m,i);
        }//ends for-while
        System.out.print(output);
    }//ends allBlocks
    ///////////////////////////////////////////////////////////////////everything to do with method allBlocks is above, main method is below
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }
}
