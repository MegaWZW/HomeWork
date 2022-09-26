package home_work_5.runners;

import home_work_5.comparators.AnimalAgeAndNickComparator;
import home_work_5.comparators.NickAndPasswordComparator;
import home_work_5.dto.Animal;
import home_work_5.dto.Person;
import home_work_5.dto.SpentTime;
import home_work_5.generators.*;
import home_work_5.sorts.SortUtils;

import java.util.*;

public class PrimaryMain {

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

    public static <T> SpentTime iterateWithIterator (List<T> c) {
        Iterator<T> iterator = c.iterator();
        long start = System.currentTimeMillis();
        while(iterator.hasNext()) {
            iterator.next();
        }
        long finish = System.currentTimeMillis();
        return new SpentTime("итерация итератором коллекции " + c.getClass().getName(), finish-start);
    }

    public static <T> SpentTime iterateWithFor (List<T> c) {
        int length = c.size();
        long start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            c.get(i);
        }
        long finish = System.currentTimeMillis();
        return new SpentTime("итерация циклом for коллекции " + c.getClass().getName(), finish - start);
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


        //LinkedList<Person> и ArrayList<Animal> сделал на 1000 элементов, т.к. сортировка собственными методами
        //этих коллекций жутко тормозит

        SpentTime t1 = fillCollectionWithPersons(personArrayList, 1000000);
        System.out.println(t1);

        SpentTime t2 = fillCollectionWithPersons(personLinkedList, 1000);
        System.out.println(t2);

        SpentTime t3 = fillCollectionWithPersons(personHashSet, 1000000);
        System.out.println(t3);

        SpentTime t4 = fillCollectionWithPersons(personTreeSet, 1000000);
        System.out.println(t4);

        SpentTime t5 = fillCollectionWithAnimals(animalArrayList, 1000);
        System.out.println(t5);

        SpentTime t6 = fillCollectionWithAnimals(animalLinkedList, 1000000);
        System.out.println(t6);

        SpentTime t7 = fillCollectionWithAnimals(animalHashSet, 1000000);
        System.out.println(t7);

        SpentTime t8 = fillCollectionWithAnimals(animalTreeSet, 1000000);
        System.out.println(t8);

        // Задание 6.3.1. Сортировка встроенными средствами jdk
        Collections.sort(personArrayList, new NickAndPasswordComparator());
        Collections.sort(animalLinkedList, new AnimalAgeAndNickComparator());

        //Задание 6.3.2. Сортировка своим методом
        SortUtils.sort(animalArrayList, new AnimalAgeAndNickComparator());
        SortUtils.sort(personLinkedList , new NickAndPasswordComparator());

        //итерирование коллекций
        SpentTime t9 = iterateWithIterator(personArrayList);
        SpentTime t10 = iterateWithFor(personArrayList);
        SpentTime t11 = iterateWithIterator(personLinkedList);
        SpentTime t12 = iterateWithFor(personLinkedList);

        System.out.println(t9);
        System.out.println(t10);
        System.out.println(t11);
        System.out.println(t12);


        //удаление всех элементов коллекции при помощи итератора
        int index = 0;
        Iterator<Person> iterator = personArrayList.iterator();
        long start = System.currentTimeMillis();
        while(iterator.hasNext() && index < personArrayList.size()) {
            personArrayList.remove(index);
            index++;
        }
        long finish = System.currentTimeMillis();
        SpentTime t13 = new SpentTime("удаление всех элементов Person в ArrayList итератором", finish - start);
        System.out.println(t13);


        //удаление всех элементов коллекции при помощи цикла for
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < animalArrayList.size(); i++) {
            animalArrayList.remove(i);
        }
        long finish2 = System.currentTimeMillis();
        SpentTime t14 = new SpentTime("удаление всех элеменитов Animal в ArrayList в цикле for", finish2 - start2);
        System.out.println(t14);

    }
}
