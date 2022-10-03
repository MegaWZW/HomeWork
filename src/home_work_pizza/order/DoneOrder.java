package home_work_pizza.order;

import home_work_pizza.api.IDoneOrder;
import home_work_pizza.api.IPizza;
import home_work_pizza.api.ITicket;

import java.util.ArrayList;
import java.util.List;

public class DoneOrder implements IDoneOrder {
    private ITicket ticket;
    private List<IPizza> pizzaList;

    public DoneOrder(ITicket ticket) {
        this.ticket = ticket;
        this.pizzaList = new ArrayList<>();
    }

    @Override
    public ITicket getTicket() {
        return ticket;
    }

    @Override
    public List<IPizza> getItems() {
        return pizzaList;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (IPizza pizza : pizzaList){
            builder.append(pizza.toString());
        }
        return builder.toString();
    }
}
