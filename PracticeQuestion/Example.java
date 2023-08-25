package programs.PracticeQuestion;

public class Example {
    // public static void printArray(int[] array){
    //     for(int i:array)
    //     System.out.print(i+" ");
    // }
    public String athleteName;
    public double athleteSpeed;
    public int athleteAge;
    public Example(String name,int age,double speed){
        this.athleteName=name;
        this.athleteSpeed=speed;
        this.athleteAge=age;
    }
    public void athleteRun(){
        int speed=100;
        System.out.println("Athelete runs at "+speed+"Km/hr");
    }
    public static void main(String[] args) {
       Example ex=new Example("Nishu",44,500);
       ex.athleteRun();
       System.out.println(ex.athleteName);
    }
}
