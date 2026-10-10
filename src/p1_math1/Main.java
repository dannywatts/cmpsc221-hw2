package p1_math1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for n
        System.out.print("Enter a number n to display the Farey fraction of level n: ");
        int n = scanner.nextInt();

        // Add the Farey fractions of level 1
        LinkedList<Fraction> fractions = new LinkedList<>(
                Arrays.asList(new Fraction(0, 1), new Fraction(1, 1))
        );

        // Calculate the Farey fractions from level 2 to level n
        for (int i = 2; i < n + 1; i++) {
            ListIterator<Fraction> iterator = fractions.listIterator();
            while (iterator.hasNext()) {
                Fraction f1 = iterator.next();
                if (iterator.hasNext()) {
                    Fraction f2 = iterator.next();
                    if (f1.getDenominator() + f2.getDenominator() <= i) {
                        iterator.previous();
                        iterator.add(new Fraction(f1.getNumerator() + f2.getNumerator(), f1.getDenominator() + f2.getDenominator()));
                    }
                }
            }
        }

        // Output result to user
        System.out.printf("The Farey fractions of level %d are %s.\n", n, fractions);
    }
}
