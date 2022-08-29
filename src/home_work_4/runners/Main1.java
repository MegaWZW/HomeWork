package home_work_4.runners;

import home_work_4.comparators.IntegerComparator;
import home_work_4.comparators.WhateverComparator;
import home_work_4.container.DataContainer;
import home_work_4.dto.Whatever;

import java.util.Arrays;
import java.util.Comparator;

public class Main1 {
    public static void main(String[] args) {

        Integer[] arr = {8, 15, 78,null, 3, 99, -1};
        Whatever[] arr1 = {new Whatever("aaa", 5), null, new Whatever("xxx", 10),
                            new Whatever("nnn", 3), new Whatever("bbb", 6), new Whatever("yyy",8)};
        DataContainer<Integer> container = new DataContainer<>(arr);
        DataContainer<Whatever> container2 = new DataContainer<>(arr1);

        System.out.println(Arrays.toString(container.getItems()));

        System.out.println(container.add(100500));

        System.out.println(container.get(2));

        System.out.println(container.delete((Integer)3));
        System.out.println(Arrays.toString(container.getItems()));

        Comparator<Integer> cmp = new IntegerComparator();
        container.sort(cmp);
        System.out.println(Arrays.toString(container.getItems()));
        Comparator<Whatever> cmpWhatever = new WhateverComparator();
        container2.sort(cmpWhatever);

        for (Whatever w : container2.getItems()){
            if (w != null){
                System.out.println(w.getName());
            }else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println(container.toString());

        Integer[] arr2 = {1, null, 3, null, null, null};
        DataContainer<Integer> container3 = new DataContainer<>(arr2);
        System.out.println(container3.toString());

    }
}
