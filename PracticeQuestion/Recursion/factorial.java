package programs.PracticeQuestion.Recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn=n*fact(n-1);
        return fn;
    }
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print(fact(n)+" ");
      sc.close();  
    }
}
