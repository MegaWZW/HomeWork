package war_and_peace.runners;

import war_and_peace.api.ISearchEngine;
import war_and_peace.searchers.RegExSearch;
import war_and_peace.searchers.SearchEnginePunctuationNormalizer;
import war_and_peace.text_processors.WholeTextFileToStringConverter;

import java.io.File;

public class PunctuationNormalizerDemo {
    public static void main(String[] args) {
        File file = new File("HomeWork\\War_and_peace_book.txt");
        WholeTextFileToStringConverter converter = new WholeTextFileToStringConverter();
        ISearchEngine regExSearcher = new RegExSearch();
        ISearchEngine normalizer = new SearchEnginePunctuationNormalizer(regExSearcher);

        String strText = converter.convert(file);
        String word = "война";
        String word2 = " и ";
        String word3 = " мир ";
        System.out.println("Слово " + "'" + word + "'" + " встретилось " + normalizer.search(strText, word) + " раз(а)");
        System.out.println("Союз " + "'" + word2 + "'" + " встретился " + normalizer.search(strText, word2) + " раз(а)");
        System.out.println("Слово " + "'" + word3 + "'" + " встретилось " + normalizer.search(strText, word3) + " раз(а)");
    }
}
