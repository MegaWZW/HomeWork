package war_and_peace.api;

import java.util.Set;

public interface IUniqueWordsExtractor<T> {
    Set<String> extract(T text);
}
