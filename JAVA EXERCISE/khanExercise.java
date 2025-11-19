import java.util.*;
public class khanExercise{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//declare array 2 dimension
Double[][]student=new Double[3][2];
String[] Name= new String[student.length];
//make the for loop
for(int i = 0; i<student.length; i++){
    System.out.print("input student "+(i+1)+" name: ");
    Name[i]=sc.nextLine();
   for(int j=0;j<student[i].length;j++){
    System.out.println("input score"+(j+1)+": ");
    student[i][j]=sc.nextDouble(); 
    sc.nextLine();
   } 
}//make the output
    for(int i=0;i<student.length;i++){
         System.out.println("score for "+ Name[i]);
        for(int j=0;j<student[i].length;j++){
            System.out.println(student[i][j]);
        }
    }
    }
}