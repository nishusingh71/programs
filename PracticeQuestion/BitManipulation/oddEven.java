package programs.PracticeQuestion.BitManipulation;

import java.util.Scanner;

public class oddEven {
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("even no");
        }else{
            System.out.println("odd no");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        oddOrEven(n);
        sc.close();
    }
}
