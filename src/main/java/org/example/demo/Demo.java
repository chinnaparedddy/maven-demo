package org.example.demo;

public class Demo {

    private int id;
    private String firstName;
    private String lastName;
    private Employee employee;
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

    public Employee getEmployee(){
        return employee;
    }

    public void setEmployee(Employee employee){
        this.employee=employee;
    }

    public Demo(int id, String firstName, String lastName,Employee employee) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employee=" + employee +
                '}';
    }
}
