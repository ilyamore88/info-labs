import java.util.*;
import java.util.stream.Collectors;

public class SetCheck {
    public static void main(String[] args) {
        Set<String> hashSet1 = new HashSet<>();
        Set<String> hashSet2 = new HashSet<>();
        Set<String> treeSet1 = new TreeSet<>();
        Set<String> treeSet2 = new TreeSet<>();
        Set<String> linkedHashSet1 = new LinkedHashSet<>();
        Set<String> linkedHashSet2 = new LinkedHashSet<>();
        String text = "A computer's memory can be viewed as a list of cells into which numbers can be placed or read. Each cell has a numbered address and can store a single number. The computer can be instructed to put the number 123 into the cell numbered 1357 or to add the number that is in cell 1357 to the number that is in cell 2468 and put the answer into cell 1595.";
        setFromString(text, hashSet1);
        setFromString(text, treeSet1);
        setFromString(text, linkedHashSet1);
        setFromString("Each cell add number abcdghfo", hashSet2);
        setFromString("computer's memory into cell pfotjghjfhg", treeSet2);
        setFromString("can store that numbered fodkgjofg", linkedHashSet2);

        printSet(union(hashSet1, hashSet2));
        printSet(union(treeSet1, treeSet2));
        printSet(union(linkedHashSet1, linkedHashSet2));

        printSet(intersection(hashSet1, hashSet2));
        printSet(intersection(treeSet1, treeSet2));
        printSet(intersection(linkedHashSet1, linkedHashSet2));

        printSet(subtraction(hashSet1, hashSet2));
        printSet(subtraction(treeSet1, treeSet2));
        printSet(subtraction(linkedHashSet1, linkedHashSet2));
    }

    public static void setFromString(String text, Set stringSet) {
        stringSet.addAll(Arrays.asList(text.split(" ")));
    }

    public static void printSet(Set set) {
        Iterator iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            if (i == 5) {
                i = 0;
                System.out.println();
            }
            System.out.print(iterator.next() + " ");
            i++;
        }
        System.out.println("\n");
    }

    public static Set union(Set<String> set1, Set<String> set2) {
        Set result = set1.stream().collect(Collectors.toSet());     //Эта конструкция позволяет решить проблему с ссылкой на объект
        result.addAll(set2);                                        //в main. В Java объект передаётся по ссылке(это не совсем так, но для понимания пойдёт)
        return result;                                              //Если присвоить напрямую, то все изменения отразятся на Set в основном методе
    }

    public static Set intersection(Set<String> set1, Set<String> set2) {
        Set result = set1.stream().collect(Collectors.toSet());
        result.retainAll(set2);
        return result;
    }

    public static Set subtraction(Set<String> set1, Set<String> set2) {
        Set intersection = set1.stream().collect(Collectors.toSet());
        intersection.retainAll(set2);

        Set result = set1.stream().collect(Collectors.toSet());
        result.addAll(set2);
        result.removeAll(intersection);
        return result;
    }
}
