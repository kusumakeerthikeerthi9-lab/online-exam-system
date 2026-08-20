public class Student extends User {

    public Student(String username, String password) {
        super(username, password);
    }

    public void startExam() {
        System.out.println("Exam Started...");
    }
}