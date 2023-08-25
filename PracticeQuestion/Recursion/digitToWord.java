package programs.PracticeQuestion.Recursion;

import java.util.Scanner;

public class digitToWord {
    static String digit[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void printDigits(int n){
        if(n==0){
            return;
        }
        int lastDigit=n%10;
        printDigits(n/10);
        System.out.print(digit[lastDigit]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDigits(n);
        sc.close();
    }
    
}
