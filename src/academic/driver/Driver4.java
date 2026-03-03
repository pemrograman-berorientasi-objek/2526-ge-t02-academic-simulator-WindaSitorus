// File: academic/driver/Driver4.java
package academic.driver;

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 12S24019_Winda N.V.  Sitorus
 *
 */
public class Driver4 {

    public static void main(String[] _args) {
        Scanner input = new Scanner(System.in);
        List<Object> entities = new ArrayList<>(); // Menggunakan List<Object> untuk menyimpan berbagai tipe entitas

        while (true) {
            String line = input.nextLine();

            if (line.equals("---")) {
                break;
            }

            String[] segments = line.split("#");

            // Cek command untuk menentukan tipe entitas
            String command = segments[0];

            if ("course-add".equals(command)) {
                if (segments.length == 5) { // command + 4 data segmen
                    String code = segments[1];
                    String name = segments[2];
                    int credits = Integer.parseInt(segments[3]);
                    String grade = segments[4];
                    Course course = new Course(code, name, credits, grade);
                    entities.add(course);
                }
            } else if ("student-add".equals(command)) {
                if (segments.length == 5) { // command + 4 data segmen
                    String id = segments[1];
                    String name = segments[2];
                    String year = segments[3];
                    String studyProgram = segments[4];
                    Student student = new Student(id, name, year, studyProgram);
                    entities.add(student);
                }
            } else if ("enrollment-add".equals(command)) {
                if (segments.length == 5) { // command + 4 data segmen (grade "None" otomatis)
                    String courseCode = segments[1];
                    String studentId = segments[2];
                    String academicYear = segments[3];
                    String semester = segments[4];
                    // Grade akan otomatis diinisialisasi sebagai "None" di konstruktor Enrollment
                    Enrollment enrollment = new Enrollment(courseCode, studentId, academicYear, semester);
                    entities.add(enrollment);
                }
            }
            // Tambahkan penanganan error atau log jika command tidak dikenali atau format salah
        }

        // Tampilkan semua entitas yang tersimpan
        for (Object entity : entities) {
            System.out.println(entity.toString());
        }

        input.close();
    }
}