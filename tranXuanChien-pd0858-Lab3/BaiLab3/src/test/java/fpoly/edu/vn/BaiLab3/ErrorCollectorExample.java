package fpoly.edu.vn.BaiLab3;

import org.junit.*;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorExample {
    
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void example() {
        collector.addError(new Throwable("there is an error in first line"));
        collector.addError(new Throwable("there is an error in second line"));
        System.out.println("hello");
        try {
            Assert.assertTrue("A" == "B");
        } catch (Throwable t) {
            collector.addError(t);
        }
        System.out.println("world!");
    }
}

