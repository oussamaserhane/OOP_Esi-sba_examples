public class Student implements Comparable<Student> {
     public String name;
     public int id;
    public double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        if (this.gpa > other.gpa) {
            return 1;
        } else if (this.gpa < other.gpa) {
            return -1;
        } else {
            return 0;
        }
    }
}