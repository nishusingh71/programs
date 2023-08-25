package programs.PracticeQuestion.PQ5;

import java.util.Scanner;

public class computeSum {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input an Integer: ");
        int digits=s.nextInt();
        System.out.println("The Sum is "+sumDigits(digits));
         s.close();
    }
    public static  int sumDigits(int n){
      int sumOfDigits=0;
      while(n>0){
        int lastDigit=n%10;
        sumOfDigits+=lastDigit;
        n/=10;
      }
      return sumOfDigits;
    }
}
