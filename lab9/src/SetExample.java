import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int val = random.nextInt(50);
            hashSet.add(val);
            treeSet.add(val);
            linkedHashSet.add(val);
        }
        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(linkedHashSet);

        System.out.println("Is 5 presented? " + hashSet.contains(5));
        System.out.println("Let's compare first elements: " + hashSet.iterator().next() + " | " + treeSet.iterator().next() + " | " + linkedHashSet.iterator().next());
    }
}
