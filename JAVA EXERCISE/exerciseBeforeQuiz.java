import java.util.Scanner;
import java.util.Arrays;

//make the main java
public class exerciseBeforeQuiz{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("input the minimum ");
    int min=sc.nextInt();
    System.out.print("input the maximum ");
    int max=sc.nextInt();
    System.out.print("");
//make the conditional using loop do-while
int i=min;
do { 
    if(i%2==0){
        System.out.println((i)+" even");
    }else{
        System.out.println((i)+" odd");
    }
    i++;
} while (i<max);


    }
}