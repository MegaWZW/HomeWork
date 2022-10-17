package war_and_peace.text_processors;

import war_and_peace.api.IConverter;

import java.io.File;
import java.util.*;

public class UniqueWordCounter {
    private Map<String, Integer> uniqueWords = new HashMap<>();
    private List<Map.Entry<String, Integer>> sortedWords;

    public List<Map.Entry<String, Integer>> countMostFrequentWords(File text, int n) {
        fillMap(text);
        sortedWords = new ArrayList<>(uniqueWords.entrySet());
        Collections.sort(sortedWords, (o1, o2) -> o2.getValue() - o1.getValue());
        List<Map.Entry<String, Integer>> toReturn = new ArrayList<>();
        for (int i = 0; i < n; i++){
            toReturn.add(sortedWords.get(i));
        }
        return toReturn;
    }

    private void fillMap(File text) {
        IConverter<File> converter = new WholeTextFileToStringConverter();
        String strText = converter.convert(text);
        String[] splittedText = strText.split("[^A-Za-zА-Яа-я0-9Ёё\\-]");
        for (String item : splittedText){
            if(item != null && !item.equals("") && !item.equals("--") && !item.equals("-")){
                if (!this.uniqueWords.containsKey(item)) {
                    this.uniqueWords.put(item, 1);
                } else {
                    Integer count = this.uniqueWords.get(item);
                    count += 1;
                    this.uniqueWords.put(item, count);
                }
            }
        }
    }
}
