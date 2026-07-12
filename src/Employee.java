public class Employee extends Person {

    double salary;

    public Employee(String name, int age, double salary) {

        super(name, age);
        this.salary = salary;
    }

    public void displayEmployee() {

        displayPerson();
        System.out.println("Salary : " + salary);
    }
}
