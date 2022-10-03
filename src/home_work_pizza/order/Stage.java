package home_work_pizza.order;

import home_work_pizza.api.IStage;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Stage implements IStage {
    private String description;
    private LocalTime currentTime;

    public Stage(String description) {
        this.description = description;
        this.currentTime = LocalTime.now();
    }

    @Override
    public String getDescription() {
        return description;
    }

    public LocalTime getTime() {
        return currentTime;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(description).append(" ")
                .append(getTime().format(DateTimeFormatter.ofPattern("HH:mm"))).append("\n");
        return builder.toString();
    }

}
