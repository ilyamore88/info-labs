package Translator;

public interface Dictionary {
    boolean findWord(String word);

    void addWord(String word, String translate);

    void removeWord(String word);

    String getTranslate(String word);
}