import java.util.Scanner;

/**
 * Created by samhudgens on 5/20/16.
 */
public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();

        if(name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Hello " + name + "!");
        } else {
            System.out.println("Sorry, you have the wrong name. You don't get a greeting");
        }
    }
}
