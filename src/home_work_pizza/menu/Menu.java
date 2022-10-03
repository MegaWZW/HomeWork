package home_work_pizza.menu;

import home_work_pizza.api.IMenu;
import home_work_pizza.api.IMenuRow;

import java.util.List;

public class Menu implements IMenu {
    private List<IMenuRow> list;

    public Menu(List<IMenuRow> list) {
        this.list = list;
    }

    @Override
    public List<IMenuRow> getItems() {
        return list;
    }
}
