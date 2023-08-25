package programs.PracticeQuestion.PQ5;

import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int pal=sc.nextInt();
        if(isPalindrome(pal)){
            System.out.println("Number: "+pal+" is a palindrome");
        }else{
            System.out.println("Number: "+pal+" is not a palindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(int num){
     int pal=num;
     int rev=0;
     while(pal!=0){
        int rem=pal%10;
        rev=rev*10+rem;
        pal=pal/10;
     }
     if(num==rev){
        return true;
     }
     return false;
    }
}
