package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingObjects {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Adam", "Zain", "Bob", "Dave", "Bob");

		Collections.sort(names);

		// System.out.println(names);

		System.out.println(new Person("Adam", 22));

		List<Person> people = new ArrayList<>();
		people.add(new Person("Adam", 22));  //  in order to sort with age we need to customize the 
		people.add(new Person("Dave", 62));   //  compareTo method in Person class because we implement that method here.
		people.add(new Person("Zain", 32));  // but for that we need comparator. 
		people.add(new Person("Bob", 42));

		Collections.sort(people);

		System.out.println(people);
	}

}
