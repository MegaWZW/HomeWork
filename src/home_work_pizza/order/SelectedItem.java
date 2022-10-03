package home_work_pizza.order;

import home_work_pizza.api.IMenuRow;
import home_work_pizza.api.ISelectedItem;

public class SelectedItem implements ISelectedItem {
    private IMenuRow row;
    private int count;

    public SelectedItem(IMenuRow row, int count) {
        this.row = row;
        this.count = count;
    }

    @Override
    public IMenuRow getRow() {
        return row;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getRow().getInfo().getName())
                .append("...........................")
                .append(getCount())
                .append(" шт")
                .append("\n");
        return builder.toString();
    }
}
