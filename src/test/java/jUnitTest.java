import org.junit.Test;
import static org.junit.Assert.*;

public class jUnitTest {

    @Test
    public void doesNameMatch(){
        String expected = "Edgar";
        String actual = "Edgar";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsRight(){
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price-discount, 0);
        assertEquals(5.2, price-discount, 0.5);
        assertNotEquals(4.9, price-discount, 0.5);
        //delta is a margin of error

    }
}
