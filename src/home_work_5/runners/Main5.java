package home_work_5.runners;

import home_work_5.comparators.AnimalAgeAndNickComparator;
import home_work_5.dto.Animal;
import home_work_5.sorts.SortUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Animal> persons = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            persons.add(PrimaryMain.makeAnimal());
        }

        System.out.println(Arrays.toString(persons.toArray()));

        SortUtils.sort(persons, new AnimalAgeAndNickComparator());

        System.out.println(Arrays.toString(persons.toArray()));
    }
}
