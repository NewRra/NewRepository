public class Student {
    private String studentId; // Поле для студентського ID
    private String surname;    // Поле для прізвища
    private String name;       // Поле для імені
    private int age;          // Поле для віку

    // Конструктор
    public Student(String studentId, String surname, String name, int age) {
        this.studentId = studentId;
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    // Метод для виводу інформації
    public String getInfo() {
        return studentId + " " + surname + " " + name + " " + age;
    }

    public static void main(String[] args) {
        // Створення об'єкту класу Student
        Student student = new Student("S12345", "Іваненко", "Іван", 30);
        // Вивід інформації про студента
        System.out.println(student.getInfo()); // Виводить: S12345 Іваненко Іван 30
    }
}
