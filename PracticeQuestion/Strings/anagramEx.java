package programs.PracticeQuestion.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagramEx {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] str1CharArray=str1.toCharArray();
            char[] str2CharArray=str2.toCharArray();
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            boolean res=Arrays.equals(str1CharArray,str2CharArray);
            if(res){
                System.out.print(str1+" and "+str2+" are anagrams of each other ");
            }else{
                System.out.print(str1+" and "+str2+" are not anagrams of each other ");
            }
        }else{
            System.out.print(str1+" and "+str2+" are not anagrams of each other ");
        }
        sc.close();
    }
}
