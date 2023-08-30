//Remove Dublicate

import java.util.*;

public class RemoveDublicate {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(2);
        al.add(19);
        al.add(12);
        al.add(11);
        al.add(12);
        Set<Integer> s = new LinkedHashSet<>();
        for (int i = 0; i < al.size(); i++) {
            s.add(al.get(i));
        }
        System.out.println(s);
    }
}
