import java.util.Scanner;

public class firstCase{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
//input your name
System.out.print("whats your name?: ");
String name=sc.nextLine();
//add some space
System.out.println("");
System.out.println("hello "+ name + ", welcome to java world");
//add some space
System.out.println("");
//Ask for two integers and print their sum, difference, product, and quotient.
System.out.println("input two number below: ");
int firstNum=sc.nextInt();
int secNum=sc.nextInt();
System.out.println("analize the sum: "+ (firstNum + secNum));
System.out.println("analize the difference: "+ (firstNum - secNum));
System.out.println("analize the product: "+ firstNum * secNum);
System.out.println("analize the quotient"+ firstNum / secNum);
//odd or even number
System.out.print("input a number: ");
int thirdNum=sc.nextInt();
    if(thirdNum % 2 ==0){
        System.out.println("number is even");
    } else{
        System.out.println("number is odd");
    }
//age classification
System.out.print("how old are you?: ");
int age=sc.nextInt();
    if(age>0 && age <13){
        System.out.println("Child");
    } else if(13<= age && age <= 19){
        System.out.println("teenager");
    } else {System.out.println("adult");
    }
//looping
System.out.println("lets doing a loop, from 1 to 5");

    for(int i=1;i<=5;i++){
    System.out.println(i++);
//multiple loop
System.out.println("multiple loop, input your number: ");
int num=sc.nextInt();
int sum=0;
int counter=0;
    for(i=1;i<=10;i++){
        if( i % num ==0){
            sum=sum+1;
            counter++;
        }
    } 
    System.out.println(sum +"and "+ counter);

}
}
}