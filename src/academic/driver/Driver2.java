
/**
 * @author 12S24019 Winda N.V. Sitorus
 *
 */
package academic.driver;

import java.util.Scanner;
import academic.model.Student;

public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");
            students[count++] = new Student(
                    parts[0],
                    parts[1],
                    Integer.parseInt(parts[2]),
                    parts[3]
            );
        }

        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }

        scanner.close();
    }
}