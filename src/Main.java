public class Main {
        public static void main(String[] args) {

        // Створюємо об'єкти студентів
            int idCounter = 0;
            Student student1 = new Student(++idCounter, "Ivan", "Ivanov");
            Student student2 = new Student(++idCounter, "Peter", "Petrov");
            Student student3 = new Student(++idCounter, "Taras", "Tarasov");

        // Створюємо об'єкт групи студентів та обираємо старосту
            StudentGroup group = new StudentGroup(student1);

        // Додаємо студентів в групу
            group.addStudent(student2);
            group.addStudent(student3);

        // Виводимо інформацію про групу
            System.out.println("Староста групи: " + group.getGroupLeader().getFirstName());
            System.out.println("Список студентів:");
                for (Object student : group.getStudents()) {
                    System.out.println(((Student) student).getFirstName() + " " + ((Student) student).getLastName());
                }
            // Завдання для групи
            group.addTask("Зробити домашку");

            // Виводимо завдання
            System.out.println("Завдання для групи:");
            for (Object task : group.getTasks()) {
                System.out.println("- " + task);
            }
        }
}
