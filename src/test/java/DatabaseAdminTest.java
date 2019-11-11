import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dbadmin;

    @Before
    public void before() {
        dbadmin = new DatabaseAdmin("Adam", 1, 100.00);
    }

    @Test
    public void getName() {
        assertEquals("Adam", dbadmin.getName());
    }

    @Test
    public void getSalary() {
        assertEquals(100.00, dbadmin.getSalary(), 0.01);
    }

    @Test
    public void getNIN() {
        assertEquals(1, dbadmin.getNIN());
    }

    @Test
    public void payBonus() {
        assertEquals(1.00, dbadmin.payBonus(), 0.01);
    }

    @Test
    public void raiseSalary() {
        dbadmin.raiseSalary(50.00);
        assertEquals(150.00, dbadmin.getSalary(), 0.01 );
    }

}
