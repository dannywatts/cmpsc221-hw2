package p3_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Let user input each character
        Stack<String> stack = new Stack<>();
        do {
            System.out.print("Enter a character or leave blank to end: ");
            stack.push(scanner.nextLine());
        } while (!stack.peek().isEmpty());
        stack.pop();

        System.out.println(stack);
    }
}
