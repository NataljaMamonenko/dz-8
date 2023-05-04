import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private Student groupLeader;
    private final List<Student> students = new ArrayList<>();
    private final List<String> tasks = new ArrayList<>();

    public StudentGroup(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void renameStudent(Student student, String firstName, String lastName) {
        student.firstName = firstName;
        student.lastName = lastName;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void markTaskAsDone(Student student, String task) {
        if (students.contains(student) && tasks.contains(task)) {
            // TODO: Implement marking a task as done for a student
        }
    }
}
