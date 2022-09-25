package home_work_5.runners;

import home_work_5.dto.Animal;
import home_work_5.dto.Person;
import home_work_5.dto.SpentTime;
import home_work_5.generators.*;

import java.util.*;

public class Main1 {

    public static Person makePerson() {
        return new Person (new RandomStringGenerator(10).generate(),
                new RandomPassword().generate(),
                new RandomRealPersonNameGenerator().generate());
    }

    public static Animal makeAnimal() {
        return new Animal((new Random().nextInt(15) + 1),
                new RandomAnimalNickGenerator().generate());
    }

    public static SpentTime fillCollectionWithPersons (Collection<Person> c, int amount) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            c.add(makePerson());
        }
        long finish = System.currentTimeMillis();
        return new SpentTime("заполенение " + c.getClass().getName() + " объектами Person", finish - start);
    }

    public static SpentTime fillCollectionWithAnimals (Collection<Animal> c, int amount) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            c.add(makeAnimal());
        }
        long finish = System.currentTimeMillis();
        return new SpentTime("заполенение " + c.getClass().getName() + " объектами Animal", finish - start);
    }

    public static List<Person> personArrayList = new ArrayList<>();
    public static List<Animal> animalArrayList = new ArrayList<>();
    public static List<Person> personLinkedList = new LinkedList<>();
    public static List<Animal> animalLinkedList = new LinkedList<>();
    public static Set<Person> personHashSet = new HashSet<>();
    public static Set<Animal> animalHashSet = new HashSet<>();
    public static Set<Person> personTreeSet = new TreeSet<>();
    public static Set<Animal> animalTreeSet = new TreeSet<>();

    public static void main(String[] args) {
        SpentTime t1 = fillCollectionWithPersons(personArrayList, 1_000_000);
        System.out.println(t1);

        SpentTime t2 = fillCollectionWithPersons(personLinkedList, 1_000_000);
        System.out.println(t2);

        SpentTime t3 = fillCollectionWithPersons(personHashSet, 1_000_000);
        System.out.println(t3);

        SpentTime t4 = fillCollectionWithPersons(personTreeSet, 1_000_000);
        System.out.println(t4);

        SpentTime t5 = fillCollectionWithAnimals(animalArrayList, 1_000_000);
        System.out.println(t5);

        SpentTime t6 = fillCollectionWithAnimals(animalLinkedList, 1_000_000);
        System.out.println(t6);

        SpentTime t7 = fillCollectionWithAnimals(animalHashSet, 1_000_000);
        System.out.println(t7);

        SpentTime t8 = fillCollectionWithAnimals(animalTreeSet, 1_000_000);
        System.out.println(t8);

        System.out.println(personArrayList.size());
        System.out.println(personHashSet.size());
        System.out.println(animalArrayList.size());
        System.out.println(animalHashSet.size());
    }
}
