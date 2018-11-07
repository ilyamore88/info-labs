package Translator;

public class EngDicFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new EnglishDictionary();
    }
}
