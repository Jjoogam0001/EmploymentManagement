package Model;

import java.time.LocalDate;
import java.util.Arrays;

public class SystemDeveloper  extends Employee{
    private String [] certificates;
    private String [] languages;

    private static final int AMOUNT_EXTRA_PER_CERTIFICATE = 1000;
    private static final int AMOUNT_EXTRA_PER_LANGUAGE = 1500;

    public SystemDeveloper(int id, String name, LocalDate dateHired, String[] certificates, String[] languages) {
        super(id, name, dateHired);
        this.certificates = certificates;
        this.languages = languages;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public static int getAmountExtraPerCertificate() {
        return AMOUNT_EXTRA_PER_CERTIFICATE;
    }

    public static int getAmountExtraPerLanguage() {
        return AMOUNT_EXTRA_PER_LANGUAGE;
    }

    @Override
    public double calculateSalary() {
        final double certificateExtra = certificates.length * AMOUNT_EXTRA_PER_CERTIFICATE;
        final double languageExtra = languages.length * AMOUNT_EXTRA_PER_LANGUAGE;
        final double newSalary = Employee.BASE_SALARY_ + certificateExtra + languageExtra;
        super.setSalary(newSalary);


        return newSalary;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
