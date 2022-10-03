package home_work_pizza.menu;

import home_work_pizza.api.IPizzaInfo;

import java.util.Objects;

public class PizzaInfo implements IPizzaInfo {
    private String name;
    private String description;
    private int size;

    public PizzaInfo(String name, String description, int size) {
        this.name = name;
        this.description = description;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaInfo pizzaInfo = (PizzaInfo) o;
        return size == pizzaInfo.size && Objects.equals(name, pizzaInfo.name) && Objects.equals(description, pizzaInfo.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, size);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Название: ")
                .append(getName())
                .append("\n")
                .append("Состав: ")
                .append(getDescription())
                .append("\n")
                .append("Размер: ")
                .append(getSize())
                .append(" см");

        return builder.toString();
    }
}
