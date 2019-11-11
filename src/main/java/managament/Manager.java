package managament;
import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int NIN, double salary, String deptName) {
        super(name, NIN, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }



}
