package p3_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Let user input each character
        Stack<String> stack = new Stack<>();
        Stack<String> temp = new Stack<>();
        do {
            System.out.print("Enter a character or leave blank to end: ");
            stack.push(scanner.nextLine());
            temp.push(stack.peek());
        } while (!stack.peek().isEmpty());
        stack.pop();
        temp.pop();

        // Reverse the stack to compare it against its opposite ends
        Stack<String> reversed = new Stack<>();
        while (!temp.empty()) {
            reversed.push(temp.pop());
        }

        // Compare the opposing elements of the stack
        boolean palindrome = true;
        while (!stack.empty()) {
            if (!stack.pop().equals(reversed.pop())) {
                palindrome = false;
                break;
            }
        }

        // Output the findings to the user
        if (palindrome) {
            System.out.println("That word is a palindrome.");
        } else {
            System.out.println("That word is not a palindrome");
        }
    }
}
