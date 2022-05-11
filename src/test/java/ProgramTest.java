import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramTest {
    public Customer c1 = new Customer("willi");

    @Before
    public void before() {
        Movie m1 = new Movie("movie1", new PriceNewRelease());
        Rental r1 = new Rental(m1, 10);
        c1.addRental(r1);

        Movie m2 = new Movie("movie2", new PriceNewRelease());
        Rental r2 = new Rental(m2, 5);
        c1.addRental(r2);
    }

    @Test
    public void test() {
        String result = "Rental Record for willi\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tmovie1\t\t10\t30.0\n" +
                "\tmovie2\t\t5\t15.0\n" +
                "Amount owed is 45.0\n" +
                "You earned 4 frequent renter points";

        System.out.println(c1.statement());
        assertEquals(result, c1.statement());
    }

}