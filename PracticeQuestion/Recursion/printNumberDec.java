package programs.PracticeQuestion.Recursion;

import java.util.Scanner;

public class printNumberDec {
    public static void printDec(int n){
        if(n==1){
            //Base Case
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      printDec(n);
      sc.close();  
    }
}
