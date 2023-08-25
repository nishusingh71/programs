package programs.PracticeQuestion.Recursion;

import java.util.Scanner;

public class StringLen {
   public static int length(String str){
    if(str.length()==0){
        return 0;
    }
    return length(str.substring(1))+1;
   } 
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(length(str));
    sc.close();
   }
}
