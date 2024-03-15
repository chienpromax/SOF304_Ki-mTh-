package fpoly.edu.vn.lab2;

import java.util.Iterator;

import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class testRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JUnitAnnotations.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("reusult" + result.wasSuccessful());
	}
}
