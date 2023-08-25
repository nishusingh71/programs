package programs.PracticeQuestion.TwoDArr;

import java.util.Scanner;

public class diagonalSum {
    public static int diagonal(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
                else if(i+j==mat.length-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        
        
        
       System.out.println(diagonal(mat));
       sc.close();
    }
}
