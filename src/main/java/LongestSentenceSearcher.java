public class LongestSentenceSearcher {
    public static int longestSentenceSize(String text){
        return wordsCounter(textSplitter(text));
    }

    private static String[] textSplitter(String firstText){
        String[] a = firstText.split("[!?.]+");
        return a;
    }

    private static int wordsCounter(String[] sentences){
        String[] wordsOfSentence;
        int wordsAmount = 0;
        for (String a: sentences) {
            wordsOfSentence = a.trim().split("\\s+");
            if(wordsOfSentence.length > wordsAmount) wordsAmount = wordsOfSentence.length;
        }
        return wordsAmount;
    }
}
