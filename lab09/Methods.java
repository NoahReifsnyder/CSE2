//lab 9 Methods
//Noah Reifsnyder
//12/4/14
//CSE2
//Practice using methods
import java.util.Scanner;
public class Methods{
    public static int getInt(int input){
        Scanner scan=new Scanner(System.in);
        boolean loop=false;
	    System.out.print("Enter an int:");
	    do{
	       if (scan.hasNextInt()){
	            input=scan.nextInt();
	            loop=true;
	       }//ends if
            else {
	           scan.next();//clears input
	           System.out.print("You did not enter an int, pleast try again:");
	           loop=false;
	        }
	    }while(!loop);//loops till an int is entered
	    return input;//returns the value entered when method is called
	}//ends getInt method
	public static int larger(int a,int b){
        if (a>b){
    	    return a;
    	}//ends if 
    	else{
            return b;
    	}//ends else
	}//ends method larger
	public static boolean ascending (int a, int b, int c){
	    if (a<=b && b<=c){
	        return true;
	    }//ends if
	    else {
	        return false;
	    }//ends else
	}//ends method ascending
    public static void main(String [] arg){
	    Scanner scan=new Scanner(System.in);
	    int a,b,c;
	    int input=0;
    	System.out.println("Enter three ints");
    	a=getInt(input);
    	b=getInt(input);
    	c=getInt(input);
    	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    	System.out.println("The larger of "+a+", "+b+", and "+c+" is "+larger(a,larger(b,c)));
    	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+	", and "+c+" are in ascending order");
        
    }//ends main method
}//ends class