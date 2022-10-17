package war_and_peace.searchers;

import war_and_peace.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngineIgnoreCase implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEngineIgnoreCase(ISearchEngine searcher) {
        this.searchEngine = searcher;
    }

    @Override
    public long search(String text, String word) {
        if (isEmpty(text) || isEmpty(word)) {
            return 0;
        }
        long count = 0;
        if (searchEngine instanceof EasySearch) {
            text = text.toLowerCase();
            word = word.toLowerCase();
            return searchEngine.search(text, word);
        }else if (searchEngine instanceof RegExSearch) {
            Matcher matcher = Pattern.compile(word, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE).matcher(text);

            while(matcher.find()) {
                count++;
            }
            return count;
        }
        return 0;
    }

    private boolean isEmpty (String s) {
        return s == null || s.length() == 0;
    }
}
