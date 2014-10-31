//lab 10-Method Calls
//10/31/14
//Noah Reifsnyder
//CSE2
//This program is to practice calling methods inside methods, while still practicing methods.

public class MethodCalls{
    public static int addDigit(int first, int second){
        boolean negative=false;
        if (first<0){
            first*=-1;
            negative=true;
        }//ends if
        int check=String.valueOf(first).length();//how many digits in first variable;
        int multiplier=1;
        int output=0;
        if (second>0 && second<10){
            for (int i=0; i<check ; i++){//getting the multiplier for int second so i can add it infront of first
                multiplier*=10;
            }//ends for while. 
            second*=multiplier;
            output=second+first;
            if (!negative){
                return output;
            }//ends if
            else{
                output*=-1;
                return output;
            }//ends else
        }//ends if
        else{
            return first;
        }//ends else
    }//end addDigit method
    
    public static int join(int first, int second){
        int check;
        int output=second;
        int digit;
        boolean negative=false;
        if (first<0){
            first*=-1;
            negative=true;
        }//ends if
        check=String.valueOf(first).length();
        for (int i=0; i<check; i++){
            digit=first%10;
            output=addDigit(output,digit);
            first-=digit;
            first/=10;
        }//ends for while
        if (negative){
            output*=-1;
        }
        return output;
    }//ends method join
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
        /*Add 3 to 784 to get 3784
        Add 3, 4, and 5 to 784 to get 543784
        Add 3 to -98 to get: -398
        Join 784 to 22 to get 78422
        Join 87, 42, and 83 to get 874283
        Join -9 and -90 to get 990*/
    }//end main method
}//end class
