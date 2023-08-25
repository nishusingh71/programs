package programs.PracticeQuestion.BitManipulation;

import java.util.Scanner;

public class countSetBits {
    public static int countsetBit(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        // int i=sc.nextInt();
        System.out.println(countsetBit(n));
        sc.close();
    }
}
