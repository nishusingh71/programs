package programs.PracticeQuestion.PQ1;

import java.util.Scanner;

public class AvgScore {
    public static void main(String[] args) {
        int sum=0,count=0;
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        System.out.println("Enter exam Scores"+score);
        sum=sum+score;
        count=count+1;
        if(count==25){
            int avg=sum/25;
            System.out.println(avg);
        }else{
            while(count>=25){
                count++;
            }
        }
       sc.close();
    }
}
