package programs.PracticeQuestion.Recursion;

import java.util.Scanner;

public class power {
    public static int optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPowerSq=optimizedPower(x,n/2)*optimizedPower(x, n/2);
        int halfPower=optimizedPower(x,n/2);
        halfPowerSq=halfPower*halfPower;
        if(n%2!=0){
            halfPowerSq=x*halfPowerSq;
        }
       return halfPowerSq;
    }
    public static int powerRec(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1=powerRec(x,n-1);
        int xn=x*xnm1;
        return xn;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      int x=sc.nextInt();
      int n=sc.nextInt();
      System.out.println(optimizedPower(x,n));
      sc.close();  
    }
}
