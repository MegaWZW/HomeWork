package war_and_peace.runners;

import war_and_peace.text_processors.UniqueWordsFromFileExtractor;

import java.io.File;
import java.util.Arrays;
import java.util.Set;

public class UniqueWordsDemo {
    public static void main(String[] args) {
        File file = new File("HomeWork\\War_and_peace_book.txt");

        UniqueWordsFromFileExtractor extractor = new UniqueWordsFromFileExtractor();

        Set<String> words = extractor.extract(file);
        System.out.println("Количество использованных слов: " + words.size());
        System.out.println(Arrays.toString(words.toArray()));

    }
}
