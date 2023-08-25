package programs.PracticeQuestion.PQ1;

import java.util.Scanner;

public class GreatestTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
        System.out.println("A is Greater than B");
        }else{
            System.out.println("B is Greater than A");
        }
        sc.close();
    }
}
