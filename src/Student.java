public class Student {
    private int id;
    String firstName;
    String lastName;
    String addTask;
    String completeTask;
    String getTasks;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addTask = null;
        this.completeTask = null;
        this.getTasks = null;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected String AddTask() { return addTask; }

    public String getCompleteTask() { return completeTask; }

    public String getTasks() { return getTasks; }

    public void setCompleteTask(String completeTask) {
        this.completeTask = completeTask;
    }
    public void setGetTasks(String getTasks) {
        this.getTasks = getTasks;
    }

   }



