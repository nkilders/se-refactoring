import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalTest {
    public Movie m1;
    public Rental r1;

    @BeforeEach
    public void beforeEach() {
        m1 = new Movie("Hehe", Movie.CHILDREN);
        r1 = new Rental(m1, 187);
    }

    @Test
    public void getMovie() {
        assertEquals(r1.getMovie(), m1);
    }

    @Test
    public void getDaysRented() {
        assertEquals(r1.getDaysRented(), 187);
    }

    @Test
    public void getCharge() {
        assertEquals(r1.getCharge(), 277.5);
    }

}