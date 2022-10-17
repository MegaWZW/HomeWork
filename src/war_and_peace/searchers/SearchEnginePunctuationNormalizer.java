package war_and_peace.searchers;

import war_and_peace.api.ISearchEngine;


public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searcher) {
        this.searchEngine = searcher;
    }

    @Override
    public long search(String text, String word) {
        String replaced = text.replaceAll("[^A-Za-zА-Яа-я0-9Ёё\\-]|-{2,}", " ");
        return searchEngine.search(replaced, word);
    }
}
