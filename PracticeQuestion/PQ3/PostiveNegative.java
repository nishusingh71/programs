package programs.PracticeQuestion.PQ3;

import java.util.Scanner;

public class PostiveNegative {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>0){
        System.out.println("Positive");
    }else{
        System.out.println("Negative");
    }
    sc.close();
    
   } 
}
