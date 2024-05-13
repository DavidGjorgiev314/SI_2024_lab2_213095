import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class SILab2Test {

    @Test
    public void testCheckCart_NullList() {
        List<Item> allItems = null;
        try {
            SILab2.checkCart(allItems, 123);
            fail("Expected RuntimeException for null list");
        } catch (RuntimeException e) {
            assertEquals("allItems list can't be null!", e.getMessage());
        }
    }

    @Test
    public void testCheckCart_CalculateTotalPrice() {
        List<Item> allItems = new ArrayList<>();
        allItems.add(new Item("Item1", "12345", 50, 0.1f));
        allItems.add(new Item("Item2", "67890", 100, 0));
        allItems.add(new Item("Item3", "01234", 200, 0.2f));
        
        int payment = 400;

        boolean result = SILab2.checkCart(allItems, payment);
        
        assertTrue(result);
    }
}