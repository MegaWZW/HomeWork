package war_and_peace.text_processors;

import war_and_peace.api.IUniqueWordsExtractor;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordsFromFileExtractor implements IUniqueWordsExtractor<File> {
    private Set<String> uniqueWords = new HashSet<>();
    WholeTextFileToStringConverter converter = new WholeTextFileToStringConverter();

    @Override
    public Set<String> extract(File text) {
        String[] splitted = converter.convert(text).split("[^A-Za-zА-Яа-я0-9Ёё\\-]|-{2,}");
        for (String item : splitted) {
            if(item != null && !item.equals("") && !item.equals("-")){
                uniqueWords.add(item);
            }
        }
        return uniqueWords;
    }


}
