package p6_gps;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Collect waypoints from user
        ArrayList<Waypoint> waypoints = new ArrayList<>();
        String input;
        do {
            System.out.print("Enter the x coordinate of a waypoint or leave blank to end: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                double x = Double.parseDouble(input);
                System.out.print("Enter the y coordinate of the waypoint: ");
                double y = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter the timestamp of the waypoint in seconds: ");
                int timestamp = Integer.parseInt(scanner.nextLine());

                waypoints.add(new Waypoint(x, y, timestamp));
            }
        } while (!input.isEmpty());

        // Compute total distance travelled and output to user
        double tdt = 0;
        for (int i = 0; i < waypoints.size() - 1; i++) {
            tdt += Math.sqrt(Math.pow(Math.abs(waypoints.get(i).getX() - waypoints.get(i + 1).getX()), 2) + Math.pow(Math.abs(waypoints.get(i).getY() - waypoints.get(i + 1).getY()), 2));
        }
        tdt /= 10;

        System.out.printf("You travelled %.2f miles.\n", tdt);

        // Compute average speed in mph and output to user
        System.out.printf("Your average speed was %.2f mph.\n", tdt / (((double) waypoints.getLast().getTimestamp() - waypoints.getFirst().getTimestamp()) / 3600));
    }
}
