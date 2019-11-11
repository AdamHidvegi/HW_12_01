import org.junit.Test;
import staff.Employee;
import managament.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void getSalary() {
        employee = new Manager("Adam", 1, 500.00, "Something");
        assertEquals(500.00, employee.getSalary(), 0.01);
    }

    @Test
    public void getNIN() {
        employee = new Manager("Adam", 1, 500.00, "Something");
        assertEquals(1, employee.getNIN());
    }

    @Test
    public void getName() {
        employee = new Manager("Adam", 1, 500.00, "Something");
        assertEquals("Adam", employee.getName());
    }

    @Test
    public void raiseSalary() {
        employee = new Manager("Adam", 1, 500.00, "Something");
        employee.raiseSalary(500.00);
        assertEquals(1000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        employee = new Manager("Adam", 1, 500.00, "Something");
        employee.payBonus();
        assertEquals(5.00, employee.payBonus(), 0.01);
    }

    @Test
    public void setName() {
        employee = new Manager("Adam", 1, 500.00, "Something");
        employee.setName("Daniel");
        assertEquals("Daniel", employee.getName());
    }

}
