//lab13 Sorting
//Noah Reifsnyde
//12/4/14
//CSE2
//Practice for sorting arrays
public class Sorting{
    public static void display(int[][]x){
        String out="";
        for (int i=0;i<5;i++){
            for (int j=0;j<x[i].length;j++){
                out+=x[i][j]+" ";
            }//ends loop
            out+="\n";
        }//ends loop
        System.out.print(out);
    }//ends display
    public static void main(String[] args){
        int[][]Array=new int[5][];
        for (int i=0;i<5;i++){
            Array[i]=new int[i*3+5];
            for (int j=0;j<Array[i].length;j++){
                Array[i][j]=(int)(Math.random()*40);
            }//ends loop, assiging ints to array
        }//ends loop, allocating arrays
        display (Array);
        int hold=0;
        int index=0;
        for (int i=0;i<5;i++){
            for (int j=0;j<Array[i].length;j++){
                hold=Array[i][j];
                index=j;
                for (int k=j+1;k<Array[i].length;k++){
                    if (Array[i][k]<hold){
                        hold=Array[i][k];
                        index=k;
                    }//ends if
                }//ends search loop
                Array[i][index]=Array[i][j];
                Array[i][j]=hold;
            }//ends loop
        }//ends loop
        display (Array);
    }//end main method
}//end class