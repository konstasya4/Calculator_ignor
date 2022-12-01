import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Calculator calculator= new Calculator();
    @Test
    void Addition ()
    {
        assertEquals(3, calculator.add(1,2));
    }
    @Test
    void subtraction()
    {
        assertEquals(5, calculator.subtract(7,2));
    }
    @Test
    void multiplition(){
        assertEquals(40, calculator.multiply(5, 8));
    }
    @Test
    void share(){assertEquals(6, calculator.sharing(42,7));};
}
