package fpoly.edu.vn.lab2;

import org.junit.runner.*;
public class App 
{
    public static void main( String[] args )
    {
    	JUnitCore runner = new JUnitCore();
    	Result rs = runner.run(MathFuncTest.class);
    	System.out.println("run test " + rs.getRunCount());
    	System.out.println("faild test " + rs.getFailureCount());
    	System.out.println("ignored " + rs.getIgnoreCount());
    	System.out.println("success " + rs.wasSuccessful());
    }
}
