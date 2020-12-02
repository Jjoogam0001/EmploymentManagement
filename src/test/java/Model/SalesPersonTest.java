package Model;

import Data.EmployeeSequencer;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class SalesPersonTest {

    SalesPerson salesPerson;
    String [] clients = new String[4];
    int acquiredClient = 3;



    @Before
    public void setUp() throws Exception {
        LocalDate date = LocalDate.now();
        salesPerson = new SalesPerson(EmployeeSequencer.nextEmployeeId(),"Martin",date,clients,acquiredClient);


    }

    @Test
    public void calculateSalary() {
        double expectedSalary = 30000;
        double actualSalary = salesPerson.calculateSalary();
        assertEquals(expectedSalary,actualSalary,0.01);
    }

    @Test
    public void getClients() {
        String [] expected = clients;
        String[] actual = salesPerson.getClients();
        assertEquals(expected,actual);

    }

    @Test
    public void getAcquiredClients() {
        int expected = acquiredClient;
        int actual = salesPerson.getAcquiredClients();
        assertEquals(expected,actual);

    }

    @Test
    public void setClients() {
        String[] setClients = {};
        salesPerson.setClients(setClients);
        assertTrue(salesPerson.getClients() == setClients);


    }

    @Test
    public void setAcquiredClients() {
        int setAcquiredClients = 0;
        salesPerson.setAcquiredClients(setAcquiredClients);
        assertTrue(salesPerson.getAcquiredClients() == setAcquiredClients);

    }

    @Test
    public void testToString() {
        String expected = "SalesPerson{" +
                "clients=" + Arrays.toString(clients) +
                ", acquiredClients=" + acquiredClient +
                '}';
        String actual = salesPerson.toString();
        assertEquals(expected, actual);

    }
}