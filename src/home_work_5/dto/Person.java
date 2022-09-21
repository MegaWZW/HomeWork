package home_work_5.dto;

import home_work_5.exceptions.InvalidPasswordLengthException;

import java.util.Objects;

public class Person {

    private String nick;
    private String password;
    private String name;

    public Person(String nick, String password, String name) {
        if ((password.length() <= 10) && (password.length() >= 5)) {
            this.nick = nick;
            this.password = password;
            this.name = name;
        }else{
            throw new InvalidPasswordLengthException("Недопустимая длина пароля");
        }

    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) && Objects.equals(password, person.password) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
