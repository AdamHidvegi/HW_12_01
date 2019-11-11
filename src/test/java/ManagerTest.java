import managament.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Adam", 1, 500.00, "Something");
    }

    @Test
    public void getDeptName() {
        assertEquals("Something", manager.getDeptName());
    }

    @Test
    public void getName() {
        assertEquals("Adam", manager.getName());
    }

    @Test
    public void getSalary() {
        assertEquals(500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void getNIN() {
        assertEquals(1, manager.getNIN());
    }

    @Test
    public void payBonus() {
        assertEquals(5.00, manager.payBonus(), 0.01);
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(50.00);
        assertEquals(550.00, manager.getSalary(), 0.01 );
    }

}
