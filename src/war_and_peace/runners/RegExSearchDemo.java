package war_and_peace.runners;

import war_and_peace.api.ISearchEngine;
import war_and_peace.searchers.RegExSearch;
import war_and_peace.text_processors.WholeTextFileToStringConverter;

import java.io.File;

public class RegExSearchDemo {
    public static void main(String[] args) {
        File text = new File("HomeWork\\War_and_peace_book.txt");
        WholeTextFileToStringConverter converter = new WholeTextFileToStringConverter();
        ISearchEngine searcher = new RegExSearch();

        String strText = converter.convert(text);
        String word = "Анна";
        System.out.println("Слово " + "'" + word + "'" + " встретилось " + searcher.search(strText, word) + " раз(а)");
    }
}
