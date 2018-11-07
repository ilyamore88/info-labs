import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> linkedListStr = new LinkedList<>();
        linkedListStr.add("Math");
        linkedListStr.add("IT");
        linkedListStr.add("Physics");
        Iterator iterator = linkedListStr.iterator();
        System.out.println("Before: " + linkedListStr);
        while (iterator.hasNext()) {
            String elem = iterator.next().toString();
            if (elem.length() >= 6) {
                iterator.remove();
            }
        }
        System.out.println("After: "+linkedListStr);
    }
}
