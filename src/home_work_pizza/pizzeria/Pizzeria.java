package home_work_pizza.pizzeria;

import home_work_pizza.api.*;
import home_work_pizza.generators.RandomTicketNumberGenerator;
import home_work_pizza.order.DoneOrder;
import home_work_pizza.order.OrderStatus;
import home_work_pizza.order.Ticket;

public class Pizzeria implements IPizzeria {
    private IMenu menu;

    public Pizzeria(IMenu menu) {
        this.menu = menu;
    }

    @Override
    public IMenu takeMenu() {
        return menu;
    }

    @Override
    public ITicket create(IOrder order) {
        return new Ticket(RandomTicketNumberGenerator.generate(), order);
    }

    @Override
    public IOrderStatus check(ITicket ticket) {
        return new OrderStatus(ticket);
    }

    @Override
    public IDoneOrder pickup(ITicket ticket) {
        return new DoneOrder(ticket);
    }
}
