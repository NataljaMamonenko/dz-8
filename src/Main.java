public class Main {
    public static void main(String[] args) {
        // Создаем объекты студентов
        Student student1 = new Student(1, "Иван", "Иванов");
        Student student2 = new Student(2, "Петр", "Петров");
        Student student3 = new Student(3, "Сергей", "Сергеев");

        // Создаем объект группы студентов и устанавливаем старосту
        StudentGroup group = new StudentGroup(student1);

        // Добавляем студентов в группу
        group.addStudent(student2);
        group.addStudent(student3);

        // Выводим информацию о группе
        System.out.println("Староста группы: " + group.getGroupLeader().getFirstName());
        System.out.println("Список студентов:");
        for (Student student : group.getStudents()) {
            System.out.println(student.getFirstName());
        }

        // Добавляем задание для группы
        group.addTask("Выучить Java");

       // Выводим информацию о заданиях//
    }
}