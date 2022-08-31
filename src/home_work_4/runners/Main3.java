package home_work_4.runners;

import home_work_4.comparators.WhateverNumComparator;
import home_work_4.container.DataContainer;
import home_work_4.dto.Whatever;

import java.util.Comparator;

public class Main3 {
    public static void main(String[] args) {
        Whatever[] arr1 = {new Whatever("aaa", 5), null, new Whatever("xxx", 10),
                new Whatever("nnn", 3), new Whatever("bbb", 6), new Whatever("yyy",8)};

        DataContainer<Whatever> dc1 = new DataContainer<>(arr1);
        Comparator<Whatever> cmpWhatever = new WhateverNumComparator();

        DataContainer.<Whatever>sort(dc1, cmpWhatever);
        System.out.println(dc1);
    }
}
