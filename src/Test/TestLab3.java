package Test;

import Lab3.NumWordPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestLab3 {

    @Test
    public void even_1(){
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("Even", printer.printWord(2));
    }

    @Test
    public void even_2(){
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("Even", printer.printWord(6));
    }

    @Test
    public void even_3(){
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("Even", printer.printWord(8));
    }


}
