package Analyzer;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class AnalyzerPeaks implements Runnable {
    @Override
    public void run() {
        synchronized (Main.frequency) {
            if (Main.frequency.isEmpty()) {
                System.out.println("Map is empty! Sorry...");
            } else {
                int i = 0;
                Map<Character, Integer> tempMap = (LinkedHashMap) ((LinkedHashMap<Character, Integer>) Main.frequency).clone();     //Временный Map т.к. происходят изменения
                System.out.println("Minimum:");
                while (i < 3) {     //Ищем минимумы
                    int min = Collections.min(tempMap.values());
                    for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
                        if (entry.getValue() == min) {
                            System.out.println(entry);
                            entry.setValue(Integer.MAX_VALUE);
                            if (++i == 3) {
                                break;
                            }
                        }
                    }
                }
                i = 0;
                tempMap = (LinkedHashMap) ((LinkedHashMap<Character, Integer>) Main.frequency).clone();     //Временный Map т.к. происходят изменения
                System.out.println("Maximum:");
                while (i < 3) {     //Ищем максимумы
                    int max = Collections.max(tempMap.values());
                    for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
                        if (entry.getValue() == max) {
                            System.out.println(entry);
                            entry.setValue(Integer.MIN_VALUE);
                            if (++i == 3) {
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println("Working with document is done!");
        }
    }
}
