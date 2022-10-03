package home_work_pizza.order;

import home_work_pizza.api.IOrderStatus;
import home_work_pizza.api.IStage;
import home_work_pizza.api.ITicket;

import java.util.ArrayList;
import java.util.List;

public class OrderStatus implements IOrderStatus {
    private ITicket ticket;
    private List<IStage> stageList;
    private boolean prepared = false;

    public OrderStatus(ITicket ticket) {
        this.ticket = ticket;
        this.stageList = new ArrayList<>();
    }

    public OrderStatus(ITicket ticket, IOrderStatus status) {
        this.ticket = ticket;
        this.stageList = status.getHistory();
    }

    @Override
    public ITicket getTicket() {
        return ticket;
    }

    @Override
    public List<IStage> getHistory() {
        return stageList;
    }

    @Override
    public boolean isDone() {
        return prepared;
    }

    /**
     * Устанавливает значение поля prepared
     * @param prepared - заказ готов - true; не готов - false
     */
    public void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Заказ №").append(ticket.getNumber()).append("\n");
        for (IStage stage : getHistory()){
            builder.append(stage.toString());
        }
        return builder.toString();
    }
}
