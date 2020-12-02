package Model;

import java.time.LocalDate;

public abstract class Employee {

    private int id;
    private String name;
    protected static final double BASE_SALARY_ = 25000;
    private double salary;
    private LocalDate dateHired;

    public Employee(int id, String name, LocalDate dateHired) {
        this.id = id;
        this.name = name;
        this.salary = BASE_SALARY_;
        this.dateHired = dateHired;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dateHired=" + dateHired +
                '}';
    }
}
