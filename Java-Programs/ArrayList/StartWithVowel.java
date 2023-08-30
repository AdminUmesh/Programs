// Extract String Starting with vowel in a list

// input --> list-1--> ["Anuradha","Dharmendra","mithlesh","sandeep","umbrela","innova"]
// output --> list2 -->["Dharmendra","Mithlesh","Sandeep"]

import java.util.ArrayList;

public class StartWithVowel {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Anuradha");
		al.add("Dharmendra");
		al.add("Mithlesh");
		al.add("error");
		al.add("iope");
		al.add("umbrela");

		ArrayList<String> al1 = new ArrayList<>();
		System.out.println("frist arrayList " + al);

		for (int i = 0; i < al.size() - 1; i++) {
			String str = al.get(i).toLowerCase();
			
			if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o'
					|| str.charAt(0) == 'u') {
				continue;
			} else {
				al1.add(str);
			}
		}

		System.out.println("After remove first item vowel contain " + al1);
	}
}
