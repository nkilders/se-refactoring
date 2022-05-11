import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {
    public Movie m1;

    @BeforeEach
    public void beforeEach() {
        m1 = new Movie("CYK", new PriceChildren());
    }

    @Test
    public void getTitle() {
        assertEquals(m1.getTitle(), "CYK");
    }

    @Test
    public void getPriceCode() {
        assertEquals(m1.getPrice().getPriceCode(), Movie.CHILDREN);
    }

    @Test
    public void setPriceCode() {
        assertEquals(m1.getPrice().getPriceCode(), Movie.CHILDREN);

        m1.setPrice(new PriceNewRelease());

        assertEquals(m1.getPrice().getPriceCode(), new PriceNewRelease().getPriceCode());
    }
}