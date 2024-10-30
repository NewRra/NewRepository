
// Клас Employee, який реалізує інтерфейс Person
class Employee implements Person {
    private String name;      // Поле для імені
    private String surname;   // Поле для прізвища
    private int age;         // Поле для віку

    // Конструктор
    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Метод для виводу інформації
    @Override
    public void getInfo() {
        System.out.println("Employee - Name: " + name + ", Surname: " + surname + ", Years to retire: " + (62-age));
    }

}
