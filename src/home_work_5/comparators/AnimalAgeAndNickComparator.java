package home_work_5.comparators;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class AnimalAgeAndNickComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        String nick1 = o1.getNick();
        String nick2 = o2.getNick();

        if (o1.getAge() == o2.getAge()){
            return nick1.compareTo(nick2);
        }else {
            return o1.getAge() - o2.getAge();
        }
    }
}
