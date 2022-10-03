package home_work_pizza.order;

import home_work_pizza.api.IOrder;
import home_work_pizza.api.ISelectedItem;

import java.util.List;

public class Order implements IOrder {

    private List<ISelectedItem> list;

    public Order(List<ISelectedItem> list) {
        this.list = list;
    }

    public List<ISelectedItem> getSelected() {
        return list;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ваш заказ:\n");
        for (ISelectedItem item : list) {
            builder.append(item.toString());
        }
        return builder.toString();
    }
}
