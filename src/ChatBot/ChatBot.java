package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Guy_bot");
        System.out.println("I was created in 2022_year");
        System.out.println("Please, remind me your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age");
        System.out.println("Enter remainders of divining your age by 3, 5 and 7");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int age = (a * 70 + b * 21 + c * 15) % 105;
        System.out.println("Your age is " + age + " that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Completed, have a nice day!");
        System.out.println("Let's test your programming knowledge.");
        System.out.println("""
        Why do we use methods?
        1. To repeat a statement multiple times.
        2. To decompose a program into several small subroutines.
        3. To determine the execution time of a program.
        4. To interrupt the execution of a program.
        """);
        answers();
    }

    public static void answers() {
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        if (answer == 2) {
            System.out.println("Congratulations, have a nice day!");
        } else {
            System.out.println("Please, try again.");
            answers();
        }
    }
}