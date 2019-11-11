import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer dev;

    @Before
    public void before() {
        dev = new Developer("Adam", 1, 100.00);
    }

    @Test
    public void getName() {
        assertEquals("Adam", dev.getName());
    }

    @Test
    public void getSalary() {
        assertEquals(100.00, dev.getSalary(), 0.01);
    }

    @Test
    public void getNIN() {
        assertEquals(1, dev.getNIN());
    }

    @Test
    public void payBonus() {
        assertEquals(1.00, dev.payBonus(), 0.01);
    }

    @Test
    public void raiseSalary() {
        dev.raiseSalary(50.00);
        assertEquals(150.00, dev.getSalary(), 0.01 );
    }

}
