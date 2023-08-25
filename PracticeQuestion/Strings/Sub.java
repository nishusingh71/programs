package programs.PracticeQuestion.Strings;

import java.util.Scanner;

public class Sub {
    public static String subString(String str,int si,int ei){
        String substr=" ";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String str=sc.nextLine();
        int si=sc.nextInt();
        int ei=sc.nextInt();
       System.out.println(subString(str,si,ei)); 
        sc.close();
    }
}
