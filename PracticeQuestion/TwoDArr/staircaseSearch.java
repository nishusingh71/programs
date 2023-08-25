package programs.PracticeQuestion.TwoDArr;

import java.util.Scanner;

public class staircaseSearch {
    public static boolean staircase(int mat[][],int key){
        int row=0,col=mat[0].length-1;
        while(row<mat.length&&col>=0){
            if(mat[row][col]==key){
                System.out.print("found Key at ("+row+","+col+")");
                return true;
            }else if(key<mat[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not found ");
        return false;
    }
    public static void main(String[] args) {
         Scanner  sc=new Scanner(System.in);
       int mat[][]=new int[4][4];
       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            mat[i][j]=sc.nextInt();
        }
       }
       int key =15;
       staircase(mat,key);
       sc.close();
    }
}
