package programs.PracticeQuestion.TwoDArr;

import java.util.Scanner;

public class printSpiralEx {
    public static void printSpiral(int mat[][]){
    int sr=0;
    int sc=0;
    int er=mat.length-1;
    int ec=mat[0].length-1;
    while(sr<=er&&sc<=ec){
        //top
        for(int j=sc;j<=ec;j++){
            System.out.print(mat[sr][j]+" ");
        }
        //right
        for(int i=sr+1;i<=er;i++){
            System.out.print(mat[i][ec]+" ");
        }
        //bottom
        for(int j=ec-1;j>=sc;j--){
            if(sc==er){
                break;
            }
            System.out.print(mat[er][j]+" ");
        }
        //left
        for(int i=er-1;i>=sr+1;i--){
            if(sc==ec){
                break;
            }
         System.out.print(mat[i][sc]+" ");
        }
        sc++;

        
        sr++;
        ec++;
        er++;
    }
    System.out.println();
    }
    public static void main(String[] args) {
       Scanner  sc=new Scanner(System.in);
       int mat[][]=new int[4][4];
       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            mat[i][j]=sc.nextInt();
        }
       }
       printSpiral(mat);
       sc.close();
    }
}
