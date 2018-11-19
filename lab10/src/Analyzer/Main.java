package Analyzer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    volatile static Map<Character, Integer> frequency = new LinkedHashMap<>();
    static String document = "I'm Gonna fight 'em Off\n" +
            "A Seven Nation Army couldn't hold me back\n" +
            "They're Gonna Rip it off\n" +
            "Taking there Time right behind my back\n" +
            "\n" +
            "And I'm Talkin' to myself at night\n" +
            "because I can't forget\n" +
            "Back and forth through my mind\n" +
            "behind a cigarette\n" +
            "\n" +
            "And the message coming from my eye\n" +
            "says leave it alone\n" +
            "\n" +
            "Don't want to hear about it\n" +
            "Every single one's got a story to tell\n" +
            "Everyone Knows about it\n" +
            "From the Queen of England To the Hounds of Hell\n" +
            "\n" +
            "And if I catch ya commin back my way\n" +
            "I'm gonna Sell it to you\n" +
            "And that ain't what you want to hear\n" +
            "but that's what I'll do\n" +
            "\n" +
            "And the feelin' commin from my bones\n" +
            "says find a home\n" +
            "\n" +
            "I'm goin' to Witchita\n" +
            "Far from this opera for evermore\n" +
            "I'm gonna work the straw\n" +
            "Make the sweat drip out of every pore\n" +
            "\n" +
            "And I'm Bleedin, and I'm Bleeding, and I'm Bleedin,\n" +
            "Right before the Lord\n" +
            "All the words are gonna bleed from me\n" +
            "and I will sing no more\n" +
            "\n" +
            "And the stings commin from my blood\n" +
            "tell me go back home";

    public static void main(String[] args) {
        Thread analyzer = new Thread(new AnalyzerFrequency(document));
        Thread peaks = new Thread(new AnalyzerPeaks());
        analyzer.start();
        peaks.start();
    }
}
