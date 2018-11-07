package Translator;

public class Main {
    public static void main(String[] args) {
//        String document = "I like programming in Java";
        String document = "Ich programmiere gern in Java";
//        String document = "Me gusta programar en java";
        String language = "german";
        DictionaryFactory dictionaryFactory = createFactoryByLanguage(language);
        Dictionary dict = dictionaryFactory.getDictionary();
        System.out.println(translateDocument(document, dict));
    }

    private static String translateDocument(String document, Dictionary dict) {
        String[] words = document.split(" ");
        String translatedDocument = "";
        for (String word : words) {
            if (dict.findWord(word)) {
                translatedDocument += dict.getTranslate(word) + " ";
            } else {
                translatedDocument += word + " ";
            }
        }
        return translatedDocument;
    }

    private static DictionaryFactory createFactoryByLanguage(String language) {
        language = language.toLowerCase();
        switch (language) {
            case "english":
                return new EngDicFactory();
            case "german":
                return new GerDicFactory();
            case "spanish":
                return new SpanDicFactory();
            default:
                throw new RuntimeException("I don't know " + language + " language");
        }
    }


}
