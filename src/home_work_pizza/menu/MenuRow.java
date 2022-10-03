package home_work_pizza.menu;

import home_work_pizza.api.IMenuRow;
import home_work_pizza.api.IPizzaInfo;

import java.util.Objects;

public class MenuRow implements IMenuRow {
    private IPizzaInfo info;
    private double price;

    public MenuRow(IPizzaInfo info, double price) {
        this.info = info;
        this.price = price;
    }

    @Override
    public IPizzaInfo getInfo() {
        return info;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuRow menuRow = (MenuRow) o;
        return Double.compare(menuRow.price, price) == 0 && Objects.equals(info, menuRow.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(info, price);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Название: ")
                .append(info.getName())
                .append("\n")
                .append("Состав: ")
                .append(info.getDescription())
                .append("\n")
                .append("Размер: ")
                .append(info.getSize())
                .append(" см")
                .append("\n")
                .append("Цена: ")
                .append(getPrice());

        return builder.toString();
    }
}
