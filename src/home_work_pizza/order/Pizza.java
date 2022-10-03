package home_work_pizza.order;

import home_work_pizza.api.IPizza;
import home_work_pizza.api.ISelectedItem;

public class Pizza implements IPizza {
    private String name;
    private int size;

    public Pizza (ISelectedItem item) {
        this.name = item.getRow().getInfo().getName();
        this.size = item.getRow().getInfo().getSize();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getName())
                .append("--------------")
                .append(getSize())
                .append(" см")
                .append("\n");

        return builder.toString();
    }
}
