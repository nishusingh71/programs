package programs.PracticeQuestion.PQ5;

import java.util.*;

public class Maths {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
         double b=s.nextDouble();
         mathMethods(a,b);
         s.close();
    }
    public static void mathMethods(double a,double b){
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a,b));
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));
        System.out.println(Math.sqrt(b));
    }
}
