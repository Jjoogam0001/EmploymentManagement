package Data;

public class EmployeeSequencer {
    public static int EmployeeId;

    public static int nextEmployeeId(){
        EmployeeId = ++EmployeeId;
        return EmployeeId;
    }
}
