package ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();
		// a
		System.out.println(findFirst(persons,person -> person.getAge() == 44));
		// b
		System.out.println(findFirst(persons,person -> person.getName().charAt(0) == 'S'));
		// c
		System.out.println(findFirst(persons,flereI));
		// d
		System.out.println(findFirst(persons,person -> person.getName().length() == person.getAge()));

		// f
		System.out.println(findAll(persons,person -> person.getName().contains("i")));
		// g
		System.out.println(findAll(persons,person -> person.getName().charAt(0) == 'S'));
		// h
		System.out.println(findAll(persons,person -> person.getName().length() == 5));
		// i
		System.out.println(findAll(persons,person -> person.getName().length() >= 6 && person.getAge() < 40));




	}

	/**
	 * Returns from the list the first person
	 * that satisfies the predicate.
	 * Returns null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}

	public static Predicate<Person> flereI = (p) -> {
		int count = 0;
		for (int i = 0; i < p.getName().length(); i++) {
			if(p.getName().charAt(i) == 'i'){
				count++;
			}

		}
		return count>1;
	};
	public static ArrayList<Person> findAll(List<Person> list, Predicate<Person> filter){
		ArrayList<Person> temp = new ArrayList<>();
		for(Person p : list){
			if(filter.test(p)){
				temp.add(p);
			}
		}
		return temp;
	}
}
