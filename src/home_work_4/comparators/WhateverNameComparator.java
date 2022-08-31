package home_work_4.comparators;

import home_work_4.dto.Whatever;

import java.util.Comparator;

public class WhateverNameComparator implements Comparator<Whatever> {
    @Override
    public int compare(Whatever a, Whatever b) {
        if (a == null){
            return -1;
        } else if (b == null){
            return 1;
        }
        return a.getName().compareTo(b.getName());
    }
}
