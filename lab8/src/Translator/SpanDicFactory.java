package Translator;

public class SpanDicFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new SpanishDictionary();
    }
}
