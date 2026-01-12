import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayAllStudents() {
        System.out.println("ID | Name | Course");
        System.out.println("-------------------");
        for (Student student : students) {
            student.displayStudent();
        }
    }
}
