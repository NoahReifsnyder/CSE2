//lab06 enigma 0
//12/4/14
//Noah Reifsnyder
//CSE2

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String[] arg ){
    int n=0;
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: break;
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   ln10:String[] args not String args []. 
 *   ln22:Declared n as an int again. Also declared int n outside of the if statements for clarity and to initialize it for later use (ln27)
 *   ln25 added a break so that when the sum is 24, it won't output that the sum is 25
 *   Explain the error(s) that occurred here, and then fix them
 */