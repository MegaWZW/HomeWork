package home_work_pizza.order;

import home_work_pizza.api.IDoneOrder;
import home_work_pizza.api.IPizza;
import home_work_pizza.api.ITicket;

import java.util.ArrayList;
import java.util.List;

public class DoneOrder implements IDoneOrder {
    private ITicket ticket;

    private List<IPizza> list = new ArrayList<>();

    public DoneOrder(ITicket ticket) {
        this.ticket = ticket;
        for (int i = 0; i < ticket.getOrder().getSelected().size(); ++i) {
            for (int j = 0; j < ticket.getOrder().getSelected().get(i).getCount(); ++j) {
                list.add(new Pizza(ticket.getOrder().getSelected().get(i)));
            }
        }
    }

    @Override
    public ITicket getTicket() {
        return ticket;
    }

    @Override
    public List<IPizza> getItems() {
        return list;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (IPizza pizza : list){
            builder.append(pizza.toString());
        }
        return builder.toString();
    }
}
