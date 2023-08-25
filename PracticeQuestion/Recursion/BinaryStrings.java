package programs.PracticeQuestion.Recursion;

public class BinaryStrings {
    public static void printBinStrings(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
        }
        printBinStrings(n-1,0,"0");
        if(lastPlace==0){
            
            printBinStrings(n-1,1,"1");
        }
    }
    public static void main(String[] args) {
        printBinStrings(3,0," ");
    }
}
