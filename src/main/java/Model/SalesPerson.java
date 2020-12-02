package Model;

import java.time.LocalDate;
import java.util.Arrays;

public class SalesPerson extends Employee {

    private String [] clients;
    private int acquiredClients;


    public SalesPerson(int id, String name, LocalDate dateHired, String[] clients, int acquiredClients) {
        super(id, name, dateHired);
        this.clients = clients;
        this.acquiredClients = acquiredClients;
        calculateSalary();
    }

    @Override
    public double calculateSalary() {
         final double extraClientSalaryCalculator = clients.length * 500;
         final double acquiredClientSalaryCalculator = acquiredClients * 1000;
         final double finalSalaryCalculator = extraClientSalaryCalculator + acquiredClientSalaryCalculator + Employee.BASE_SALARY_;
         super.setSalary(finalSalaryCalculator);


        return finalSalaryCalculator;
    }

    public String[] getClients() {
        return clients;
    }

    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "clients=" + Arrays.toString(clients) +
                ", acquiredClients=" + acquiredClients +
                '}';
    }
}
