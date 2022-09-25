package home_work_5.comparators;

import home_work_5.dto.Person;

import java.util.Comparator;

public class PasswordLengthComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        String password1 = p1.getPassword();
        String password2 = p2.getPassword();

        return password1.length() - password2.length();
    }
}
