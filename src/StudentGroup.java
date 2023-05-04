import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private Student groupLeader;
    private List<Student> students;
    private List<String> tasks;

    public StudentGroup(Student groupLeader) {
        this.groupLeader = groupLeader;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setGroupLeader(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void markTaskAsComplete(Student student, String task) {
        if (students.contains(student) && tasks.contains(task)) {
            // TODO: Implement marking a task as done for a student
        }
    }
}

