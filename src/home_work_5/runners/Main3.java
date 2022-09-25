package home_work_5.runners;

import home_work_5.generators.RandomAnimalNickFromFile;
import home_work_5.generators.RandomPersonNameFromFile;
import home_work_5.generators.RandomPersonNickFromFile;


public class Main3 {
    public static void main(String[] args) {

        RandomPersonNameFromFile r = new RandomPersonNameFromFile("person_names.txt");
        RandomPersonNickFromFile r2 = new RandomPersonNickFromFile("person_nicks.txt");
        RandomAnimalNickFromFile r3 = new RandomAnimalNickFromFile("animal_nicks.txt");
        System.out.println(r.generate());
        System.out.println(r2.generate());
        System.out.println(r3.generate());

        System.out.println(r.getSize());
        System.out.println(r2.getSize());
        System.out.println(r3.getSize());

    }
}
