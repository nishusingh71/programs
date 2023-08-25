package programs.PracticeQuestion.BitManipulation;

import java.util.Scanner;

public class powerBits {
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        // int i=sc.nextInt();
        System.out.println(isPowerOfTwo(n));
        sc.close();
    }
}
