package academic.driver;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas Course untuk merepresentasikan data sebuah mata kuliah
class Course {
    private String code;
    private String name;
    private int credits;
    private String grade;

    public Course(String code, String name, int credits, String grade) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.grade = grade;
    }

    // Metode untuk mendapatkan representasi string dari Course dengan separator '|'
    @Override
    public String toString() {
        return code + "|" + name + "|" + credits + "|" + grade;
    }
}

// Kelas Driver1 sebagai entry point program
public class Driver1 {

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);
        List<Course> courses = new ArrayList<>(); // Menggunakan ArrayList sebagai penyimpanan dinamis

        System.out.println("Masukkan data course (format: Kode#Nama#SKS#Nilai). Ketik '---' untuk berhenti:");

        while (true) {
            String line = scanner.nextLine(); // Membaca setiap baris masukan

            // Cek perintah berhenti
            if (line.equals("---")) {
                break;
            }

            // Memproses baris masukan
            String[] segments = line.split("#");
            if (segments.length == 4) {
                try {
                    String code = segments[0];
                    String name = segments[1];
                    int credits = Integer.parseInt(segments[2]); // Mengubah SKS menjadi integer
                    String grade = segments[3];

                    Course course = new Course(code, name, credits, grade);
                    courses.add(course); // Menambahkan objek Course ke dalam list
                } catch (NumberFormatException e) {
                    System.err.println("Peringatan: Format SKS tidak valid di baris: " + line + ". Baris ini dilewati.");
                }
            } else {
                System.err.println("Peringatan: Format masukan tidak sesuai (harus 4 segmen dipisah '#') di baris: " + line + ". Baris ini dilewati.");
            }
        }

        System.out.println("\nCourses yang tersimpan:");
        // Menampilkan semua courses yang tersimpan
        for (Course course : courses) {
            System.out.println(course); // Menggunakan method toString() dari kelas Course
        }

        scanner.close(); // Menutup scanner
    }
}