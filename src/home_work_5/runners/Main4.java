package home_work_5.runners;

import home_work_5.generators.RandomPersonNickFromFile;

public class Main4 {
    public static void main(String[] args) {
        RandomPersonNickFromFile r = new RandomPersonNickFromFile("HomeWork\\person_nicks.txt");
        System.out.println(r.generate());
    }
}
