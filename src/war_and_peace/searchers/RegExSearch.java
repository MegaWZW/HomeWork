package war_and_peace.searchers;

import war_and_peace.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        if (isEmpty(text) || isEmpty(word)) {
            return 0;
        }

        long count = 0;
        Matcher matcher = Pattern.compile(word).matcher(text);

        while(matcher.find()) {
            count++;
        }
        return count;
    }

    private boolean isEmpty (String s) {
        return s == null || s.length() == 0;
    }

}
