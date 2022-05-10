import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    public Customer c1;

    @BeforeEach
    public void beforeEach() {
        c1 = new Customer("Peter Lustig");
    }

    @Test
    public void getName() {
        assertEquals(c1.getName(), "Peter Lustig");
    }

}