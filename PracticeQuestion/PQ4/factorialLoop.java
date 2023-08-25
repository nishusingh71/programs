package programs.PracticeQuestion.PQ4;

import java.util.Scanner;

public class factorialLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int i=1;
        int n=sc.nextInt();
        while(i<=n){
            fact=fact*i;
            i++;
        }
          System.out.println(fact);
          sc.close();
    }
}
