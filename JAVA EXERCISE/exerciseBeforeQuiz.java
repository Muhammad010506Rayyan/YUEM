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
//make the conditional using loop while
int i=min;
while(i<max){
    if(i%2==0){
        System.out.println((i)+ " is even");
    }else{
        System.out.println((i)+" is odd");
    }
    i++;
}

    }
}