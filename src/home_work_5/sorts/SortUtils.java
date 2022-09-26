package home_work_5.sorts;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class SortUtils {
    public static <T> void sort (List<T> l, Comparator<? super T> cmp){
        int length = l.size();
        for (int i = 0; i < length; i++){
            for (int j = length - 1; j > i; j--){
                if (cmp.compare(l.get(j - 1), l.get(j)) > 0){
                    Collections.swap(l, j - 1, j);
                }
            }
        }
    }
}
