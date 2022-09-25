package home_work_5.dto;

import home_work_5.exceptions.InvalidAgeException;

import java.util.Objects;

public class Animal implements Comparable<Animal> {

    private int age;
    private String nick;

    @Override
    public int compareTo(Animal o) {
        return this.nick.compareTo(o.getNick());
    }

    public Animal(int age, String nick) {
        if (age >= 1 && age <= 15) {
            this.age = age;
            this.nick = nick;
        }else {
            throw new InvalidAgeException("Недопустимый возраст животного");
        }
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nick);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}
