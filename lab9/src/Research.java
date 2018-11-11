import java.util.*;

//Я ненавижу себя за эту программу. Простите.
public class Research {
    public static void main(String[] args) {
        long[][] timeList10 = researchList10();
        long[][] timeList100 = researchList100();
        long[][] timeList1000 = researchList1000();
        long[][] timeList10000 = researchList10000();

        long[][] timeSet10 = researchSet10();
        long[][] timeSet100 = researchSet100();
        long[][] timeSet1000 = researchSet1000();
        long[][] timeSet10000 = researchSet10000();

        long[][] timeMap10 = researchMap10();
        long[][] timeMap100 = researchMap100();
        long[][] timeMap1000 = researchMap1000();
        long[][] timeMap10000 = researchMap10000();

        //10
        System.out.println();
        System.out.println("10 elements ArrayList: .add(new Sample()): " + timeList10[0][0] + " нс");
        System.out.println("10 elements LinkedList: .add(new Sample()): " + timeList10[0][1] + " нс");
        System.out.println("10 elements ArrayList: .add(4, new Sample()): " + timeList10[1][0] + " нс");
        System.out.println("10 elements LinkedList: .add(4, new Sample()): " + timeList10[1][1] + " нс");
        System.out.println("10 elements ArrayList: .get(0): " + timeList10[2][0] + " нс");
        System.out.println("10 elements LinkedList: .get(0): " + timeList10[2][1] + " нс");
        System.out.println("10 elements ArrayList: .get(4): " + timeList10[3][0] + " нс");
        System.out.println("10 elements LinkedList: .get(4): " + timeList10[3][1] + " нс");
        System.out.println("10 elements ArrayList: .get(sal.size() - 1): " + timeList10[4][0] + " нс");
        System.out.println("10 elements LinkedList: .get(sll.size() - 1): " + timeList10[4][1] + " нс");
        System.out.println("10 elements ArrayList: .contains(new Sample()): " + timeList10[5][0] + " нс");
        System.out.println("10 elements LinkedList: .contains(new Sample()): " + timeList10[5][1] + " нс");
        System.out.println("10 elements ArrayList: System.out.println(sal): " + timeList10[6][0] + " нс");
        System.out.println("10 elements LinkedList: System.out.println(sll): " + timeList10[6][1] + " нс");
        System.out.println("10 elements ArrayList: .remove(sal.get(2)): " + timeList10[7][0] + " нс");
        System.out.println("10 elements LinkedList: .remove(sll.get(2)): " + timeList10[7][1] + " нс");
        System.out.println("10 elements ArrayList: .removeAll(sal.subList(3, 7)): " + timeList10[8][0] + " нс");
        System.out.println("10 elements LinkedList: .removeAll(sll.subList(3, 7)): " + timeList10[8][1] + " нс");
        System.out.println("10 elements ArrayList: .remove(0): " + timeList10[9][0] + " нс");
        System.out.println("10 elements LinkedList: .remove(0): " + timeList10[9][1] + " нс");
        System.out.println("10 elements ArrayList: .remove(4): " + timeList10[10][0] + " нс");
        System.out.println("10 elements LinkedList: .remove(4): " + timeList10[10][1] + " нс");
        System.out.println("10 elements ArrayList: .remove(9): " + timeList10[11][0] + " нс");
        System.out.println("10 elements LinkedList: .remove(9): " + timeList10[11][1] + " нс");
        System.out.println("10 elements HashSet: .add(new Sample()): " + timeSet10[0][0] + " нс");
        System.out.println("10 elements TreeSet: .add(new Sample()): " + timeSet10[0][1] + " нс");
        System.out.println("10 elements LinkedHashSet: .add(new Sample()): " + timeSet10[0][2] + " нс");
        System.out.println("10 elements HashSet: .addAll(collection): " + timeSet10[1][0] + " нс");
        System.out.println("10 elements TreeSet: .addAll(collection): " + timeSet10[1][1] + " нс");
        System.out.println("10 elements LinkedHashSet: .addAll(collection): " + timeSet10[1][2] + " нс");
        System.out.println("10 elements HashSet: .contains(new Sample()): " + timeSet10[2][0] + " нс");
        System.out.println("10 elements TreeSet: .contains(new Sample()): " + timeSet10[2][1] + " нс");
        System.out.println("10 elements LinkedHashSet: .contains(new Sample()): " + timeSet10[2][2] + " нс");
        System.out.println("10 elements HashSet: .remove(new Sample()): " + timeSet10[3][0] + " нс");
        System.out.println("10 elements TreeSet: .remove(new Sample()): " + timeSet10[3][1] + " нс");
        System.out.println("10 elements LinkedHashSet: .remove(new Sample()): " + timeSet10[3][2] + " нс");
        System.out.println("10 elements HashSet: .removeAll(collection): " + timeSet10[4][0] + " нс");
        System.out.println("10 elements TreeSet: .removeAll(collection): " + timeSet10[4][1] + " нс");
        System.out.println("10 elements LinkedHashSet: .removeAll(collection): " + timeSet10[4][2] + " нс");
        System.out.println("10 elements HashSet: System.out.println(hs): " + timeSet10[5][0] + " нс");
        System.out.println("10 elements TreeSet: System.out.println(ts): " + timeSet10[5][1] + " нс");
        System.out.println("10 elements LinkedHashSet: System.out.println(lhs): " + timeSet10[5][2] + " нс");

        System.out.println("10 elements HashMap: .put(\"k10\", new Sample()): " + timeMap10[0][0] + " нс");
        System.out.println("10 elements TreeMap: .put(\"k10\", new Sample()): " + timeMap10[0][1] + " нс");
        System.out.println("10 elements LinkedHashMap: .put(\"k10\", new Sample()): " + timeMap10[0][2] + " нс");
        System.out.println("10 elements HashMap: .entrySet(): " + timeMap10[1][0] + " нс");
        System.out.println("10 elements TreeMap: .entrySet(): " + timeMap10[1][1] + " нс");
        System.out.println("10 elements LinkedHashMap: .entrySet(): " + timeMap10[1][2] + " нс");
        System.out.println("10 elements HashMap: .get(\"k5\"): " + timeMap10[2][0] + " нс");
        System.out.println("10 elements TreeMap: .get(\"k5\"): " + timeMap10[2][1] + " нс");
        System.out.println("10 elements LinkedHashMap: .get(\"k5\"): " + timeMap10[2][2] + " нс");
        System.out.println("10 elements HashMap: .containsKey(\"k5\"): " + timeMap10[3][0] + " нс");
        System.out.println("10 elements TreeMap: .containsKey(\"k5\"): " + timeMap10[3][1] + " нс");
        System.out.println("10 elements LinkedHashMap: .containsKey(\"k5\"): " + timeMap10[3][2] + " нс");
        System.out.println("10 elements HashMap: .containsValue(new Sample()): " + timeMap10[4][0] + " нс");
        System.out.println("10 elements TreeMap: .containsValue(new Sample()): " + timeMap10[4][1] + " нс");
        System.out.println("10 elements LinkedHashMap: .containsValue(new Sample()): " + timeMap10[4][2] + " нс");
        System.out.println("10 elements HashMap: .remove(\"k5\"): " + timeMap10[5][0] + " нс");
        System.out.println("10 elements TreeMap: .remove(\"k5\"): " + timeMap10[5][1] + " нс");
        System.out.println("10 elements LinkedHashMap: .remove(\"k5\"): " + timeMap10[5][2] + " нс");
        System.out.println("10 elements HashMap: .keySet(): " + timeMap10[6][0] + " нс");
        System.out.println("10 elements TreeMap: .keySet(): " + timeMap10[6][1] + " нс");
        System.out.println("10 elements LinkedHashMap: .keySet(): " + timeMap10[6][2] + " нс");
        System.out.println("10 elements HashMap: .values(): " + timeMap10[7][0] + " нс");
        System.out.println("10 elements TreeMap: .values(): " + timeMap10[7][1] + " нс");
        System.out.println("10 elements LinkedHashMap: .values(): " + timeMap10[7][2] + " нс");


        //100
        System.out.println();
        System.out.println("100 elements ArrayList: .add(new Sample()): " + timeList100[0][0] + " нс");
        System.out.println("100 elements LinkedList: .add(new Sample()): " + timeList100[0][1] + " нс");
        System.out.println("100 elements ArrayList: .add(49, new Sample()): " + timeList100[1][0] + " нс");
        System.out.println("100 elements LinkedList: .add(49, new Sample()): " + timeList100[1][1] + " нс");
        System.out.println("100 elements ArrayList: .get(0): " + timeList100[2][0] + " нс");
        System.out.println("100 elements LinkedList: .get(0): " + timeList100[2][1] + " нс");
        System.out.println("100 elements ArrayList: .get(49): " + timeList100[3][0] + " нс");
        System.out.println("100 elements LinkedList: .get(49): " + timeList100[3][1] + " нс");
        System.out.println("100 elements ArrayList: .get(sal.size() - 1): " + timeList100[4][0] + " нс");
        System.out.println("100 elements LinkedList: .get(sll.size() - 1): " + timeList100[4][1] + " нс");
        System.out.println("100 elements ArrayList: .contains(new Sample()): " + timeList100[5][0] + " нс");
        System.out.println("100 elements LinkedList: .contains(new Sample()): " + timeList100[5][1] + " нс");
        System.out.println("100 elements ArrayList: System.out.println(sal): " + timeList100[6][0] + " нс");
        System.out.println("100 elements LinkedList: System.out.println(sll): " + timeList100[6][1] + " нс");
        System.out.println("100 elements ArrayList: .remove(sal.get(2)): " + timeList100[7][0] + " нс");
        System.out.println("100 elements LinkedList: .remove(sll.get(2)): " + timeList100[7][1] + " нс");
        System.out.println("100 elements ArrayList: .removeAll(sal.subList(3, 7)): " + timeList100[8][0] + " нс");
        System.out.println("100 elements LinkedList: .removeAll(sll.subList(3, 7)): " + timeList100[8][1] + " нс");
        System.out.println("100 elements ArrayList: .remove(0): " + timeList100[9][0] + " нс");
        System.out.println("100 elements LinkedList: .remove(0): " + timeList100[9][1] + " нс");
        System.out.println("100 elements ArrayList: .remove(4): " + timeList100[10][0] + " нс");
        System.out.println("100 elements LinkedList: .remove(4): " + timeList100[10][1] + " нс");
        System.out.println("100 elements ArrayList: .remove(99): " + timeList100[11][0] + " нс");
        System.out.println("100 elements LinkedList: .remove(99): " + timeList100[11][1] + " нс");
        System.out.println("100 elements HashSet: .add(new Sample()): " + timeSet100[0][0] + " нс");
        System.out.println("100 elements TreeSet: .add(new Sample()): " + timeSet100[0][1] + " нс");
        System.out.println("100 elements LinkedHashSet: .add(new Sample()): " + timeSet100[0][2] + " нс");
        System.out.println("100 elements HashSet: .addAll(collection): " + timeSet100[1][0] + " нс");
        System.out.println("100 elements TreeSet: .addAll(collection): " + timeSet100[1][1] + " нс");
        System.out.println("100 elements LinkedHashSet: .addAll(collection): " + timeSet100[1][2] + " нс");
        System.out.println("100 elements HashSet: .contains(new Sample()): " + timeSet100[2][0] + " нс");
        System.out.println("100 elements TreeSet: .contains(new Sample()): " + timeSet100[2][1] + " нс");
        System.out.println("100 elements LinkedHashSet: .contains(new Sample()): " + timeSet100[2][2] + " нс");
        System.out.println("100 elements HashSet: .remove(new Sample()): " + timeSet100[3][0] + " нс");
        System.out.println("100 elements TreeSet: .remove(new Sample()): " + timeSet100[3][1] + " нс");
        System.out.println("100 elements LinkedHashSet: .remove(new Sample()): " + timeSet100[3][2] + " нс");
        System.out.println("100 elements HashSet: .removeAll(collection): " + timeSet100[4][0] + " нс");
        System.out.println("100 elements TreeSet: .removeAll(collection): " + timeSet100[4][1] + " нс");
        System.out.println("100 elements LinkedHashSet: .removeAll(collection): " + timeSet100[4][2] + " нс");
        System.out.println("100 elements HashSet: System.out.println(hs): " + timeSet100[5][0] + " нс");
        System.out.println("100 elements TreeSet: System.out.println(ts): " + timeSet100[5][1] + " нс");
        System.out.println("100 elements LinkedHashSet: System.out.println(lhs): " + timeSet100[5][2] + " нс");
        System.out.println("100 elements HashMap: .put(\"k10\", new Sample()): " + timeMap100[0][0] + " нс");
        System.out.println("100 elements TreeMap: .put(\"k10\", new Sample()): " + timeMap100[0][1] + " нс");
        System.out.println("100 elements LinkedHashMap: .put(\"k10\", new Sample()): " + timeMap100[0][2] + " нс");
        System.out.println("100 elements HashMap: .entrySet(): " + timeMap100[1][0] + " нс");
        System.out.println("100 elements TreeMap: .entrySet(): " + timeMap100[1][1] + " нс");
        System.out.println("100 elements LinkedHashMap: .entrySet(): " + timeMap100[1][2] + " нс");
        System.out.println("100 elements HashMap: .get(\"k5\"): " + timeMap100[2][0] + " нс");
        System.out.println("100 elements TreeMap: .get(\"k5\"): " + timeMap100[2][1] + " нс");
        System.out.println("100 elements LinkedHashMap: .get(\"k5\"): " + timeMap100[2][2] + " нс");
        System.out.println("100 elements HashMap: .containsKey(\"k5\"): " + timeMap100[3][0] + " нс");
        System.out.println("100 elements TreeMap: .containsKey(\"k5\"): " + timeMap100[3][1] + " нс");
        System.out.println("100 elements LinkedHashMap: .containsKey(\"k5\"): " + timeMap100[3][2] + " нс");
        System.out.println("100 elements HashMap: .containsValue(new Sample()): " + timeMap100[4][0] + " нс");
        System.out.println("100 elements TreeMap: .containsValue(new Sample()): " + timeMap100[4][1] + " нс");
        System.out.println("100 elements LinkedHashMap: .containsValue(new Sample()): " + timeMap100[4][2] + " нс");
        System.out.println("100 elements HashMap: .remove(\"k5\"): " + timeMap100[5][0] + " нс");
        System.out.println("100 elements TreeMap: .remove(\"k5\"): " + timeMap100[5][1] + " нс");
        System.out.println("100 elements LinkedHashMap: .remove(\"k5\"): " + timeMap100[5][2] + " нс");
        System.out.println("100 elements HashMap: .keySet(): " + timeMap100[6][0] + " нс");
        System.out.println("100 elements TreeMap: .keySet(): " + timeMap100[6][1] + " нс");
        System.out.println("100 elements LinkedHashMap: .keySet(): " + timeMap100[6][2] + " нс");
        System.out.println("100 elements HashMap: .values(): " + timeMap100[7][0] + " нс");
        System.out.println("100 elements TreeMap: .values(): " + timeMap100[7][1] + " нс");
        System.out.println("100 elements LinkedHashMap: .values(): " + timeMap100[7][2] + " нс");


        //1000
        System.out.println();
        System.out.println("1000 elements ArrayList: .add(new Sample()): " + timeList1000[0][0] + " нс");
        System.out.println("1000 elements LinkedList: .add(new Sample()): " + timeList1000[0][1] + " нс");
        System.out.println("1000 elements ArrayList: .add(499, new Sample()): " + timeList1000[1][0] + " нс");
        System.out.println("1000 elements LinkedList: .add(499, new Sample()): " + timeList1000[1][1] + " нс");
        System.out.println("1000 elements ArrayList: .get(0): " + timeList1000[2][0] + " нс");
        System.out.println("1000 elements LinkedList: .get(0): " + timeList1000[2][1] + " нс");
        System.out.println("1000 elements ArrayList: .get(499): " + timeList1000[3][0] + " нс");
        System.out.println("1000 elements LinkedList: .get(499): " + timeList1000[3][1] + " нс");
        System.out.println("1000 elements ArrayList: .get(sal.size() - 1): " + timeList1000[4][0] + " нс");
        System.out.println("1000 elements LinkedList: .get(sll.size() - 1): " + timeList1000[4][1] + " нс");
        System.out.println("1000 elements ArrayList: .contains(new Sample()): " + timeList1000[5][0] + " нс");
        System.out.println("1000 elements LinkedList: .contains(new Sample()): " + timeList1000[5][1] + " нс");
        System.out.println("1000 elements ArrayList: System.out.println(sal): " + timeList1000[6][0] + " нс");
        System.out.println("1000 elements LinkedList: System.out.println(sll): " + timeList1000[6][1] + " нс");
        System.out.println("1000 elements ArrayList: .remove(sal.get(2)): " + timeList1000[7][0] + " нс");
        System.out.println("1000 elements LinkedList: .remove(sll.get(2)): " + timeList1000[7][1] + " нс");
        System.out.println("1000 elements ArrayList: .removeAll(sal.subList(3, 7)): " + timeList1000[8][0] + " нс");
        System.out.println("1000 elements LinkedList: .removeAll(sll.subList(3, 7)): " + timeList1000[8][1] + " нс");
        System.out.println("1000 elements ArrayList: .remove(0): " + timeList1000[9][0] + " нс");
        System.out.println("1000 elements LinkedList: .remove(0): " + timeList1000[9][1] + " нс");
        System.out.println("1000 elements ArrayList: .remove(4): " + timeList1000[10][0] + " нс");
        System.out.println("1000 elements LinkedList: .remove(4): " + timeList1000[10][1] + " нс");
        System.out.println("1000 elements ArrayList: .remove(999): " + timeList1000[11][0] + " нс");
        System.out.println("1000 elements LinkedList: .remove(999): " + timeList1000[11][1] + " нс");
        System.out.println("1000 elements HashSet: .add(new Sample()): " + timeSet1000[0][0] + " нс");
        System.out.println("1000 elements TreeSet: .add(new Sample()): " + timeSet1000[0][1] + " нс");
        System.out.println("1000 elements LinkedHashSet: .add(new Sample()): " + timeSet1000[0][2] + " нс");
        System.out.println("1000 elements HashSet: .addAll(collection): " + timeSet1000[1][0] + " нс");
        System.out.println("1000 elements TreeSet: .addAll(collection): " + timeSet1000[1][1] + " нс");
        System.out.println("1000 elements LinkedHashSet: .addAll(collection): " + timeSet1000[1][2] + " нс");
        System.out.println("1000 elements HashSet: .contains(new Sample()): " + timeSet1000[2][0] + " нс");
        System.out.println("1000 elements TreeSet: .contains(new Sample()): " + timeSet1000[2][1] + " нс");
        System.out.println("1000 elements LinkedHashSet: .contains(new Sample()): " + timeSet1000[2][2] + " нс");
        System.out.println("1000 elements HashSet: .remove(new Sample()): " + timeSet1000[3][0] + " нс");
        System.out.println("1000 elements TreeSet: .remove(new Sample()): " + timeSet1000[3][1] + " нс");
        System.out.println("1000 elements LinkedHashSet: .remove(new Sample()): " + timeSet1000[3][2] + " нс");
        System.out.println("1000 elements HashSet: .removeAll(collection): " + timeSet1000[4][0] + " нс");
        System.out.println("1000 elements TreeSet: .removeAll(collection): " + timeSet1000[4][1] + " нс");
        System.out.println("1000 elements LinkedHashSet: .removeAll(collection): " + timeSet1000[4][2] + " нс");
        System.out.println("1000 elements HashSet: System.out.println(hs): " + timeSet1000[5][0] + " нс");
        System.out.println("1000 elements TreeSet: System.out.println(ts): " + timeSet1000[5][1] + " нс");
        System.out.println("1000 elements LinkedHashSet: System.out.println(lhs): " + timeSet1000[5][2] + " нс");
        System.out.println("1000 elements HashMap: .put(\"k10\", new Sample()): " + timeMap1000[0][0] + " нс");
        System.out.println("1000 elements TreeMap: .put(\"k10\", new Sample()): " + timeMap1000[0][1] + " нс");
        System.out.println("1000 elements LinkedHashMap: .put(\"k10\", new Sample()): " + timeMap1000[0][2] + " нс");
        System.out.println("1000 elements HashMap: .entrySet(): " + timeMap1000[1][0] + " нс");
        System.out.println("1000 elements TreeMap: .entrySet(): " + timeMap1000[1][1] + " нс");
        System.out.println("1000 elements LinkedHashMap: .entrySet(): " + timeMap1000[1][2] + " нс");
        System.out.println("1000 elements HashMap: .get(\"k5\"): " + timeMap1000[2][0] + " нс");
        System.out.println("1000 elements TreeMap: .get(\"k5\"): " + timeMap1000[2][1] + " нс");
        System.out.println("1000 elements LinkedHashMap: .get(\"k5\"): " + timeMap1000[2][2] + " нс");
        System.out.println("1000 elements HashMap: .containsKey(\"k5\"): " + timeMap1000[3][0] + " нс");
        System.out.println("1000 elements TreeMap: .containsKey(\"k5\"): " + timeMap1000[3][1] + " нс");
        System.out.println("1000 elements LinkedHashMap: .containsKey(\"k5\"): " + timeMap1000[3][2] + " нс");
        System.out.println("1000 elements HashMap: .containsValue(new Sample()): " + timeMap1000[4][0] + " нс");
        System.out.println("1000 elements TreeMap: .containsValue(new Sample()): " + timeMap1000[4][1] + " нс");
        System.out.println("1000 elements LinkedHashMap: .containsValue(new Sample()): " + timeMap1000[4][2] + " нс");
        System.out.println("1000 elements HashMap: .remove(\"k5\"): " + timeMap1000[5][0] + " нс");
        System.out.println("1000 elements TreeMap: .remove(\"k5\"): " + timeMap1000[5][1] + " нс");
        System.out.println("1000 elements LinkedHashMap: .remove(\"k5\"): " + timeMap1000[5][2] + " нс");
        System.out.println("1000 elements HashMap: .keySet(): " + timeMap1000[6][0] + " нс");
        System.out.println("1000 elements TreeMap: .keySet(): " + timeMap1000[6][1] + " нс");
        System.out.println("1000 elements LinkedHashMap: .keySet(): " + timeMap1000[6][2] + " нс");
        System.out.println("1000 elements HashMap: .values(): " + timeMap1000[7][0] + " нс");
        System.out.println("1000 elements TreeMap: .values(): " + timeMap1000[7][1] + " нс");
        System.out.println("1000 elements LinkedHashMap: .values(): " + timeMap1000[7][2] + " нс");


        //10000
        System.out.println();
        System.out.println("10000 elements ArrayList: .add(new Sample()): " + timeList10000[0][0] + " нс");
        System.out.println("10000 elements LinkedList: .add(new Sample()): " + timeList10000[0][1] + " нс");
        System.out.println("10000 elements ArrayList: .add(4999, new Sample()): " + timeList10000[1][0] + " нс");
        System.out.println("10000 elements LinkedList: .add(4999, new Sample()): " + timeList10000[1][1] + " нс");
        System.out.println("10000 elements ArrayList: .get(0): " + timeList10000[2][0] + " нс");
        System.out.println("10000 elements LinkedList: .get(0): " + timeList10000[2][1] + " нс");
        System.out.println("10000 elements ArrayList: .get(4999): " + timeList10000[3][0] + " нс");
        System.out.println("10000 elements LinkedList: .get(4999): " + timeList10000[3][1] + " нс");
        System.out.println("10000 elements ArrayList: .get(sal.size() - 1): " + timeList10000[4][0] + " нс");
        System.out.println("10000 elements LinkedList: .get(sll.size() - 1): " + timeList10000[4][1] + " нс");
        System.out.println("10000 elements ArrayList: .contains(new Sample()): " + timeList10000[5][0] + " нс");
        System.out.println("10000 elements LinkedList: .contains(new Sample()): " + timeList10000[5][1] + " нс");
        System.out.println("10000 elements ArrayList: System.out.println(sal): " + timeList10000[6][0] + " нс");
        System.out.println("10000 elements LinkedList: System.out.println(sll): " + timeList10000[6][1] + " нс");
        System.out.println("10000 elements ArrayList: .remove(sal.get(2)): " + timeList10000[7][0] + " нс");
        System.out.println("10000 elements LinkedList: .remove(sll.get(2)): " + timeList10000[7][1] + " нс");
        System.out.println("10000 elements ArrayList: .removeAll(sal.subList(3, 7)): " + timeList10000[8][0] + " нс");
        System.out.println("10000 elements LinkedList: .removeAll(sll.subList(3, 7)): " + timeList10000[8][1] + " нс");
        System.out.println("10000 elements ArrayList: .remove(0): " + timeList10000[9][0] + " нс");
        System.out.println("10000 elements LinkedList: .remove(0): " + timeList10000[9][1] + " нс");
        System.out.println("10000 elements ArrayList: .remove(4): " + timeList10000[10][0] + " нс");
        System.out.println("10000 elements LinkedList: .remove(4): " + timeList10000[10][1] + " нс");
        System.out.println("10000 elements ArrayList: .remove(9999): " + timeList10000[11][0] + " нс");
        System.out.println("10000 elements LinkedList: .remove(9999): " + timeList10000[11][1] + " нс");
        System.out.println("10000 elements HashSet: .add(new Sample()): " + timeSet10000[0][0] + " нс");
        System.out.println("10000 elements TreeSet: .add(new Sample()): " + timeSet10000[0][1] + " нс");
        System.out.println("10000 elements LinkedHashSet: .add(new Sample()): " + timeSet10000[0][2] + " нс");
        System.out.println("10000 elements HashSet: .addAll(collection): " + timeSet10000[1][0] + " нс");
        System.out.println("10000 elements TreeSet: .addAll(collection): " + timeSet10000[1][1] + " нс");
        System.out.println("10000 elements LinkedHashSet: .addAll(collection): " + timeSet10000[1][2] + " нс");
        System.out.println("10000 elements HashSet: .contains(new Sample()): " + timeSet10000[2][0] + " нс");
        System.out.println("10000 elements TreeSet: .contains(new Sample()): " + timeSet10000[2][1] + " нс");
        System.out.println("10000 elements LinkedHashSet: .contains(new Sample()): " + timeSet10000[2][2] + " нс");
        System.out.println("10000 elements HashSet: .remove(new Sample()): " + timeSet10000[3][0] + " нс");
        System.out.println("10000 elements TreeSet: .remove(new Sample()): " + timeSet10000[3][1] + " нс");
        System.out.println("10000 elements LinkedHashSet: .remove(new Sample()): " + timeSet10000[3][2] + " нс");
        System.out.println("10000 elements HashSet: .removeAll(collection): " + timeSet10000[4][0] + " нс");
        System.out.println("10000 elements TreeSet: .removeAll(collection): " + timeSet10000[4][1] + " нс");
        System.out.println("10000 elements LinkedHashSet: .removeAll(collection): " + timeSet10000[4][2] + " нс");
        System.out.println("10000 elements HashSet: System.out.println(hs): " + timeSet10000[5][0] + " нс");
        System.out.println("10000 elements TreeSet: System.out.println(ts): " + timeSet10000[5][1] + " нс");
        System.out.println("10000 elements LinkedHashSet: System.out.println(lhs): " + timeSet10000[5][2] + " нс");
        System.out.println("10000 elements HashMap: .put(\"k10\", new Sample()): " + timeMap10000[0][0] + " нс");
        System.out.println("10000 elements TreeMap: .put(\"k10\", new Sample()): " + timeMap10000[0][1] + " нс");
        System.out.println("10000 elements LinkedHashMap: .put(\"k10\", new Sample()): " + timeMap10000[0][2] + " нс");
        System.out.println("10000 elements HashMap: .entrySet(): " + timeMap10000[1][0] + " нс");
        System.out.println("10000 elements TreeMap: .entrySet(): " + timeMap10000[1][1] + " нс");
        System.out.println("10000 elements LinkedHashMap: .entrySet(): " + timeMap10000[1][2] + " нс");
        System.out.println("10000 elements HashMap: .get(\"k5\"): " + timeMap10000[2][0] + " нс");
        System.out.println("10000 elements TreeMap: .get(\"k5\"): " + timeMap10000[2][1] + " нс");
        System.out.println("10000 elements LinkedHashMap: .get(\"k5\"): " + timeMap10000[2][2] + " нс");
        System.out.println("10000 elements HashMap: .containsKey(\"k5\"): " + timeMap10000[3][0] + " нс");
        System.out.println("10000 elements TreeMap: .containsKey(\"k5\"): " + timeMap10000[3][1] + " нс");
        System.out.println("10000 elements LinkedHashMap: .containsKey(\"k5\"): " + timeMap10000[3][2] + " нс");
        System.out.println("10000 elements HashMap: .containsValue(new Sample()): " + timeMap10000[4][0] + " нс");
        System.out.println("10000 elements TreeMap: .containsValue(new Sample()): " + timeMap10000[4][1] + " нс");
        System.out.println("10000 elements LinkedHashMap: .containsValue(new Sample()): " + timeMap10000[4][2] + " нс");
        System.out.println("10000 elements HashMap: .remove(\"k5\"): " + timeMap10000[5][0] + " нс");
        System.out.println("10000 elements TreeMap: .remove(\"k5\"): " + timeMap10000[5][1] + " нс");
        System.out.println("10000 elements LinkedHashMap: .remove(\"k5\"): " + timeMap10000[5][2] + " нс");
        System.out.println("10000 elements HashMap: .keySet(): " + timeMap10000[6][0] + " нс");
        System.out.println("10000 elements TreeMap: .keySet(): " + timeMap10000[6][1] + " нс");
        System.out.println("10000 elements LinkedHashMap: .keySet(): " + timeMap10000[6][2] + " нс");
        System.out.println("10000 elements HashMap: .values(): " + timeMap10000[7][0] + " нс");
        System.out.println("10000 elements TreeMap: .values(): " + timeMap10000[7][1] + " нс");
        System.out.println("10000 elements LinkedHashMap: .values(): " + timeMap10000[7][2] + " нс");
    }

    public static long[][] researchList10() {
        long[][] time = new long[12][2];
        long startTime;
        long stopTime;
        List<Sample> sampleArrayList10 = new ArrayList<>();
        List<Sample> sampleLinkedList10 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            sampleArrayList10.add(new Sample());
            sampleLinkedList10.add(new Sample());
        }

        List<Sample> sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        List<Sample> sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();
        //Вставка в конец
        startTime = System.nanoTime();      //Для большей точности я использовал наносекунды. Если хотите выполнять по заданию, то замените на System.currentTimeMillis();
        sal.add(new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        startTime = System.nanoTime();
        sll.add(new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        //Вставка в середину
        startTime = System.nanoTime();
        sal.add(4, new Sample());
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        startTime = System.nanoTime();
        sll.add(4, new Sample());
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        //Получение первого элемента
        startTime = System.nanoTime();
        sal.get(0);
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        startTime = System.nanoTime();
        sll.get(0);
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        //Получение элемента из центра
        startTime = System.nanoTime();
        sal.get(4);
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        startTime = System.nanoTime();
        sll.get(4);
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        //Получение последнего элемента
        startTime = System.nanoTime();
        sal.get(sal.size() - 1);
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        startTime = System.nanoTime();
        sll.get(sll.size() - 1);
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        //Проверка наличия элемента
        startTime = System.nanoTime();
        sal.contains(new Sample());
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        startTime = System.nanoTime();
        sll.contains(new Sample());
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        //Вывод на экран
        startTime = System.nanoTime();
        System.out.println(sal);
        stopTime = System.nanoTime();
        time[6][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        startTime = System.nanoTime();
        System.out.println(sll);
        stopTime = System.nanoTime();
        time[6][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        //Удаление по значению
        startTime = System.nanoTime();
        sal.remove(sal.get(2));
        stopTime = System.nanoTime();
        time[7][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        startTime = System.nanoTime();
        sll.remove(sll.get(2));
        stopTime = System.nanoTime();
        time[7][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        //Удаление коллекции
        startTime = System.nanoTime();
        sal.removeAll(sal.subList(3, 7));
        stopTime = System.nanoTime();
        time[8][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        List sllTemp = (LinkedList) ((LinkedList<Sample>) sll).clone();
        startTime = System.nanoTime();
        sllTemp.removeAll(sll.subList(3, 7));
        stopTime = System.nanoTime();
        time[8][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        //Удаление первого элемента
        startTime = System.nanoTime();
        sal.remove(0);
        stopTime = System.nanoTime();
        time[9][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        startTime = System.nanoTime();
        sll.remove(0);
        stopTime = System.nanoTime();
        time[9][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        //Удаление из середины
        startTime = System.nanoTime();
        sal.remove(4);
        stopTime = System.nanoTime();
        time[10][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        startTime = System.nanoTime();
        sll.remove(4);
        stopTime = System.nanoTime();
        time[10][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        //Удаление последнего элемента
        startTime = System.nanoTime();
        sal.remove(9);
        stopTime = System.nanoTime();
        time[11][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10).clone();
        startTime = System.nanoTime();
        sll.remove(9);
        stopTime = System.nanoTime();
        time[11][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10).clone();

        return time;
    }

    public static long[][] researchList100() {
        long[][] time = new long[12][2];
        long startTime;
        long stopTime;
        List<Sample> sampleArrayList100 = new ArrayList<>();
        List<Sample> sampleLinkedList100 = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            sampleArrayList100.add(new Sample());
            sampleLinkedList100.add(new Sample());
        }

        List<Sample> sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        List<Sample> sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();
        //Вставка в конец
        startTime = System.nanoTime();      //Для большей точности я использовал наносекунды. Если хотите выполнять по заданию, то замените на System.currentTimeMillis();
        sal.add(new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        startTime = System.nanoTime();
        sll.add(new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        //Вставка в середину
        startTime = System.nanoTime();
        sal.add(49, new Sample());
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        startTime = System.nanoTime();
        sll.add(49, new Sample());
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        //Получение первого элемента
        startTime = System.nanoTime();
        sal.get(0);
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        startTime = System.nanoTime();
        sll.get(0);
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        //Получение элемента из центра
        startTime = System.nanoTime();
        sal.get(49);
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        startTime = System.nanoTime();
        sll.get(49);
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        //Получение последнего элемента
        startTime = System.nanoTime();
        sal.get(sal.size() - 1);
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        startTime = System.nanoTime();
        sll.get(sll.size() - 1);
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        //Проверка наличия элемента
        startTime = System.nanoTime();
        sal.contains(new Sample());
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        startTime = System.nanoTime();
        sll.contains(new Sample());
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        //Вывод на экран
        startTime = System.nanoTime();
        System.out.println(sal);
        stopTime = System.nanoTime();
        time[6][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        startTime = System.nanoTime();
        System.out.println(sll);
        stopTime = System.nanoTime();
        time[6][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        //Удаление по значению
        startTime = System.nanoTime();
        sal.remove(sal.get(2));
        stopTime = System.nanoTime();
        time[7][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        startTime = System.nanoTime();
        sll.remove(sll.get(2));
        stopTime = System.nanoTime();
        time[7][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        //Удаление коллекции
        startTime = System.nanoTime();
        sal.removeAll(sal.subList(3, 59));
        stopTime = System.nanoTime();
        time[8][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        List sllTemp = (LinkedList) ((LinkedList<Sample>) sll).clone();
        startTime = System.nanoTime();
        sllTemp.removeAll(sll.subList(3, 59));
        stopTime = System.nanoTime();
        time[8][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        //Удаление первого элемента
        startTime = System.nanoTime();
        sal.remove(0);
        stopTime = System.nanoTime();
        time[9][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        startTime = System.nanoTime();
        sll.remove(0);
        stopTime = System.nanoTime();
        time[9][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        //Удаление из середины
        startTime = System.nanoTime();
        sal.remove(49);
        stopTime = System.nanoTime();
        time[10][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        startTime = System.nanoTime();
        sll.remove(49);
        stopTime = System.nanoTime();
        time[10][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        //Удаление последнего элемента
        startTime = System.nanoTime();
        sal.remove(99);
        stopTime = System.nanoTime();
        time[11][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList100).clone();
        startTime = System.nanoTime();
        sll.remove(99);
        stopTime = System.nanoTime();
        time[11][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList100).clone();

        return time;
    }

    public static long[][] researchList1000() {
        long[][] time = new long[12][2];
        long startTime;
        long stopTime;
        List<Sample> sampleArrayList1000 = new ArrayList<>();
        List<Sample> sampleLinkedList1000 = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            sampleArrayList1000.add(new Sample());
            sampleLinkedList1000.add(new Sample());
        }

        List<Sample> sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        List<Sample> sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();
        //Вставка в конец
        startTime = System.nanoTime();      //Для большей точности я использовал наносекунды. Если хотите выполнять по заданию, то замените на System.currentTimeMillis();
        sal.add(new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        startTime = System.nanoTime();
        sll.add(new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        //Вставка в середину
        startTime = System.nanoTime();
        sal.add(499, new Sample());
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        startTime = System.nanoTime();
        sll.add(499, new Sample());
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        //Получение первого элемента
        startTime = System.nanoTime();
        sal.get(0);
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        startTime = System.nanoTime();
        sll.get(0);
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        //Получение элемента из центра
        startTime = System.nanoTime();
        sal.get(499);
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        startTime = System.nanoTime();
        sll.get(499);
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        //Получение последнего элемента
        startTime = System.nanoTime();
        sal.get(sal.size() - 1);
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        startTime = System.nanoTime();
        sll.get(sll.size() - 1);
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        //Проверка наличия элемента
        startTime = System.nanoTime();
        sal.contains(new Sample());
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        startTime = System.nanoTime();
        sll.contains(new Sample());
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        //Вывод на экран
        startTime = System.nanoTime();
        System.out.println(sal);
        stopTime = System.nanoTime();
        time[6][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        startTime = System.nanoTime();
        System.out.println(sll);
        stopTime = System.nanoTime();
        time[6][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        //Удаление по значению
        startTime = System.nanoTime();
        sal.remove(sal.get(2));
        stopTime = System.nanoTime();
        time[7][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        startTime = System.nanoTime();
        sll.remove(sll.get(2));
        stopTime = System.nanoTime();
        time[7][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        //Удаление коллекции
        startTime = System.nanoTime();
        sal.removeAll(sal.subList(399, 799));
        stopTime = System.nanoTime();
        time[8][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        List sllTemp = (LinkedList) ((LinkedList<Sample>) sll).clone();
        startTime = System.nanoTime();
        sllTemp.removeAll(sll.subList(399, 799));
        stopTime = System.nanoTime();
        time[8][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        //Удаление первого элемента
        startTime = System.nanoTime();
        sal.remove(0);
        stopTime = System.nanoTime();
        time[9][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        startTime = System.nanoTime();
        sll.remove(0);
        stopTime = System.nanoTime();
        time[9][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        //Удаление из середины
        startTime = System.nanoTime();
        sal.remove(499);
        stopTime = System.nanoTime();
        time[10][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        startTime = System.nanoTime();
        sll.remove(499);
        stopTime = System.nanoTime();
        time[10][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        //Удаление последнего элемента
        startTime = System.nanoTime();
        sal.remove(999);
        stopTime = System.nanoTime();
        time[11][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList1000).clone();
        startTime = System.nanoTime();
        sll.remove(999);
        stopTime = System.nanoTime();
        time[11][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList1000).clone();

        return time;
    }

    public static long[][] researchList10000() {
        long[][] time = new long[12][2];
        long startTime;
        long stopTime;
        List<Sample> sampleArrayList10000 = new ArrayList<>();
        List<Sample> sampleLinkedList10000 = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            sampleArrayList10000.add(new Sample());
            sampleLinkedList10000.add(new Sample());
        }

        List<Sample> sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        List<Sample> sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();
        //Вставка в конец
        startTime = System.nanoTime();      //Для большей точности я использовал наносекунды. Если хотите выполнять по заданию, то замените на System.currentTimeMillis();
        sal.add(new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        startTime = System.nanoTime();
        sll.add(new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        //Вставка в середину
        startTime = System.nanoTime();
        sal.add(4999, new Sample());
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        startTime = System.nanoTime();
        sll.add(4999, new Sample());
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        //Получение первого элемента
        startTime = System.nanoTime();
        sal.get(0);
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        startTime = System.nanoTime();
        sll.get(0);
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        //Получение элемента из центра
        startTime = System.nanoTime();
        sal.get(4999);
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        startTime = System.nanoTime();
        sll.get(4999);
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        //Получение последнего элемента
        startTime = System.nanoTime();
        sal.get(sal.size() - 1);
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        startTime = System.nanoTime();
        sll.get(sll.size() - 1);
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        //Проверка наличия элемента
        startTime = System.nanoTime();
        sal.contains(new Sample());
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        startTime = System.nanoTime();
        sll.contains(new Sample());
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        //Вывод на экран
        startTime = System.nanoTime();
        System.out.println(sal);
        stopTime = System.nanoTime();
        time[6][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        startTime = System.nanoTime();
        System.out.println(sll);
        stopTime = System.nanoTime();
        time[6][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        //Удаление по значению
        startTime = System.nanoTime();
        sal.remove(sal.get(2));
        stopTime = System.nanoTime();
        time[7][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        startTime = System.nanoTime();
        sll.remove(sll.get(2));
        stopTime = System.nanoTime();
        time[7][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        //Удаление коллекции
        startTime = System.nanoTime();
        sal.removeAll(sal.subList(3999, 7999));
        stopTime = System.nanoTime();
        time[8][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        List sllTemp = (LinkedList) ((LinkedList<Sample>) sll).clone();
        startTime = System.nanoTime();
        sllTemp.removeAll(sll.subList(3999, 7999));
        stopTime = System.nanoTime();
        time[8][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        //Удаление первого элемента
        startTime = System.nanoTime();
        sal.remove(0);
        stopTime = System.nanoTime();
        time[9][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        startTime = System.nanoTime();
        sll.remove(0);
        stopTime = System.nanoTime();
        time[9][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        //Удаление из середины
        startTime = System.nanoTime();
        sal.remove(4999);
        stopTime = System.nanoTime();
        time[10][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        startTime = System.nanoTime();
        sll.remove(4999);
        stopTime = System.nanoTime();
        time[10][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        //Удаление последнего элемента
        startTime = System.nanoTime();
        sal.remove(9999);
        stopTime = System.nanoTime();
        time[11][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList10000).clone();
        startTime = System.nanoTime();
        sll.remove(9999);
        stopTime = System.nanoTime();
        time[11][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList10000).clone();

        return time;
    }

    public static long[][] researchSet10() {
        long[][] time = new long[6][3];
        long startTime;
        long stopTime;
        Set<Sample> hashSet10 = new HashSet<>();
        Set<Sample> treeSet10 = new TreeSet<>();
        Set<Sample> linkedHashSet10 = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet10.add(new Sample());
            treeSet10.add(new Sample());
            linkedHashSet10.add(new Sample());
        }
        Set<Sample> hs = (HashSet) ((HashSet<Sample>) hashSet10).clone();
        Set<Sample> ts = (TreeSet) ((TreeSet<Sample>) treeSet10).clone();
        Set<Sample> lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10).clone();

        //Добавление элемента
        startTime = System.nanoTime();
        hs.add(new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10).clone();
        startTime = System.nanoTime();
        ts.add(new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10).clone();
        startTime = System.nanoTime();
        lhs.add(new Sample());
        stopTime = System.nanoTime();
        time[0][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10).clone();

        //Добавление коллекции
        ArrayList<Sample> collection = new ArrayList<>();
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        startTime = System.nanoTime();
        hs.addAll(collection);
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10).clone();
        startTime = System.nanoTime();
        ts.addAll(collection);
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10).clone();
        startTime = System.nanoTime();
        lhs.addAll(collection);
        stopTime = System.nanoTime();
        time[1][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10).clone();

        //Проверка наличия элемента
        startTime = System.nanoTime();
        hs.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10).clone();
        startTime = System.nanoTime();
        ts.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10).clone();
        startTime = System.nanoTime();
        lhs.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10).clone();

        //Удаление элемента по значению
        startTime = System.nanoTime();
        hs.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10).clone();
        startTime = System.nanoTime();
        ts.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10).clone();
        startTime = System.nanoTime();
        lhs.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10).clone();

        //Удаление коллекции элементов
        startTime = System.nanoTime();
        hs.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10).clone();
        startTime = System.nanoTime();
        ts.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10).clone();
        startTime = System.nanoTime();
        lhs.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10).clone();

        //Вывод на экран
        startTime = System.nanoTime();
        System.out.println(hs);
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10).clone();
        startTime = System.nanoTime();
        System.out.println(ts);
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10).clone();
        startTime = System.nanoTime();
        System.out.println(lhs);
        stopTime = System.nanoTime();
        time[5][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10).clone();

        return time;
    }

    public static long[][] researchSet100() {
        long[][] time = new long[6][3];
        long startTime;
        long stopTime;
        Set<Sample> hashSet100 = new HashSet<>();
        Set<Sample> treeSet100 = new TreeSet<>();
        Set<Sample> linkedHashSet100 = new LinkedHashSet<>();
        for (int i = 0; i < 100; i++) {
            hashSet100.add(new Sample());
            treeSet100.add(new Sample());
            linkedHashSet100.add(new Sample());
        }
        Set<Sample> hs = (HashSet) ((HashSet<Sample>) hashSet100).clone();
        Set<Sample> ts = (TreeSet) ((TreeSet<Sample>) treeSet100).clone();
        Set<Sample> lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet100).clone();

        //Добавление элемента
        startTime = System.nanoTime();
        hs.add(new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet100).clone();
        startTime = System.nanoTime();
        ts.add(new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet100).clone();
        startTime = System.nanoTime();
        lhs.add(new Sample());
        stopTime = System.nanoTime();
        time[0][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet100).clone();

        //Добавление коллекции
        ArrayList<Sample> collection = new ArrayList<>();
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        startTime = System.nanoTime();
        hs.addAll(collection);
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet100).clone();
        startTime = System.nanoTime();
        ts.addAll(collection);
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet100).clone();
        startTime = System.nanoTime();
        lhs.addAll(collection);
        stopTime = System.nanoTime();
        time[1][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet100).clone();

        //Проверка наличия элемента
        startTime = System.nanoTime();
        hs.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet100).clone();
        startTime = System.nanoTime();
        ts.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet100).clone();
        startTime = System.nanoTime();
        lhs.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet100).clone();

        //Удаление элемента по значению
        startTime = System.nanoTime();
        hs.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet100).clone();
        startTime = System.nanoTime();
        ts.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet100).clone();
        startTime = System.nanoTime();
        lhs.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet100).clone();

        //Удаление коллекции элементов
        startTime = System.nanoTime();
        hs.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet100).clone();
        startTime = System.nanoTime();
        ts.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet100).clone();
        startTime = System.nanoTime();
        lhs.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet100).clone();

        //Вывод на экран
        startTime = System.nanoTime();
        System.out.println(hs);
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet100).clone();
        startTime = System.nanoTime();
        System.out.println(ts);
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet100).clone();
        startTime = System.nanoTime();
        System.out.println(lhs);
        stopTime = System.nanoTime();
        time[5][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet100).clone();

        return time;
    }

    public static long[][] researchSet1000() {
        long[][] time = new long[6][3];
        long startTime;
        long stopTime;
        Set<Sample> hashSet1000 = new HashSet<>();
        Set<Sample> treeSet1000 = new TreeSet<>();
        Set<Sample> linkedHashSet1000 = new LinkedHashSet<>();
        for (int i = 0; i < 1000; i++) {
            hashSet1000.add(new Sample());
            treeSet1000.add(new Sample());
            linkedHashSet1000.add(new Sample());
        }
        Set<Sample> hs = (HashSet) ((HashSet<Sample>) hashSet1000).clone();
        Set<Sample> ts = (TreeSet) ((TreeSet<Sample>) treeSet1000).clone();
        Set<Sample> lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet1000).clone();

        //Добавление элемента
        startTime = System.nanoTime();
        hs.add(new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet1000).clone();
        startTime = System.nanoTime();
        ts.add(new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet1000).clone();
        startTime = System.nanoTime();
        lhs.add(new Sample());
        stopTime = System.nanoTime();
        time[0][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet1000).clone();

        //Добавление коллекции
        ArrayList<Sample> collection = new ArrayList<>();
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        startTime = System.nanoTime();
        hs.addAll(collection);
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet1000).clone();
        startTime = System.nanoTime();
        ts.addAll(collection);
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet1000).clone();
        startTime = System.nanoTime();
        lhs.addAll(collection);
        stopTime = System.nanoTime();
        time[1][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet1000).clone();

        //Проверка наличия элемента
        startTime = System.nanoTime();
        hs.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet1000).clone();
        startTime = System.nanoTime();
        ts.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet1000).clone();
        startTime = System.nanoTime();
        lhs.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet1000).clone();

        //Удаление элемента по значению
        startTime = System.nanoTime();
        hs.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet1000).clone();
        startTime = System.nanoTime();
        ts.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet1000).clone();
        startTime = System.nanoTime();
        lhs.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet1000).clone();

        //Удаление коллекции элементов
        startTime = System.nanoTime();
        hs.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet1000).clone();
        startTime = System.nanoTime();
        ts.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet1000).clone();
        startTime = System.nanoTime();
        lhs.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet1000).clone();

        //Вывод на экран
        startTime = System.nanoTime();
        System.out.println(hs);
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet1000).clone();
        startTime = System.nanoTime();
        System.out.println(ts);
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet1000).clone();
        startTime = System.nanoTime();
        System.out.println(lhs);
        stopTime = System.nanoTime();
        time[5][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet1000).clone();

        return time;
    }

    public static long[][] researchSet10000() {
        long[][] time = new long[6][3];
        long startTime;
        long stopTime;
        Set<Sample> hashSet10000 = new HashSet<>();
        Set<Sample> treeSet10000 = new TreeSet<>();
        Set<Sample> linkedHashSet10000 = new LinkedHashSet<>();
        for (int i = 0; i < 10000; i++) {
            hashSet10000.add(new Sample());
            treeSet10000.add(new Sample());
            linkedHashSet10000.add(new Sample());
        }
        Set<Sample> hs = (HashSet) ((HashSet<Sample>) hashSet10000).clone();
        Set<Sample> ts = (TreeSet) ((TreeSet<Sample>) treeSet10000).clone();
        Set<Sample> lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10000).clone();

        //Добавление элемента
        startTime = System.nanoTime();
        hs.add(new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10000).clone();
        startTime = System.nanoTime();
        ts.add(new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10000).clone();
        startTime = System.nanoTime();
        lhs.add(new Sample());
        stopTime = System.nanoTime();
        time[0][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10000).clone();

        //Добавление коллекции
        ArrayList<Sample> collection = new ArrayList<>();
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        collection.add(new Sample());
        startTime = System.nanoTime();
        hs.addAll(collection);
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10000).clone();
        startTime = System.nanoTime();
        ts.addAll(collection);
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10000).clone();
        startTime = System.nanoTime();
        lhs.addAll(collection);
        stopTime = System.nanoTime();
        time[1][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10000).clone();

        //Проверка наличия элемента
        startTime = System.nanoTime();
        hs.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10000).clone();
        startTime = System.nanoTime();
        ts.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10000).clone();
        startTime = System.nanoTime();
        lhs.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10000).clone();

        //Удаление элемента по значению
        startTime = System.nanoTime();
        hs.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10000).clone();
        startTime = System.nanoTime();
        ts.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10000).clone();
        startTime = System.nanoTime();
        lhs.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10000).clone();

        //Удаление коллекции элементов
        startTime = System.nanoTime();
        hs.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10000).clone();
        startTime = System.nanoTime();
        ts.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10000).clone();
        startTime = System.nanoTime();
        lhs.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10000).clone();

        //Вывод на экран
        startTime = System.nanoTime();
        System.out.println(hs);
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet10000).clone();
        startTime = System.nanoTime();
        System.out.println(ts);
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet10000).clone();
        startTime = System.nanoTime();
        System.out.println(lhs);
        stopTime = System.nanoTime();
        time[5][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet10000).clone();

        return time;
    }

    public static long[][] researchMap10() {
        long[][] time = new long[8][3];
        long startTime;
        long stopTime;
        Map<String, Sample> hashMap10 = new HashMap<>();
        Map<String, Sample> treeMap10 = new TreeMap<>();
        Map<String, Sample> linkedHashMap10 = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap10.put("k" + i, new Sample());
            treeMap10.put("k" + i, new Sample());
            linkedHashMap10.put("k" + i, new Sample());
        }
        Map<String, Sample> hm = (HashMap) ((HashMap<String, Sample>) hashMap10).clone();
        Map<String, Sample> tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10).clone();
        Map<String, Sample> lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10).clone();

        //Добавление элемента
        startTime = System.nanoTime();
        hm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10).clone();
        startTime = System.nanoTime();
        tm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10).clone();
        startTime = System.nanoTime();
        lhm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10).clone();

        //Получение пар ключ-значение
        startTime = System.nanoTime();
        hm.entrySet();
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10).clone();
        startTime = System.nanoTime();
        tm.entrySet();
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10).clone();
        startTime = System.nanoTime();
        lhm.entrySet();
        stopTime = System.nanoTime();
        time[1][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10).clone();

        //Получение значения по ключу
        startTime = System.nanoTime();
        hm.get("k5");
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10).clone();
        startTime = System.nanoTime();
        tm.get("k5");
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10).clone();
        startTime = System.nanoTime();
        lhm.get("k5");
        stopTime = System.nanoTime();
        time[2][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10).clone();

        //Проверка наличия ключа
        startTime = System.nanoTime();
        hm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10).clone();
        startTime = System.nanoTime();
        tm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10).clone();
        startTime = System.nanoTime();
        lhm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10).clone();

        //Проверка наличия значения
        startTime = System.nanoTime();
        hm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10).clone();
        startTime = System.nanoTime();
        tm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10).clone();
        startTime = System.nanoTime();
        lhm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10).clone();

        //Удаление по ключу
        startTime = System.nanoTime();
        hm.remove("k5");
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10).clone();
        startTime = System.nanoTime();
        tm.remove("k5");
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10).clone();
        startTime = System.nanoTime();
        lhm.remove("k5");
        stopTime = System.nanoTime();
        time[5][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10).clone();

        //Получение ключей
        startTime = System.nanoTime();
        hm.keySet();
        stopTime = System.nanoTime();
        time[6][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10).clone();
        startTime = System.nanoTime();
        tm.keySet();
        stopTime = System.nanoTime();
        time[6][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10).clone();
        startTime = System.nanoTime();
        lhm.keySet();
        stopTime = System.nanoTime();
        time[6][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10).clone();

        //Получение значений
        startTime = System.nanoTime();
        hm.values();
        stopTime = System.nanoTime();
        time[7][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10).clone();
        startTime = System.nanoTime();
        tm.values();
        stopTime = System.nanoTime();
        time[7][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10).clone();
        startTime = System.nanoTime();
        lhm.values();
        stopTime = System.nanoTime();
        time[7][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10).clone();

        return time;
    }

    public static long[][] researchMap100() {
        long[][] time = new long[8][3];
        long startTime;
        long stopTime;
        Map<String, Sample> hashMap100 = new HashMap<>();
        Map<String, Sample> treeMap100 = new TreeMap<>();
        Map<String, Sample> linkedHashMap100 = new LinkedHashMap<>();
        for (int i = 0; i < 100; i++) {
            hashMap100.put("k" + i, new Sample());
            treeMap100.put("k" + i, new Sample());
            linkedHashMap100.put("k" + i, new Sample());
        }
        Map<String, Sample> hm = (HashMap) ((HashMap<String, Sample>) hashMap100).clone();
        Map<String, Sample> tm = (TreeMap) ((TreeMap<String, Sample>) treeMap100).clone();
        Map<String, Sample> lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap100).clone();

        //Добавление элемента
        startTime = System.nanoTime();
        hm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap100).clone();
        startTime = System.nanoTime();
        tm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap100).clone();
        startTime = System.nanoTime();
        lhm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap100).clone();

        //Получение пар ключ-значение
        startTime = System.nanoTime();
        hm.entrySet();
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap100).clone();
        startTime = System.nanoTime();
        tm.entrySet();
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap100).clone();
        startTime = System.nanoTime();
        lhm.entrySet();
        stopTime = System.nanoTime();
        time[1][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap100).clone();

        //Получение значения по ключу
        startTime = System.nanoTime();
        hm.get("k5");
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap100).clone();
        startTime = System.nanoTime();
        tm.get("k5");
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap100).clone();
        startTime = System.nanoTime();
        lhm.get("k5");
        stopTime = System.nanoTime();
        time[2][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap100).clone();

        //Проверка наличия ключа
        startTime = System.nanoTime();
        hm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap100).clone();
        startTime = System.nanoTime();
        tm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap100).clone();
        startTime = System.nanoTime();
        lhm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap100).clone();

        //Проверка наличия значения
        startTime = System.nanoTime();
        hm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap100).clone();
        startTime = System.nanoTime();
        tm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap100).clone();
        startTime = System.nanoTime();
        lhm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap100).clone();

        //Удаление по ключу
        startTime = System.nanoTime();
        hm.remove("k5");
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap100).clone();
        startTime = System.nanoTime();
        tm.remove("k5");
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap100).clone();
        startTime = System.nanoTime();
        lhm.remove("k5");
        stopTime = System.nanoTime();
        time[5][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap100).clone();

        //Получение ключей
        startTime = System.nanoTime();
        hm.keySet();
        stopTime = System.nanoTime();
        time[6][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap100).clone();
        startTime = System.nanoTime();
        tm.keySet();
        stopTime = System.nanoTime();
        time[6][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap100).clone();
        startTime = System.nanoTime();
        lhm.keySet();
        stopTime = System.nanoTime();
        time[6][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap100).clone();

        //Получение значений
        startTime = System.nanoTime();
        hm.values();
        stopTime = System.nanoTime();
        time[7][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap100).clone();
        startTime = System.nanoTime();
        tm.values();
        stopTime = System.nanoTime();
        time[7][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap100).clone();
        startTime = System.nanoTime();
        lhm.values();
        stopTime = System.nanoTime();
        time[7][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap100).clone();

        return time;
    }

    public static long[][] researchMap1000() {
        long[][] time = new long[8][3];
        long startTime;
        long stopTime;
        Map<String, Sample> hashMap1000 = new HashMap<>();
        Map<String, Sample> treeMap1000 = new TreeMap<>();
        Map<String, Sample> linkedHashMap1000 = new LinkedHashMap<>();
        for (int i = 0; i < 1000; i++) {
            hashMap1000.put("k" + i, new Sample());
            treeMap1000.put("k" + i, new Sample());
            linkedHashMap1000.put("k" + i, new Sample());
        }
        Map<String, Sample> hm = (HashMap) ((HashMap<String, Sample>) hashMap1000).clone();
        Map<String, Sample> tm = (TreeMap) ((TreeMap<String, Sample>) treeMap1000).clone();
        Map<String, Sample> lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap1000).clone();

        //Добавление элемента
        startTime = System.nanoTime();
        hm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap1000).clone();
        startTime = System.nanoTime();
        tm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap1000).clone();
        startTime = System.nanoTime();
        lhm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap1000).clone();

        //Получение пар ключ-значение
        startTime = System.nanoTime();
        hm.entrySet();
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap1000).clone();
        startTime = System.nanoTime();
        tm.entrySet();
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap1000).clone();
        startTime = System.nanoTime();
        lhm.entrySet();
        stopTime = System.nanoTime();
        time[1][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap1000).clone();

        //Получение значения по ключу
        startTime = System.nanoTime();
        hm.get("k5");
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap1000).clone();
        startTime = System.nanoTime();
        tm.get("k5");
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap1000).clone();
        startTime = System.nanoTime();
        lhm.get("k5");
        stopTime = System.nanoTime();
        time[2][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap1000).clone();

        //Проверка наличия ключа
        startTime = System.nanoTime();
        hm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap1000).clone();
        startTime = System.nanoTime();
        tm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap1000).clone();
        startTime = System.nanoTime();
        lhm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap1000).clone();

        //Проверка наличия значения
        startTime = System.nanoTime();
        hm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap1000).clone();
        startTime = System.nanoTime();
        tm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap1000).clone();
        startTime = System.nanoTime();
        lhm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap1000).clone();

        //Удаление по ключу
        startTime = System.nanoTime();
        hm.remove("k5");
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap1000).clone();
        startTime = System.nanoTime();
        tm.remove("k5");
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap1000).clone();
        startTime = System.nanoTime();
        lhm.remove("k5");
        stopTime = System.nanoTime();
        time[5][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap1000).clone();

        //Получение ключей
        startTime = System.nanoTime();
        hm.keySet();
        stopTime = System.nanoTime();
        time[6][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap1000).clone();
        startTime = System.nanoTime();
        tm.keySet();
        stopTime = System.nanoTime();
        time[6][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap1000).clone();
        startTime = System.nanoTime();
        lhm.keySet();
        stopTime = System.nanoTime();
        time[6][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap1000).clone();

        //Получение значений
        startTime = System.nanoTime();
        hm.values();
        stopTime = System.nanoTime();
        time[7][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap1000).clone();
        startTime = System.nanoTime();
        tm.values();
        stopTime = System.nanoTime();
        time[7][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap1000).clone();
        startTime = System.nanoTime();
        lhm.values();
        stopTime = System.nanoTime();
        time[7][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap1000).clone();

        return time;
    }

    public static long[][] researchMap10000() {
        long[][] time = new long[8][3];
        long startTime;
        long stopTime;
        Map<String, Sample> hashMap10000 = new HashMap<>();
        Map<String, Sample> treeMap10000 = new TreeMap<>();
        Map<String, Sample> linkedHashMap10000 = new LinkedHashMap<>();
        for (int i = 0; i < 10000; i++) {
            hashMap10000.put("k" + i, new Sample());
            treeMap10000.put("k" + i, new Sample());
            linkedHashMap10000.put("k" + i, new Sample());
        }
        Map<String, Sample> hm = (HashMap) ((HashMap<String, Sample>) hashMap10000).clone();
        Map<String, Sample> tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10000).clone();
        Map<String, Sample> lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10000).clone();

        //Добавление элемента
        startTime = System.nanoTime();
        hm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10000).clone();
        startTime = System.nanoTime();
        tm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10000).clone();
        startTime = System.nanoTime();
        lhm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10000).clone();

        //Получение пар ключ-значение
        startTime = System.nanoTime();
        hm.entrySet();
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10000).clone();
        startTime = System.nanoTime();
        tm.entrySet();
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10000).clone();
        startTime = System.nanoTime();
        lhm.entrySet();
        stopTime = System.nanoTime();
        time[1][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10000).clone();

        //Получение значения по ключу
        startTime = System.nanoTime();
        hm.get("k5");
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10000).clone();
        startTime = System.nanoTime();
        tm.get("k5");
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10000).clone();
        startTime = System.nanoTime();
        lhm.get("k5");
        stopTime = System.nanoTime();
        time[2][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10000).clone();

        //Проверка наличия ключа
        startTime = System.nanoTime();
        hm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10000).clone();
        startTime = System.nanoTime();
        tm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10000).clone();
        startTime = System.nanoTime();
        lhm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10000).clone();

        //Проверка наличия значения
        startTime = System.nanoTime();
        hm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10000).clone();
        startTime = System.nanoTime();
        tm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10000).clone();
        startTime = System.nanoTime();
        lhm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10000).clone();

        //Удаление по ключу
        startTime = System.nanoTime();
        hm.remove("k5");
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10000).clone();
        startTime = System.nanoTime();
        tm.remove("k5");
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10000).clone();
        startTime = System.nanoTime();
        lhm.remove("k5");
        stopTime = System.nanoTime();
        time[5][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10000).clone();

        //Получение ключей
        startTime = System.nanoTime();
        hm.keySet();
        stopTime = System.nanoTime();
        time[6][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10000).clone();
        startTime = System.nanoTime();
        tm.keySet();
        stopTime = System.nanoTime();
        time[6][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10000).clone();
        startTime = System.nanoTime();
        lhm.keySet();
        stopTime = System.nanoTime();
        time[6][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10000).clone();

        //Получение значений
        startTime = System.nanoTime();
        hm.values();
        stopTime = System.nanoTime();
        time[7][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap10000).clone();
        startTime = System.nanoTime();
        tm.values();
        stopTime = System.nanoTime();
        time[7][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap10000).clone();
        startTime = System.nanoTime();
        lhm.values();
        stopTime = System.nanoTime();
        time[7][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap10000).clone();

        return time;
    }
}

class Sample implements Comparable<Sample> {
    private int id;

    public Sample() {
        this.id = this.hashCode();      //Уникальный ID из hashCode объекта класса
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id: " + id;
    }

    @Override
    public int compareTo(Sample sample) {        //Для сортировки
        return this.id > sample.getId() ? 1 : this.id == sample.getId() ? 0 : -1;   //Люблю тернарные операторы
    }
}
