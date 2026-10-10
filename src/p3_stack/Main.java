package p3_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Let user input each character
        Stack<String> stack = new Stack<>();
        String character;
        do {
            System.out.print("Enter a character or nothing to end: ");
            character = scanner.nextLine();
            stack.push(character);
        } while (!character.equals(""));

        System.out.println(stack);
    }
}
