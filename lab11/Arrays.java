//lab 11 Arrays
//Noah Reifsnyder
//12/4/14
//CSE2
//Practice working with and searching arrays
import java.util.Scanner;
public class Arrays{
    public static void main(String[] args){
        int[] Array =new int[10];
        int[] Reverse=new int [10];
        Scanner scan=new Scanner(System.in);
        int high;
        int low;
        int sum=0;
        System.out.println("Please enter 10 ints, one at a time");
        for (int i=0;i<10;i++){
            System.out.print("Enter int "+(i+1)+"-");
            Array[i]=scan.nextInt();
        }//end loop
        high=Array[0];
        low=Array[0];
        Reverse[0]=Array[9];
        for (int i=1;i<10;i++){
            if (Array[i]>high){
                high=Array[i];
            }//end if 
            if (Array[i]<low){
                low=Array[i];
            }//ends if
            sum+=Array[i];
            Reverse[i]=Array[(9-i)];
        }//end loop//finds high, low, sum, and new reverse array
        System.out.println("The highest int is "+high+" and the lowest int is "+low);
        System.out.println("The sum of the ints is "+sum);
        for (int i=0;i<10;i++){
            System.out.println(Array[i]+"  "+Reverse[i]);
        }//ends loop, printing arrays
    }//end main method
}//end class