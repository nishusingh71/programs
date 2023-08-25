package programs.PracticeQuestion.BitManipulation;

import java.util.Scanner;

public class clearRange {
    public static int clearIBitsRange(int n, int i, int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.println(clearIBitsRange(n,i,j));
        sc.close();
    }
}
