package programs.PracticeQuestion.TwoDArr;

public class TransposeEx {

    public static void main(String[] args) {
        int row=2,col=3;
        int [][] mat={{2,3,7},{5,6,7}};
        printMat(mat);
        //Transpose
        int [][] trans=new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                trans[j][i]=mat[i][j];
            }
        }
        printMat(trans);
    }

    public static void printMat(int[][] mat) {
    System.out.println("The matris is :");
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
    }
}
