package Translator;

import java.util.HashMap;
import java.util.Map;

public class GermanDictionary implements Dictionary {
    Map<String, String> vocabulary = new HashMap<String, String>();     //Аналог словаря в python
    final private String language = "german";

    public GermanDictionary() {
        vocabulary.put("Ich", "я");
        vocabulary.put("gern", "нравится");
        vocabulary.put("programmiere", "программировать");
        vocabulary.put("in", "на");
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
