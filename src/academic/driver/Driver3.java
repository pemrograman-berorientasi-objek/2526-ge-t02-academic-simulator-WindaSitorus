// File: academic/driver/Driver3.java
package academic.driver;

import academic.model.Enrollment;
import java.util.Scanner;
import java.util.ArrayList; // Menggunakan ArrayList karena ukuran array dinamis lebih mudah

/**
 * @author 12S24019 Winda N.V. Sitorus
 *
 */
public class Driver3 {

    public static void main(String[] _args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        while (true) {
            String line = input.nextLine();

            if (line.equals("---")) {
                break; // Hentikan pembacaan input jika baris adalah "---"
            }

            // Pisahkan segmen data menggunakan "#"
            String[] segments = line.split("#");

            // Pastikan ada 4 segmen data sebelum membuat objek Enrollment
            if (segments.length == 4) {
                String courseCode = segments[0];
                String studentId = segments[1];
                String academicYear = segments[2];
                String semester = segments[3];

                // Buat objek Enrollment baru (grade akan otomatis "None")
                Enrollment enrollment = new Enrollment(courseCode, studentId, academicYear, semester);
                // Tambahkan enrollment ke ArrayList
                enrollments.add(enrollment);
            } else {
                // Opsional: berikan feedback jika format input salah
                // System.err.println("Format input salah untuk baris: " + line);
            }
        }

        // Setelah input berhenti, tampilkan semua enrollments yang tersimpan
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.toString());
        }

        input.close(); // Tutup scanner
    }
}