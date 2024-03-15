package fpoly.edu.vn.BaiLab3;

import java.util.Iterator;

import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.*;

public class TestRuner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ErrorCollectorExample.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result==" + result.wasSuccessful());
	}
}
