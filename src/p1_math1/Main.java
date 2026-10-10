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

        // Calculate the Farey fractions of level 2
        /*ListIterator<Fraction> iterator = fractions.listIterator();
        while (iterator.hasNext()) {
            Fraction f1 = iterator.next();
            if (iterator.hasNext()) {
                Fraction f2 = iterator.next();
                System.out.printf("PASS: %s %s\n", f1, f2);
                System.out.printf("c + d = %d + %d = %d\n", f1.getDenominator(), f2.getDenominator(), f1.getDenominator() + f2.getDenominator());
                System.out.printf("n = %d\n", n);
                if (f1.getDenominator() + f2.getDenominator() <= n) {
                    iterator.previous();
                    iterator.add(new Fraction(f1.getNumerator() + f2.getNumerator(), f1.getDenominator() + f2.getDenominator()));
                    iterator.next();
                }
            }
        }
        System.out.printf("RESULT: %s\n", fractions);*/

        // Calculate the Farey fractions from level 2 to level n
        for (int i = 2; i < n + 1; i++) {
            ListIterator<Fraction> iterator = fractions.listIterator();
            while (iterator.hasNext()) {
                Fraction f1 = iterator.next();
                if (iterator.hasNext()) {
                    Fraction f2 = iterator.next();
//                    System.out.printf("PASS: %s %s\n", f1, f2);
//                    System.out.printf("c + d = %d + %d = %d\n", f1.getDenominator(), f2.getDenominator(), f1.getDenominator() + f2.getDenominator());
//                    System.out.printf("n = %d\n", i);
                    if (f1.getDenominator() + f2.getDenominator() <= i) {
                        iterator.previous();
                        iterator.add(new Fraction(f1.getNumerator() + f2.getNumerator(), f1.getDenominator() + f2.getDenominator()));
                        iterator.next();
                    }
                }
            }
            System.out.printf("RESULT: %s\n", fractions);
        }
    }
}
