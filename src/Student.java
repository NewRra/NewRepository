// Define the Student class
class Student implements Person {
    private String gender;
    private int age;

    // Constructor
    public Student(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    // Implement the getInfo method
    @Override
    public void getInfo() {
        System.out.println("Student - Gender: " + gender + ", Age: " + age);
    }
}