public class Student {
    private int id;
    private static int idCounter = 0; // статичний лічильник
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id; // збільшується лічильник на 1 та присвоюється id
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

