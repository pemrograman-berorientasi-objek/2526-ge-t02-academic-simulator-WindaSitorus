// File: academic/driver/Driver2.java
package academic.driver;

import academic.model.Student;
import java.util.Scanner;
import java.util.ArrayList; // Menggunakan ArrayList karena ukuran array dinamis lebih mudah

/**
 * @author 12S24019 Winda N.V. Sitorus
 *
 */
public class Driver2 {

    public static void main(String[] _args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            String line = input.nextLine();

            if (line.equals("---")) {
                break; // Hentikan pembacaan input jika baris adalah "---"
            }

            // Pisahkan segmen data menggunakan "#"
            String[] segments = line.split("#");

            // Pastikan ada 4 segmen data sebelum membuat objek Student
            if (segments.length == 4) {
                String id = segments[0];
                String name = segments[1];
                String year = segments[2]; // Tahun langsung diambil sebagai String
                String studyProgram = segments[3];

                // Buat objek Student baru
                Student student = new Student(id, name, year, studyProgram);
                // Tambahkan student ke ArrayList
                students.add(student);
            } else {
                // Opsional: berikan feedback jika format input salah
                // System.err.println("Format input salah untuk baris: " + line);
            }
        }

        // Setelah input berhenti, tampilkan semua students yang tersimpan
        for (Student student : students) {
            System.out.println(student.toString());
        }

        input.close(); // Tutup scanner
    }
}