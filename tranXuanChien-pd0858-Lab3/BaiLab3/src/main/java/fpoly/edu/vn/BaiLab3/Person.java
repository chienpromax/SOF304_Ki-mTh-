package fpoly.edu.vn.BaiLab3;

public class Person {
	private final String name;
	private final int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		if (age <= 0) {
			throw new IllegalArgumentException("invalid age: " + age);
		}
	}
}
