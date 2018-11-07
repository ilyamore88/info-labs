package Translator;

public class GerDicFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new GermanDictionary();
    }
}
