
/**
 * @author 12S24019_Winda N.V.  Sitorus
 *
 */

    package academic.driver;

import java.util.Scanner;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

public class Driver4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course[] courses = new Course[100];
        Student[] students = new Student[100];
        Enrollment[] enrollments = new Enrollment[100];

        int courseCount = 0;
        int studentCount = 0;
        int enrollmentCount = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");

            switch (parts[0]) {
                case "course-add":
                    courses[courseCount++] = new Course(
                            parts[1],
                            parts[2],
                            Integer.parseInt(parts[3]),
                            parts[4]
                    );
                    break;

                case "student-add":
                    students[studentCount++] = new Student(
                            parts[1],
                            parts[2],
                            Integer.parseInt(parts[3]),
                            parts[4]
                    );
                    break;

                case "enrollment-add":
                    enrollments[enrollmentCount++] = new Enrollment(
                            parts[1],
                            parts[2],
                            parts[3],
                            parts[4]
                    );
                    break;
            }
        }

        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i]);
        }

        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }

        for (int i = 0; i < enrollmentCount; i++) {
            System.out.println(enrollments[i]);
        }

        scanner.close();
    }
}