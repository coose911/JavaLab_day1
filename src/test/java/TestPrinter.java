import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 80);
    }

    @Test
    public void testPrint() {
        int newArray[] = printer.print(10, 2);
        assertEquals(80, newArray[0]);
    }

    @Test
    public void testToner(){
        int newArray[] = printer.print(10, 2);
        assertEquals(60, newArray[1]);

    }

    @Test
    public void testNewPrint(){
        printer.newPrint(10, 2);
        assertEquals(60, printer.getTonerVolume());
    }

    @Test
    public void testSheetsPrint(){
        int value = printer.newPrint(10, 3);
        assertEquals(70, value);
    }

}
