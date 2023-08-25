package programs.PracticeQuestion.PQ3;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int noOfdays=sc.nextInt();
        // switch(noOfdays){
        //     case 1:System.out.println("Monday"); break;
        //     case 2:System.out.println("Tuesday"); break;
        //     case 3:System.out.println("Wednesday"); break;
        //     case 4:System.out.println("Thursday"); break;
        //     case 5:System.out.println("Friday"); break;
        //     case 6:System.out.println("Saturday"); break;
        //     case 7:System.out.println("Sunday"); break;
        //     default:System.out.println("Invalid Days");
        // }

        int a=63,b= 36;
        boolean x=(a<b)?true:false;
        int y=(a>b)?a:b;
        System.out.println(x);
        System.out.println(y);
        sc.close();
    }
}
