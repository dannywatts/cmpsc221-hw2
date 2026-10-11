package p2_math2;

public class Main {
    static void main() {
        Quaternion q1 = Quaternion.input();
        Quaternion q2 = new Quaternion(5, 6, 7, 8);
        System.out.printf("q1 = %s\n", q1);
        System.out.printf("q2 = %s\n", q2);
        System.out.printf("q1 = q2? %b\n", q1.equals(q2));
        System.out.printf("q1 + q2 = %s\n", Quaternion.add(q1, q2));
        System.out.printf("q1 - q2 = %s\n", Quaternion.subtract(q1, q2));
        System.out.printf("q1 * q2 = %s\n", Quaternion.multiply(q1, q2));
        System.out.printf("q1 / q2 = %s\n", Quaternion.divide(q1, q2));
    }
}
