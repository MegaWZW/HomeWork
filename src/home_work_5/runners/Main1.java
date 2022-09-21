package home_work_5.runners;

import home_work_5.dto.Animal;
import home_work_5.dto.Person;
import home_work_5.generators.IGenerator;
import home_work_5.generators.RandomEngCharStringGenerator;
import home_work_5.generators.RandomRusCharStringGenerator;
import home_work_5.generators.RandomStringGenerator;

public class Main1 {
    public static void main(String[] args) {

        IGenerator rnd = new RandomStringGenerator();
        IGenerator rnd1 = new RandomRusCharStringGenerator();
        IGenerator rnd2 = new RandomEngCharStringGenerator();
        System.out.println(rnd.generate());
        System.out.println(rnd1.generate());
        System.out.println(rnd2.generate());

    }
}
