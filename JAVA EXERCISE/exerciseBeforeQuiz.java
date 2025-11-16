import java.util.Scanner;
import java.util.Arrays;

//make the main java
public class exerciseBeforeQuiz{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("===Study Hour===");
    int hour;
    int total=0;
    //make the loop
    int day=1;
    do{
    System.out.println("how long you study in day "+(day));
    hour=sc.nextInt();
    System.out.println(" ");
      if(hour>=10){
        do { 
        System.out.println("enter again the value, not equals or more to 10");
        hour=sc.nextInt();    
        } while (hour>=10);}
    total += hour;
    day++;      
} while(day<=7);
    System.out.println("total= "+total);
    }
}