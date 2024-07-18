package Collection;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicateElement {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 3, 4, 6, 8 };

		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();

		for (Integer i : arr) {
			lh.add(i);
		}
		System.out.println(lh);

		List<Integer> ls = new LinkedList<Integer>(lh);

		Collections.sort(ls);
		System.out.println("Ascending order " + ls);
		Collections.sort(ls, Collections.reverseOrder());
		System.out.println("Descending order " + ls);

	}

}
