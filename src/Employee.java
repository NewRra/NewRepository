// Define the Employee class
class Employee implements Person {
    private String gender;
    private int age;

    // Constructor
    public Employee(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    // Calculate years worked since age 20
    public int yearsWorked() {
        return Math.max(0, age - 20);
    }

    // Implement the getInfo method
    @Override
    public void getInfo() {
        System.out.println("Employee - Gender: " + gender + ", Age: " + age + ", Years Worked: " + yearsWorked());
    }
}