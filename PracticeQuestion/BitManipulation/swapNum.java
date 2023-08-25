package programs.PracticeQuestion.BitManipulation;

import java.util.Scanner;

public class swapNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        /*System.out.println("Before swap: x = "+x+" and y = "+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap: x = "+x+" and y = "+y);
        sc.close();*/

        int x=sc.nextInt();
        System.out.println(x+" + "+1+" is "+-~x);
        sc.close();
    }
}
