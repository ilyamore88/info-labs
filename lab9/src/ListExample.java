import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static List getListElementsUnder(int len, List<String> list) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < len) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> arrayListStr = new ArrayList<>();
        arrayListStr.add("Hello");
        arrayListStr.add("Student");
        List<String> result = getListElementsUnder(6, arrayListStr);
        System.out.println(result);

        List<String> linkedListStr = new LinkedList<>();
        linkedListStr.add("Math");
        linkedListStr.add("IT");
        linkedListStr.add("Physics");
        linkedListStr.add("PE");
        List<String> res = getListElementsUnder(6, linkedListStr);
        System.out.println(res);
    }
}
