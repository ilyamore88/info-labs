package Analyzer;

import java.util.*;

public class AnalyzerFrequency implements Runnable {
    String document;

    public AnalyzerFrequency(String document) {
        this.document = document;
    }

    @Override
    public void run() {
        synchronized (Main.frequency) {
            for (int i = 0; i < document.length(); i++) {
                Integer count = Main.frequency.get(document.charAt(i));
                if (count == null) {
                    Main.frequency.put(document.charAt(i), 1);  //Если символа нет в словаре, то добавляем
                } else {
                    Main.frequency.put(document.charAt(i), ++count);    //Если символ есть в словаре, то увеличиваем кол-во на 1
                }
            }
            System.out.println("Getting frequency is done!");
        }
    }
}
