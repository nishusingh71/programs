package programs.PracticeQuestion.Recursion;

import java.util.Scanner;

public class tiling {
    public static int tilingProblem(int n){
        //2Xn
        if(n==0||n==1){
          return 1;
        }
        int fnm1=tilingProblem(n-1);
        int fnm2=tilingProblem(n-2);
        int totWays=fnm1+fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    //   int x=sc.nextInt();
      int n=sc.nextInt();
      System.out.println(tilingProblem(n));
      sc.close();  
    }
}
