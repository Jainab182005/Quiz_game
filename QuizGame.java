import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Java Quiz!");
        System.out.println("Answer the following questions:\n");

        // Question 1
        System.out.println("1. What is the size of int in Java?");
        System.out.println("a) 2 bytes\nb) 4 bytes\nc) 8 bytes\nd) 1 byte");
        System.out.print("Your answer: ");
        String ans1 = sc.nextLine();
        if (ans1.equalsIgnoreCase("b")) score++;

        // Question 2
        System.out.println("\n2. Which keyword is used to inherit a class in Java?");
        System.out.println("a) this\nb) super\nc) extends\nd) implements");
        System.out.print("Your answer: ");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("c")) score++;

        // Question 3
        System.out.println("\n3. Java is a ___?");
        System.out.println("a) Compiled language\nb) Interpreted language\nc) Both\nd) None");
        System.out.print("Your answer: ");
        String ans3 = sc.nextLine();
        if (ans3.equalsIgnoreCase("c")) score++;

        System.out.println("\nYour final score: " + score + "/3");
        sc.close();
    }
}
