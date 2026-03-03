package academic.driver;

/**
 * @author 12S24019_Winda N.V.Sitorus
 */

import java.util.Scanner;
import academic.model.Course;

public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course[] courses = new Course[100];
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");
            courses[count++] = new Course(
                    parts[0],
                    parts[1],
                    Integer.parseInt(parts[2]),
                    parts[3]
            );
        }

        for (int i = 0; i < count; i++) {
            System.out.println(courses[i]);
        }

        scanner.close();
    }
}