public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкти студентів
        Student student1 = new Student(1, "Іван", "Іванов");
        Student student2 = new Student(2, "Петро", "Петров");
        Student student3 = new Student(3, "Сергій", "Сергіїв");

        // Створюємо об'єкт групи студентів та обираємо старосту
        StudentGroup group = new StudentGroup(student1);

        // Додаємо студентів в групу
        group.addStudent(student2);
        group.addStudent(student3);

        // Виводимо інформацію про групу
        System.out.println("Староста групи: " + group.getGroupLeader().getFirstName());
        System.out.println("Список студентів:");
        for (Student student : group.getStudents()) {
            System.out.println(student.getFirstName());
        }

        // Додаємо завдання для групи
        group.addTask("Вивчити Java");

       // Виводимо информацію о завданнях//
    }
}