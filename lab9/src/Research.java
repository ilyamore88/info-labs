import java.util.*;

import static java.lang.Math.pow;

//Я ненавижу себя за эту программу. Простите.
public class Research {
    public static void main(String[] args) {
        long[][][] timeList = new long[4][12][2];
        long[][][] timeSet = new long[4][6][3];
        long[][][] timeMap = new long[4][8][3];

        //Инициализация и изучение времени работы методов
        for (int i = 0; i < 4; i++) {
            List<Sample> sampleArrayList = new ArrayList<>();
            List<Sample> sampleLinkedList = new LinkedList<>();
            Set<Sample> hashSet = new HashSet<>();
            Set<Sample> treeSet = new TreeSet<>();
            Set<Sample> linkedHashSet = new LinkedHashSet<>();
            Map<String, Sample> hashMap = new HashMap<>();
            Map<String, Sample> treeMap = new TreeMap<>();
            Map<String, Sample> linkedHashMap = new LinkedHashMap<>();
            for (int j = 0; j < pow(10, i + 1); j++) {     //Заполнение элементами
                sampleArrayList.add(new Sample());
                sampleLinkedList.add(new Sample());
                hashSet.add(new Sample());
                treeSet.add(new Sample());
                linkedHashSet.add(new Sample());
                hashMap.put("k" + i, new Sample());
                treeMap.put("k" + i, new Sample());
                linkedHashMap.put("k" + i, new Sample());
            }
            timeList[i] = researchList(sampleArrayList, sampleLinkedList);
            timeSet[i] = researchSet(hashSet, treeSet, linkedHashSet);
            timeMap[i] = researchMap(hashMap, treeMap, linkedHashMap);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.println(pow(10, i + 1) + " elements ArrayList: .add(new Sample()): " + timeList[i][0][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: .add(new Sample()): " + timeList[i][0][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements ArrayList: .add(sal.size() / 2, new Sample()): " + timeList[i][1][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: .add(4, new Sample()): " + timeList[i][1][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements ArrayList: .get(0): " + timeList[i][2][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: .get(0): " + timeList[i][2][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements ArrayList: .get(sal.size() / 2): " + timeList[i][3][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: .get(sll.size() / 2): " + timeList[i][3][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements ArrayList: .get(sal.size() - 1): " + timeList[i][4][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: .get(sll.size() - 1): " + timeList[i][4][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements ArrayList: .contains(new Sample()): " + timeList[i][5][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: .contains(new Sample()): " + timeList[i][5][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements ArrayList: System.out.println(sal): " + timeList[i][6][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: System.out.println(sll): " + timeList[i][6][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements ArrayList: .remove(sal.get(2)): " + timeList[i][7][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: .remove(sll.get(2)): " + timeList[i][7][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements ArrayList: .removeAll(sal.subList(3, 7)): " + timeList[i][8][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: .removeAll(sll.subList(3, 7)): " + timeList[i][8][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements ArrayList: .remove(0): " + timeList[i][9][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: .remove(0): " + timeList[i][9][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements ArrayList: .remove(sal.size() / 2): " + timeList[i][10][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: .remove(sll.size() / 2): " + timeList[i][10][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements ArrayList: .remove(sal.size() - 1): " + timeList[i][11][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedList: .remove(sll.size() - 1): " + timeList[i][11][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashSet: .add(new Sample()): " + timeSet[i][0][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeSet: .add(new Sample()): " + timeSet[i][0][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashSet: .add(new Sample()): " + timeSet[i][0][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashSet: .addAll(collection): " + timeSet[i][1][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeSet: .addAll(collection): " + timeSet[i][1][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashSet: .addAll(collection): " + timeSet[i][1][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashSet: .contains(new Sample()): " + timeSet[i][2][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeSet: .contains(new Sample()): " + timeSet[i][2][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashSet: .contains(new Sample()): " + timeSet[i][2][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashSet: .remove(new Sample()): " + timeSet[i][3][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeSet: .remove(new Sample()): " + timeSet[i][3][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashSet: .remove(new Sample()): " + timeSet[i][3][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashSet: .removeAll(collection): " + timeSet[i][4][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeSet: .removeAll(collection): " + timeSet[i][4][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashSet: .removeAll(collection): " + timeSet[i][4][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashSet: System.out.println(hs): " + timeSet[i][5][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeSet: System.out.println(ts): " + timeSet[i][5][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashSet: System.out.println(lhs): " + timeSet[i][5][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashMap: .put(\"k10\", new Sample()): " + timeMap[i][0][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeMap: .put(\"k10\", new Sample()): " + timeMap[i][0][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashMap: .put(\"k10\", new Sample()): " + timeMap[i][0][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashMap: .entrySet(): " + timeMap[i][1][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeMap: .entrySet(): " + timeMap[i][1][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashMap: .entrySet(): " + timeMap[i][1][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashMap: .get(\"k5\"): " + timeMap[i][2][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeMap: .get(\"k5\"): " + timeMap[i][2][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashMap: .get(\"k5\"): " + timeMap[i][2][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashMap: .containsKey(\"k5\"): " + timeMap[i][3][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeMap: .containsKey(\"k5\"): " + timeMap[i][3][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashMap: .containsKey(\"k5\"): " + timeMap[i][3][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashMap: .containsValue(new Sample()): " + timeMap[i][4][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeMap: .containsValue(new Sample()): " + timeMap[i][4][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashMap: .containsValue(new Sample()): " + timeMap[i][4][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashMap: .remove(\"k5\"): " + timeMap[i][5][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeMap: .remove(\"k5\"): " + timeMap[i][5][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashMap: .remove(\"k5\"): " + timeMap[i][5][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashMap: .keySet(): " + timeMap[i][6][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeMap: .keySet(): " + timeMap[i][6][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashMap: .keySet(): " + timeMap[i][6][2] + " нс");
            System.out.println(pow(10, i + 1) + " elements HashMap: .values(): " + timeMap[i][7][0] + " нс");
            System.out.println(pow(10, i + 1) + " elements TreeMap: .values(): " + timeMap[i][7][1] + " нс");
            System.out.println(pow(10, i + 1) + " elements LinkedHashMap: .values(): " + timeMap[i][7][2] + " нс");
        }

    }

    public static long[][] researchList(List<Sample> sampleArrayList, List<Sample> sampleLinkedList) {
        long[][] time = new long[12][2];
        long startTime;
        long stopTime;

        List<Sample> sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        List<Sample> sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();
        //Вставка в конец
        startTime = System.nanoTime();      //Для большей точности я использовал наносекунды. Если хотите выполнять по заданию, то замените на System.currentTimeMillis();
        sal.add(new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        startTime = System.nanoTime();
        sll.add(new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        //Вставка в середину
        startTime = System.nanoTime();
        sal.add(sal.size() / 2, new Sample());
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        startTime = System.nanoTime();
        sll.add(sll.size() / 2, new Sample());
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        //Получение первого элемента
        startTime = System.nanoTime();
        sal.get(0);
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        startTime = System.nanoTime();
        sll.get(0);
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        //Получение элемента из центра
        startTime = System.nanoTime();
        sal.get(sal.size() / 2);
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        startTime = System.nanoTime();
        sll.get(sll.size() / 2);
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        //Получение последнего элемента
        startTime = System.nanoTime();
        sal.get(sal.size() - 1);
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        startTime = System.nanoTime();
        sll.get(sll.size() - 1);
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        //Проверка наличия элемента
        startTime = System.nanoTime();
        sal.contains(new Sample());
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        startTime = System.nanoTime();
        sll.contains(new Sample());
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        //Вывод на экран
        startTime = System.nanoTime();
        System.out.println(sal);
        stopTime = System.nanoTime();
        time[6][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        startTime = System.nanoTime();
        System.out.println(sll);
        stopTime = System.nanoTime();
        time[6][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        //Удаление по значению
        startTime = System.nanoTime();
        sal.remove(sal.get(2));
        stopTime = System.nanoTime();
        time[7][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        startTime = System.nanoTime();
        sll.remove(sll.get(2));
        stopTime = System.nanoTime();
        time[7][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        //Удаление коллекции
        startTime = System.nanoTime();
        sal.removeAll(sal.subList(3, 7));
        stopTime = System.nanoTime();
        time[8][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        List sllTemp = (LinkedList) ((LinkedList<Sample>) sll).clone();
        startTime = System.nanoTime();
        sllTemp.removeAll(sll.subList(3, 7));
        stopTime = System.nanoTime();
        time[8][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        //Удаление первого элемента
        startTime = System.nanoTime();
        sal.remove(0);
        stopTime = System.nanoTime();
        time[9][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        startTime = System.nanoTime();
        sll.remove(0);
        stopTime = System.nanoTime();
        time[9][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        //Удаление из середины
        startTime = System.nanoTime();
        sal.remove(sal.size() / 2);
        stopTime = System.nanoTime();
        time[10][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        startTime = System.nanoTime();
        sll.remove(sll.size() / 2);
        stopTime = System.nanoTime();
        time[10][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        //Удаление последнего элемента
        startTime = System.nanoTime();
        sal.remove(sal.size() - 1);
        stopTime = System.nanoTime();
        time[11][0] = stopTime - startTime;
        sal = (ArrayList) ((ArrayList<Sample>) sampleArrayList).clone();
        startTime = System.nanoTime();
        sll.remove(sll.size() - 1);
        stopTime = System.nanoTime();
        time[11][1] = stopTime - startTime;
        sll = (LinkedList) ((LinkedList<Sample>) sampleLinkedList).clone();

        return time;
    }

    public static long[][] researchSet(Set<Sample> hashSet, Set<Sample> treeSet, Set<Sample> linkedHashSet) {
        long[][] time = new long[6][3];
        long startTime;
        long stopTime;
        Set<Sample> hs = (HashSet) ((HashSet<Sample>) hashSet).clone();
        Set<Sample> ts = (TreeSet) ((TreeSet<Sample>) treeSet).clone();
        Set<Sample> lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet).clone();

        //Добавление элемента
        startTime = System.nanoTime();
        hs.add(new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet).clone();
        startTime = System.nanoTime();
        ts.add(new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet).clone();
        startTime = System.nanoTime();
        lhs.add(new Sample());
        stopTime = System.nanoTime();
        time[0][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet).clone();

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
        hs = (HashSet) ((HashSet<Sample>) hashSet).clone();
        startTime = System.nanoTime();
        ts.addAll(collection);
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet).clone();
        startTime = System.nanoTime();
        lhs.addAll(collection);
        stopTime = System.nanoTime();
        time[1][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet).clone();

        //Проверка наличия элемента
        startTime = System.nanoTime();
        hs.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet).clone();
        startTime = System.nanoTime();
        ts.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet).clone();
        startTime = System.nanoTime();
        lhs.contains(new Sample());
        stopTime = System.nanoTime();
        time[2][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet).clone();

        //Удаление элемента по значению
        startTime = System.nanoTime();
        hs.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet).clone();
        startTime = System.nanoTime();
        ts.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet).clone();
        startTime = System.nanoTime();
        lhs.remove(new Sample());
        stopTime = System.nanoTime();
        time[3][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet).clone();

        //Удаление коллекции элементов
        startTime = System.nanoTime();
        hs.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet).clone();
        startTime = System.nanoTime();
        ts.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet).clone();
        startTime = System.nanoTime();
        lhs.removeAll(collection);
        stopTime = System.nanoTime();
        time[4][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet).clone();

        //Вывод на экран
        startTime = System.nanoTime();
        System.out.println(hs);
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        hs = (HashSet) ((HashSet<Sample>) hashSet).clone();
        startTime = System.nanoTime();
        System.out.println(ts);
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        ts = (TreeSet) ((TreeSet<Sample>) treeSet).clone();
        startTime = System.nanoTime();
        System.out.println(lhs);
        stopTime = System.nanoTime();
        time[5][2] = stopTime - startTime;
        lhs = (LinkedHashSet) ((LinkedHashSet<Sample>) linkedHashSet).clone();

        return time;
    }

    public static long[][] researchMap(Map<String, Sample> hashMap, Map<String, Sample> treeMap, Map<String, Sample> linkedHashMap) {
        long[][] time = new long[8][3];
        long startTime;
        long stopTime;
        Map<String, Sample> hm = (HashMap) ((HashMap<String, Sample>) hashMap).clone();
        Map<String, Sample> tm = (TreeMap) ((TreeMap<String, Sample>) treeMap).clone();
        Map<String, Sample> lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap).clone();

        //Добавление элемента
        startTime = System.nanoTime();
        hm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap).clone();
        startTime = System.nanoTime();
        tm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap).clone();
        startTime = System.nanoTime();
        lhm.put("k10", new Sample());
        stopTime = System.nanoTime();
        time[0][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap).clone();

        //Получение пар ключ-значение
        startTime = System.nanoTime();
        hm.entrySet();
        stopTime = System.nanoTime();
        time[1][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap).clone();
        startTime = System.nanoTime();
        tm.entrySet();
        stopTime = System.nanoTime();
        time[1][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap).clone();
        startTime = System.nanoTime();
        lhm.entrySet();
        stopTime = System.nanoTime();
        time[1][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap).clone();

        //Получение значения по ключу
        startTime = System.nanoTime();
        hm.get("k5");
        stopTime = System.nanoTime();
        time[2][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap).clone();
        startTime = System.nanoTime();
        tm.get("k5");
        stopTime = System.nanoTime();
        time[2][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap).clone();
        startTime = System.nanoTime();
        lhm.get("k5");
        stopTime = System.nanoTime();
        time[2][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap).clone();

        //Проверка наличия ключа
        startTime = System.nanoTime();
        hm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap).clone();
        startTime = System.nanoTime();
        tm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap).clone();
        startTime = System.nanoTime();
        lhm.containsKey("k5");
        stopTime = System.nanoTime();
        time[3][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap).clone();

        //Проверка наличия значения
        startTime = System.nanoTime();
        hm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap).clone();
        startTime = System.nanoTime();
        tm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap).clone();
        startTime = System.nanoTime();
        lhm.containsValue(new Sample());
        stopTime = System.nanoTime();
        time[4][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap).clone();

        //Удаление по ключу
        startTime = System.nanoTime();
        hm.remove("k5");
        stopTime = System.nanoTime();
        time[5][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap).clone();
        startTime = System.nanoTime();
        tm.remove("k5");
        stopTime = System.nanoTime();
        time[5][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap).clone();
        startTime = System.nanoTime();
        lhm.remove("k5");
        stopTime = System.nanoTime();
        time[5][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap).clone();

        //Получение ключей
        startTime = System.nanoTime();
        hm.keySet();
        stopTime = System.nanoTime();
        time[6][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap).clone();
        startTime = System.nanoTime();
        tm.keySet();
        stopTime = System.nanoTime();
        time[6][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap).clone();
        startTime = System.nanoTime();
        lhm.keySet();
        stopTime = System.nanoTime();
        time[6][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap).clone();

        //Получение значений
        startTime = System.nanoTime();
        hm.values();
        stopTime = System.nanoTime();
        time[7][0] = stopTime - startTime;
        hm = (HashMap) ((HashMap<String, Sample>) hashMap).clone();
        startTime = System.nanoTime();
        tm.values();
        stopTime = System.nanoTime();
        time[7][1] = stopTime - startTime;
        tm = (TreeMap) ((TreeMap<String, Sample>) treeMap).clone();
        startTime = System.nanoTime();
        lhm.values();
        stopTime = System.nanoTime();
        time[7][2] = stopTime - startTime;
        lhm = (LinkedHashMap) ((LinkedHashMap<String, Sample>) linkedHashMap).clone();

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
