//hw11-2 MatrixSorter
//12/4/14
//Noah Reifsnyder
//CSE2
//make and sort 3d ragged arrays
public class MatrixSorter{
    public static int[][][] buildMat3d(){
        int[][][]x=new int[3][][];
        for (int i=0; i<3;i++){
            x[i]=new int[3+2*i][];
            for(int j=0;j<(3+2*i);j++){
                x[i][j]=new int[i+j+1];
                for (int k=0;k<(i+j+1);k++){
                    x[i][j][k]=(int)(Math.random()*100);
                }//ends loop
            }//ends loop
        }//ends loop
        return x;
    }//ends buildMat3d
    public static void show(int[][][] x){
        String out="";
        for (int i=0;i<3;i++){
            out+="-------------------Slab"+(i+1)+"\n";
            for (int j=0;j<(3+2*i);j++){
                for (int k=0;k<x[i][j].length;k++){
                    out+=x[i][j][k]+" ";    
                }//ends loop
                out+="\n";
            }//ends loop
        }//ends loop
        System.out.println(out);
    }//ends show
    public static int findMin(int[][][] x){
        int min=100;
         for (int i=0;i<3;i++){
            for (int j=0;j<(3+2*i);j++){
                for (int k=0;k<(i+j+1);k++){
                    if (x[i][j][k]<min){
                        min=x[i][j][k];
                    }//end if
                }//ends loop
            }//ends loop
        }//ends loop
        return min;
    }//end findMin
    public static void sort (int[][] x){
        int[][] y=new int [7][];
        for (int i=0;i<7;i++){
            y[i]=new int[3+i];
        }//end loop
        int hold;
        for (int i=0;i<7;i++){
            for (int j=0;j<i+3;j++){
                for (int k=j+1;k<(i+3);k++){
                    if(x[i][k]<x[i][j]){
                        hold=x[i][j];
                        x[i][j]=x[i][k];
                        x[i][k]=hold;
                    }//end if
                }//ends loop
            }//ends loop
        }//ends loop
        for (int i=0;i<7;i++){
            for (int j=i;j>0;j--){
                if (x[j][0]<x[j-1][0]){
                    y[j-1]=new int [x[j-1].length];
                    for (int k=0;k<x[j-1].length;k++){
                        y[j-1][k]=x[j-1][k];
                    }//end loop
                    x[j-1]=new int [x[j].length];
                    for (int k=0; k<x[j].length;k++){
                        x[j-1][k]=x[j][k];
                    }//end loop
                    x[j]=new int [y[j-1].length];
                    for (int k=0; k<x[j].length;k++){
                        System.out.println(i+" "+j+" "+k);
                        x[j][k]=y[j-1][k];
                    }//end loop
                }//end if
            }//end loop
        }//end loop
    } //end sort
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+
      			findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
   }//end main
}//end class
