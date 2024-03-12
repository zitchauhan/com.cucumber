package ThisJava;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitExample {
    @Test
    void testAddition() {
        assertEquals(5, 2 + 3);
    }

    @Test
    void testSubtraction() {
        assertEquals(2, 5 - 3);
    }
}
