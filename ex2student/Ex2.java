package ex2student;

import ex1student.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Ex2 {

	public static void main(String[] args) {
		List<Runner> runners = new ArrayList<>();
		runners.addAll(List.of(
				new Runner("Ib", 30),
				new Runner("Per", 50),
				new Runner("Ole", 27),
				new Runner("Ulla", 40),
				new Runner("Jens", 35),
				new Runner("Hans", 28)));
		System.out.println(runners);
		System.out.println();
		// A
		runners.forEach(System.out::println);
		// B
		runners.forEach(runner -> {
			if(runner.getLapTime() < 30){
				System.out.println(runner);
			}
		});
		// C
		Comparator<Runner> sortLowest = Comparator.comparingInt(Runner::getLapTime);
		runners.sort(sortLowest);
		System.out.println(runners);




	}
	public static Runner findFirst(List<Runner> list, Predicate<Runner> filter) {
		for (Runner r : list) {
			if (filter.test(r))
				return r;
		}
		return null;
	}



}