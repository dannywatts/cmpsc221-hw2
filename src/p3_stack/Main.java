package p3_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Let user input each character
        Stack<String> stack = new Stack<>();
        String input;
        do {
            System.out.print("Enter a character or leave blank to end: ");
            input = scanner.nextLine();
            stack.push(input);
        } while (!input.equals(""));

        System.out.println(stack);
    }
}
