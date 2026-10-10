package p1_math1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static boolean logging = true;

    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for n
        System.out.print("Enter a number n to display the Farey fractions from 1 to n: ");
        int n = scanner.nextInt();

        // Add the Farey fraction of level 1
        LinkedList<Fraction> fractions = new LinkedList<>();
        fractions.add(new Fraction(0, 1));
        fractions.add(new Fraction(1, 1));

        log(fractions);

        // Calculate the Farey fractions from level 2 to level n
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < fractions.size() - 1; j++) {
                if (fractions.get(j).getDenominator() + fractions.get(j + 1).getDenominator() <= n) { // TODO: < or <= ?
                    fractions.add(j + 1, new Fraction(fractions.get(j).getNumerator() + fractions.get(j + 1).getNumerator(), fractions.get(j).getDenominator() + fractions.get(j + 1).getDenominator()));
                    j++;
                }
            }

            log(fractions);
        }
    }

    private static void log(String message) {
        if (logging) {System.out.printf("\u001B[34m[LOG]\u001B[39m %s\n", message);}
    }

    private static void log(Object object) {
        log(object.toString());
    }
}
