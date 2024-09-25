package Test;

import Lab3.MaxStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestTask2 {

    @Test
    public void test1() {
        MaxStack maxStack = new MaxStack();
        maxStack.push(3);
        maxStack.push(2);
        maxStack.push(5);
        maxStack.push(6);
        System.out.println(maxStack.max());
        assertEquals(6, maxStack.max());
    }
}
