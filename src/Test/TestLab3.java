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

    @Test
    public void primeEleven_1(){
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("PrimeEleven", printer.printWord(55));
    }

    @Test
    public void primeEleven_2(){
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("PrimeEleven", printer.printWord(33));
    }

    @Test
    public void primeEleven_3U(){
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("PRIMEELEVEN", printer.printWordCap(77));
    }

    @Test
    public void evenPrimeEleven_1U(){
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("EVENPRIMEELEVEN", printer.printWordCap(66));
    }

    @Test
    public void evenPrimeEleven_2(){
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("EvenPrimeEleven", printer.printWord(22));
    }

    @Test
    public void evenPrimeEleven_3(){
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("EvenPrimeEleven", printer.printWord(44));
    }

    @Test
    public void evenPrimeLucky_1(){
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("evenPrimeLucky", printer.printWord(284));
    }





}
