package list;

import java.util.ArrayList;
import java.util.Collections;

public class DefaulNaturalSorting {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println("Before Sorting:" + l);
		Collections.sort(l);
		System.out.println("After Sorting:" + l);
	}
}
