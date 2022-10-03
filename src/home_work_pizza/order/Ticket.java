package home_work_pizza.order;

import home_work_pizza.api.IOrder;
import home_work_pizza.api.ITicket;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ticket implements ITicket {
    private String number;
    private LocalTime timeOfOrder;
    private IOrder order;

    public Ticket(String number, IOrder order) {
        this.number = number;
        this.timeOfOrder = LocalTime.now();
        this.order = order;
    }

    @Override
    public String getNumber() {
        return number;
    }

    public LocalTime getCreateAt() {
        return timeOfOrder;
    }

    @Override
    public IOrder getOrder() {
        return order;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ваш номер: ").append(getNumber()).append("\n");
        builder.append("Время заказа: ").append(timeOfOrder.format(DateTimeFormatter.ofPattern("HH:mm"))).append("\n");
        builder.append("---------------------").append("\n");
        builder.append(order.toString());
        return builder.toString();
    }
}
