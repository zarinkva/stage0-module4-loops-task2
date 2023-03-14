package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phraseBuilder = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
           phraseBuilder.append(chars[i]);
            i++;
        }
       String phrase = phraseBuilder.toString();
        System.out.print(phrase);
    }

    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        wordsBuilder.buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');
    }
}
