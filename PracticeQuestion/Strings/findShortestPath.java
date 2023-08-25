package programs.PracticeQuestion.Strings;

import java.util.Scanner;

public class findShortestPath {
    public static float getShortestPath(String path){
        float x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //North
            else if(dir=='N'){
                y++;
            }
          //West
          else if(dir=='W'){
            x--;
          }
          //East
          else{
            x++;
          }
        }
        float x2=x*x;
        float y2=y*y;
        return (float)(Math.sqrt(x2+y2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       System.out.println(getShortestPath(str)); 
        sc.close();
    }
    
}
