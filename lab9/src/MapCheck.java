import java.util.*;

public class MapCheck {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();            //Инициализация списка. Т.к. мы должны использовать деревянный Calender
        calendar.set(2001, Calendar.AUGUST, 8);     //то всё так ужасно выглядит
        students.add(new Person("Morozov", "Ilya", "Olegovich", calendar));
        calendar = (Calendar) calendar.clone();                //Если не создавать копию Calendar, то каждый раз мы будем ссылаться на один и тот же объект
        calendar.set(2000, Calendar.APRIL, 14);
        students.add(new Person("Portnova", "Maria", "Nikolayevna", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2001, Calendar.JANUARY, 16);
        students.add(new Person("Naumova", "Elena", "Nikolayevna", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2005, Calendar.AUGUST, 8);
        students.add(new Person("Portnov", "Stepan", "Nikolayevich", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2005, Calendar.OCTOBER, 23);
        students.add(new Person("Lukinov", "Maxim", "Semenovich", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2005, Calendar.DECEMBER, 12);
        students.add(new Person("Kagopol", "Ivan", "Igorevich", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2001, Calendar.JUNE, 19);
        students.add(new Person("Pirojkov", "Irina", "Olegovna", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2000, Calendar.JANUARY, 4);
        students.add(new Person("Apapayev", "Eduard", "Albertovich", calendar));
        calendar = (Calendar) calendar.clone();
        calendar.set(2000, Calendar.FEBRUARY, 1);
        students.add(new Person("Vasutina", "Elena", "Alexeevna", calendar));

        Map<Integer, ArrayList<Person>> hashMap = new HashMap<>();
        Map<Integer, ArrayList<Person>> treeMap = new TreeMap<>();
        Map<Integer, ArrayList<Person>> linkedHashMap = new LinkedHashMap<>();

        hashMap = setMap(students, hashMap);
        treeMap = setMap(students, treeMap);
        linkedHashMap = setMap(students, linkedHashMap);

        compareMap(hashMap, treeMap, linkedHashMap);
    }

    public static Map setMap(List<Person> personList, Map<Integer, ArrayList<Person>> personMap) {
        for (Person person : personList) {
            int year = person.getBirthday().get(Calendar.YEAR);
            if (personMap.containsKey(year)) {
                ArrayList<Person> people = personMap.get(year);
                people.add(person);
                personMap.put(year, people);
            } else {
                ArrayList<Person> people = new ArrayList<>();
                people.add(person);
                personMap.put(year, people);
            }
        }
        return personMap;
    }

    public static void compareMap(Map<Integer, ArrayList<Person>> hashMap, Map<Integer, ArrayList<Person>> treeMap, Map<Integer, ArrayList<Person>> linkedHashMap) {
        System.out.println("HashMap\t\t\t\t| TreeMap\t\t\t| LinkedHashMap");
        ArrayList<ArrayList<Person>> hashArray = new ArrayList(hashMap.values());       //Получаем массивы со значениями Map (другой способ лень придумывать (час ночи (1:22)))
        ArrayList<ArrayList<Person>> treeArray = new ArrayList(treeMap.values());
        ArrayList<ArrayList<Person>> linkedHashArray = new ArrayList(linkedHashMap.values());
        for (int i = 0; i < hashArray.size(); i++) {
            for (int j = 0; j < hashArray.get(i).size(); j++) {
                System.out.println(hashArray.get(i).get(j).getFIO() + "\t\t| " + treeArray.get(i).get(j).getFIO() + "\t\t| " + linkedHashArray.get(i).get(j).getFIO());
            }
        }
    }
}
