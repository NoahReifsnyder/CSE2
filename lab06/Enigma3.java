//lab06 enigma 3
//12/4/14
//Noah Reifsnyder
//CSE2
/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    System.out.println(n+"  "+k);
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    System.out.println(n+"  "+k);
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
        System.out.println(n+"  "+k);
        break;
      default:
        n-=3;
        k-=5;
        System.out.println(n+"  "+k);//WHEN K TURNS TO 0, WAS A FALL THROUGH FROM 98.
    }
    System.out.println(n+"  "+k);
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * insert break at line 51 to prevent fall through, stop k from becoming 0
 * 
 * 
 * 
 */