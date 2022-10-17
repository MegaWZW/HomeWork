package war_and_peace.runners;

import war_and_peace.text_processors.UniqueWordCounter;

import java.io.File;

public class WordCounterDemo {
    public static void main(String[] args) {
        File file = new File("HomeWork\\War_and_peace_book.txt");

        UniqueWordCounter counter = new UniqueWordCounter();
        System.out.println(counter.countMostFrequentWords(file, 100));
    }
}
