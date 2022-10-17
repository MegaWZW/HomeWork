package war_and_peace.searchers;

import war_and_peace.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long count = 0;
        int pos = 0;

        if (isEmpty(text) || isEmpty(word)) {
            return 0;
        }
        do {
            if(text.indexOf(word, pos) >= 0) {
                ++count;
                pos = (text.indexOf(word, pos) + word.length());
            } else {
                break;
            }
        } while (pos <= text.length());

        return count;
    }

    private boolean isEmpty (String s) {
        return s == null || s.length() == 0;
    }
}
