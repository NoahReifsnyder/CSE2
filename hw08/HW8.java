import java.util.Scanner;
public class HW8{
    public static char getInput(Scanner myScanner, String list){
    	String scan;
    	myScanner= new Scanner (System.in);
        boolean loop=true;
        do{
        	scan=myScanner.next();
        	if (scan.length()==1){
        		for (int i=0; i<list.length();i++){
        			if (scan.charAt(0)==list.charAt(i)){
        				return scan.charAt(0);
        			}//ends if
        		}//ends for while
        		System.out.println("You didn't enter the correct character");
        	}//ends if
        	else{
        		System.out.println("You inputed too many characters, please try again.");
        	}//ends else
        	System.out.print("Please enter '"+list+"':");
        }while (loop);//loop for input selection
        return ' ';
    }//end method
    
    public static char getInput(Scanner myScanner, String list, int attempts){
    	String scan;
    	myScanner= new Scanner (System.in);
       	for (int k=0; k<attempts; k++){
        	scan=myScanner.next();
        	if (scan.length()==1){
        		for (int i=0; i<list.length();i++){
        			if (scan.charAt(0)==list.charAt(i)){
        				return scan.charAt(0);
        			}//ends if
        		}//ends for while
        		System.out.println("You didn't enter the correct character");
        	}//ends if
        	else{
        		System.out.println("You inputed too many characters, please try again.");
        	}//ends else
        	if (k!=(attempts-1)){
        		System.out.print("Please enter '"+list+"':");
        	}//ends if
        }//loop for input selection
        System.out.println("You failed after "+attempts+" attempts");
        return ' ';
    }//end method
    
   public static char getInput(Scanner myScanner, String question, String list){
    	String scan;
    	System.out.println(question);
    	String seperatedList=("Enter one of: '"+list.charAt(0)+"'");
    	for (int k=1; k<list.length(); k++){
    		seperatedList+=(", '"+list.charAt(k)+"'");
    	}//ends for while
    	seperatedList+=(":");
    	System.out.print(seperatedList);
    	myScanner= new Scanner (System.in);
        boolean loop=true;
        do{
        	scan=myScanner.next();
        	if (scan.length()==1){
        		for (int i=0; i<list.length();i++){
        			if (scan.charAt(0)==list.charAt(i)){
        				return scan.charAt(0);
        			}//ends if
        		}//ends for while
        		System.out.println("You didn't enter the correct character");
        	}//ends if
        	else{
        		System.out.println("You inputed too many characters, please try again.");
        	}//ends else
        	System.out.print(seperatedList);
        }while (loop);//loop for input selection
        return ' ';
    }//end method
    
    public static void main(String []arg){
    Scanner scan= new Scanner (System.in);
	char input;
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  
}
