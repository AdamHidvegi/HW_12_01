import managament.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director(10, "Adam", 1, 300.00, "Something");
    }

    @Test
    public void getName() {
        assertEquals("Adam", director.getName());
    }

    @Test
    public void getSalary() {
        assertEquals(300.00, director.getSalary(), 0.01);
    }

    @Test
    public void getNIN() {
        assertEquals(1, director.getNIN());
    }

    @Test
    public void payBonus() {
        assertEquals(6.00, director.payBonus(), 0.01);
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary(50.00);
        assertEquals(350.00, director.getSalary(), 0.01 );
    }

    @Test
    public void getBudget() {
        assertEquals(10, director.getBudget());
    }

}
