import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TheStackTest {

    @Test
    public void testIsEmptyInitially() {
        TheStack stack = new TheStack();
        assertTrue(stack.isEmpty(), "Stack is to be empty");
    }

    @Test
    public void testPushAndPop() {
        TheStack stack = new TheStack();
        stack.push("Tayo");
        stack.push("Tosin");

        assertFalse(stack.isEmpty(), "Stack should not be empty after pushes");

        assertEquals("Tosin", stack.pop());
        assertEquals("Tayo", stack.pop());

        assertTrue(stack.isEmpty(), "Stack should be empty after popping all items");
    }

    @Test
    public void testStackOverflow() {
        TheStack stack = new TheStack();
        stack.push("Tayo");
        stack.push("Tosin");
        stack.push("Tope");
        stack.push("Tomi");
        stack.push("Leo");

        
        stack.push("Kastro");  // It Should display "Stack Overflow"

        assertEquals("Leo", stack.pop());
        assertEquals("Tomi", stack.pop());
        assertEquals("Tope", stack.pop());
        assertEquals("Tosin", stack.pop());
        assertEquals("Tayo", stack.pop());

        assertTrue(stack.isEmpty(), "Stack should be empty after all element are popped");
    }

    @Test
    public void testPopOnEmptyStack() {
        TheStack stack = new TheStack();
        String popped = stack.pop();
        assertNull(popped, "The Stack is empty so it should return null");
    }
}










