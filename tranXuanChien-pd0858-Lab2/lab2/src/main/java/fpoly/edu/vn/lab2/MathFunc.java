package fpoly.edu.vn.lab2;

import java.security.PublicKey;
import java.util.Iterator;

public class MathFunc {
	
	
	int calls;

	public int getCalls() {
		return calls;
	}

	public long factorial(int number) {
		calls++;
		if (number < 0)
			throw new IllegalArgumentException();
		long result = 1;
		if (number > 1)
			for (int i = 1; i < number; i++)
				result = result * i;
		return result;
	}

	public long push(int num1, int num2) {
		calls++;
		return num1 + num2;
	}
}
