//lab06 enigma 1
//12/4/14
//Noah Reifsnyder
//CSE2
import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 * This will compile, but the RE will be that you can't divide by 0 in case 40 ln13. fixed
 * 
 * 
 * 
 */
