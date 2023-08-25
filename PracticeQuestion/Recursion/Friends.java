package programs.PracticeQuestion.Recursion;

import java.util.Scanner;

public class Friends {
    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1=friendsPairing(n-1);
        int fnm2=friendsPairing(n-2);
        int pairWays=(n-1)*fnm2;
        int totWays=fnm1+pairWays;
        return totWays;
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(friendsPairing(n));
      sc.close();  
    }
}
