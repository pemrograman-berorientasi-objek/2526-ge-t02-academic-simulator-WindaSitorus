package academic.model;

public class Student {
    private String nim;
    private String name;
    private int year;
    private String studyProgram;

    public Student(String nim, String name, int year, String studyProgram) {
        this.nim = nim;
        this.name = name;
        this.year = year;
        this.studyProgram = studyProgram;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return nim + "|" + name + "|" + year + "|" + studyProgram;
    }
}