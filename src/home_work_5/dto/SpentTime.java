package home_work_5.dto;

public class SpentTime {
    private String operationType;
    private long time;

    public SpentTime (String description, long time) {
        this.operationType = description;
        this.time = time;
    }

    public String getOperationType() {
        return operationType;
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Операция: " + getOperationType() + ". " + "Заняла " + getTime() + " мс";
    }
}
