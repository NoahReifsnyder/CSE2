//lab12 Array Math
//Noah Reifsnyder
//11/14/14
//CSE2
 //practicing working with Arrays, manipulating arrays
public class ArrayMath{
    public static void main(String [] arg){
        double x[]={2.3, 3, 4, -2.1, 82, 23},
        y[]={2.3, 3, 4, -2.1, 82, 23},
        z[]={2.3, 13, 14},
        w[]={2.3, 13, 14, 12}, 
        v[],
        u[]={2.3, 12, 14};
        v=addArrays(x,y);
        System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
        System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
        System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
        System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
        System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

    }//end of Main Method
  
    public static double[] addArrays(double x[], double y[]){
        int lengthX=x.length;
        int lengthY=y.length;
        double z[];
        if (lengthX>lengthY){
            z=new double[lengthX];
            for (int i=0;i<lengthY;i++){
                z[i]=x[i]+y[i];
            }//end for while 
            for (int i=lengthY;i<lengthX;i++)
                z[i]=x[i];
        }//end if
        else{
            z=new double[lengthY];
            for (int i=0;i<lengthX;i++){
                z[i]=x[i]+y[i];
            }//end for while 
            for (int i=lengthX;i<lengthY;i++)
                z[i]=y[i];
        }//end else
        return z;
    }//end of addArrays
    
    public static boolean equals(double x[], double y[]){
        boolean equals=true;
        if (x.length!=y.length){
            equals=false;
            return equals;
        }//end if
        for (int i=0;i<x.length;i++){
            if (x[i]!=y[i]){
                equals=false;
                return equals;
            }//end if
        }//end forwhile
        return equals;
    }//end equals
    
    public static String display(double [] x){
        String out="{";
        for(int j=0;j<x.length;j++){
            if(j>0){
                out+=", ";
            }
        out+=x[j];
        }
        return out+"}";
    }// end of String display
}//end of class
