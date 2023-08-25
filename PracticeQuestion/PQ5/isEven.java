package programs.PracticeQuestion.PQ5;

import java.util.Scanner;

public class isEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(iEven(num)){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
       sc.close();
    }
     public static boolean iEven(int number){
            if(number%2==0){
                return true;
            }else{
                return false;
            }
        }
}
