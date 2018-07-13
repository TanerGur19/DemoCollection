package demo;

public class Person implements Comparable<Person> {

	String name;
	int age;

	@Override
	public int compareTo(Person o) {

		return this.name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}