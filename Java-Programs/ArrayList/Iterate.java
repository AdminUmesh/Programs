//Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

import java.util.ArrayList;
import java.util.*;

public class Iterate {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);

		int l = al.size();
		System.out.println("while loop: ");

		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("for loop: ");

		for (Object obj : al) {
			System.out.println(obj);
		}
		System.out.println("Advance for loop: ");

		for (int i = 0; i < l; i++) {
			System.out.println(al.get(i));
		}
	}
}