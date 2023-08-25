package programs.PracticeQuestion.PQ4;

import java.util.Scanner;

public class SumEO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.println("Enter number");
            n=sc.nextInt();
            if(n%2==0){
                evenSum+=n;
            }else{
                oddSum+=n;
            }
            System.out.println("Do you want to continue? press 1 for yes or 0 for no");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println(evenSum);
        System.out.println(oddSum);
        sc.close();
    }
}
