//hw10-1
//11/14/14
//Noah Reifsnyder
//CSE2
//practice with arrays, write methods to fit main method, checking for duplicates in arrays
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
    for(int j=0;j<10;j++){
    num[j]=scan.nextInt();
      }
    String out="The array ";
    out+=listArray(num); //return a string of the form "{2, 3, -9}"
      if(hasDups(num)){
    out+="has ";
      }
      else{
    out+="does not have ";
      }
    out+="duplicates.";
      System.out.println(out);
    out="The array ";
    out+=listArray(num);
      if(exactlyOneDup(num)){
    out+="has ";
      }
      else{
    out+="does not have ";
      }
    out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
    answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }//end of Main method

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
    out+=", ";
      }
    out+=num[j];
    }
    out+="} ";
    return out;
  }//end os listArray
  
    public static boolean hasDups(int x[]){
        int dups=0;
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x.length;j++){
                if (x[i]==x[j]){
                    dups+=1;
                }//end if
            }//ends forwhile
      }//end forwhile
      dups-=x.length;
      if (dups>0){
          return true;
      }//end if
      else{
          return false;
      }//ends else
  }//end hasDups
  
  public static boolean exactlyOneDup (int x[]){
      int dups=0;
      for (int i=0;i<x.length;i++){
          for (int j=0;j<x.length;j++){
              if (x[i]==x[j]){
                  dups+=1;
              }//end if
            }//ends forwhile
      }//end forwhile
      dups-=x.length;//it will always match with it self
      if (dups==2){//its 2 because the dup is found twice, once for the first showing, and once for the second showing
          return true;
      }//end if
      else{
          return false;
      }//ends else
  }//end exactlyOneDub
}//end of class
