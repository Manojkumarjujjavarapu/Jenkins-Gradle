public class Main {

    public static void main(String[] args) {

        System.out.println("=== Student Management System ===");

        StudentService service = new StudentService();

        Student s1 = new Student(101, "Manoj", "DevOps");
        Student s2 = new Student(102, "Krishna", "Cloud Computing");

        service.addStudent(s1);
        service.addStudent(s2);

        System.out.println();
        service.displayAllStudents();

        System.out.println("\nApplication executed successfully.");
    }
}
