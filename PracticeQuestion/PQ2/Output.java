package programs.PracticeQuestion.PQ2;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        // int z=sc.nextInt();
        //Q1
        // int exp1=(x*y/x);
        // int exp2=(x*(y/x));
        // System.out.println(exp1+" ");
        // System.out.println(exp2);
        // Q2
    //    if(x>y&&y>z){
    //     System.out.println("Hello");
    //    }
    //    if(z>y&&z<x){
    //     System.out.println("Java");
    //    }
    //    if((y+200)<x&&(y+150)<z){
    //     System.out.println("Hello Java");
    //    }

    //Q3
    // x=y=z;
    // x+=y;
    // y-=z;
    // z/=(x+y);
    // System.out.println(x+" "+y+" "+z);

    //Q4
    //  int a=sc.nextInt();
    //  int b=sc.nextInt();
    //  int c=sc.nextInt();
    //   int exp=4/3*(x+34)+9*(a+b*c)+(3+y*(2+a))/(a+b*y);
    //   System.out.println(exp);
    //     
    //Q5
     int exp1=(y*(x/y+x/y));
        int exp2=(y*x/y+y*x/y);
        System.out.println(exp1);
        System.out.println(exp2);
      sc.close();
    }
}
