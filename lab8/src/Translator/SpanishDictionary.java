package Translator;

import java.util.HashMap;
import java.util.Map;

public class SpanishDictionary implements Dictionary {
    Map<String, String> vocabulary = new HashMap<String, String>();     //Аналог словаря в python
    final private String language = "spain";

    public SpanishDictionary() {
        vocabulary.put("Me", "я");
        vocabulary.put("gusta", "нравится");
        vocabulary.put("programar", "программировать");
        vocabulary.put("en", "на");
    }

    @Override
    public boolean findWord(String word) {
        if (vocabulary.containsKey(word)) {
            System.out.println("Find word in " + language + " dict");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addWord(String word, String translate) {
        vocabulary.put(word, translate);
    }

    @Override
    public void removeWord(String word) {
        vocabulary.remove(word);
    }

    @Override
    public String getTranslate(String word) {
        return vocabulary.get(word);
    }
}
