package programs.PracticeQuestion.BitManipulation;

import java.util.Scanner;

public class setBitEx {
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(setIthBit(n,i));
        sc.close();
    }
}
