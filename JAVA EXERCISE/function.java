import java.util.Scanner;

public class function {

    static void greetUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        greetUser(); // calling the method
    }
}

