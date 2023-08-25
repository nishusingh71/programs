package programs.PracticeQuestion.PQ4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int multable=1;
        for(int i=1;i<=10;i++){
            multable=n*i;
            System.out.println(i+" X "+n+" = "+multable);
        }
        sc.close();
    }
}
 