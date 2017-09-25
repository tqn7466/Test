import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testUserInput {

    @Test
    public void testMedicine() {
        Medicine m = new Medicine();
        String input = "Advil";

        if (input.isEmpty()){
            assertTrue(m.getErrors().contains("Medicine cannot be empty"));
        } else
            assertTrue(m.medicineName().equals(input));
        }

    @Test
    public void testTMax(){
        Medicine m = new Medicine();
        int input = -1;

        if (input < 0) {
            assertTrue(m.getErrors().contains("TMax cannot be a negative number"));
        } else if (input >= 0){
            assertEquals(true, m.getTMax(input));
        }
    }

    public int testHalfLife() {
        Medicine m = new Medicine();
        int input = -1;

        if (input < 0) {
            assertTrue(m.getErrors().contains("Half-life cannot be a negative number"));
        } else if (input >= 0){
            assertEquals(true, m.getTMax(input));
    }
        return 0;
    }

}
