package Model;

import Data.EmployeeSequencer;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SystemDeveloperTest {
    SystemDeveloper systemDeveloper;

    private String [] certificates = {"Cisco", "JavaCerticate","BSC"};
    private String [] languages = {"JavaScript","Java","C#", "C++"} ;






    @Before
    public void setUp() {
        LocalDate date = LocalDate.now();
        systemDeveloper = new SystemDeveloper(EmployeeSequencer.nextEmployeeId(),"Levin Katumba",date,certificates,languages);


    }

    @Test
    public void getCertificates() {
        String [] expected = certificates;
        String[] actual = systemDeveloper.getCertificates();
        assertEquals(expected,actual);

    }

    @Test
    public void getLanguages() {
        String [] expected = languages;
        String[] actual = systemDeveloper.getLanguages();
        assertEquals(expected,actual);
    }

    @Test
    public void getAmountExtraPerCertificate() {
        int expected = 1000;
        int actual = systemDeveloper.getAmountExtraPerCertificate();
        assertEquals(expected,actual);

    }

    @Test
    public void getAmountExtraPerLanguage() {
        int expected = 1500;
        int actual = systemDeveloper.getAmountExtraPerLanguage();
        assertEquals(expected,actual);
    }

    @Test
    public void calculateSalary() {
        double expectedSalary = 34000;
        double actualSalary = systemDeveloper.calculateSalary();
        assertEquals(expectedSalary,actualSalary,0.01);
    }

    @Test
    public void setCertificates() {
        String[] setCertificates = {};
        systemDeveloper.setCertificates(setCertificates);
        assertTrue(systemDeveloper.getCertificates() == setCertificates);
    }

    @Test
    public void setLanguages() {
        String[] setLanguages = {};
        systemDeveloper.setLanguages(setLanguages);
        assertTrue(systemDeveloper.getLanguages() == setLanguages);

    }

    @Test
    public void testToString() {
        String expected = "SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
        String actual = systemDeveloper.toString();
        assertEquals(expected, actual);

    }
}