package home_work_5.comparators;

import home_work_5.dto.Person;

import java.util.Comparator;

public class NickAndPasswordComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int passLen1 = o1.getPassword().length();
        int passLen2 = o2.getPassword().length();
        String nick1 = o1.getNick();
        String nick2 = o2.getNick();

        if (passLen1 == passLen2) {
            return nick1.compareTo(nick2);
        }else {
            return passLen1 - passLen2;
        }
    }
}
