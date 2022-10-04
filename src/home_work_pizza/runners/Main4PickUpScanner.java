package home_work_pizza.runners;

import home_work_pizza.api.*;
import home_work_pizza.menu.Menu;
import home_work_pizza.menu.MenuRow;
import home_work_pizza.menu.PizzaInfo;
import home_work_pizza.order.*;
import home_work_pizza.pizzeria.Pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Демонстрация получения заказа
 */
public class Main4PickUpScanner {
    public static void main(String[] args) {

        //создание объектов, которые содержат описание пиццы
        IPizzaInfo info1 = new PizzaInfo("Грибная", "чесночный соус, ветчина, " +
                "свежие шампиньоны, сыр моцарелла, базилик", 25);

        IPizzaInfo info2 = new PizzaInfo("Пепперони", "пицца-соус, пепперони, " +
                "сыр моцарелла, базиликпицца-соус, пепперони, сыр моцарелла, базилик", 30);

        IPizzaInfo info3 = new PizzaInfo("Четыре сезона", "чесночный соус, пепперони, " +
                "ветчина, свежие шампиньоны, филе цыпленка, сыр моцарелла, базилик", 35);


        //создание объектов, представляющих собой абстракцию строки в меню
        IMenuRow row1 = new MenuRow(info1, 18.90);
        IMenuRow row2 = new MenuRow(info2, 20.90);
        IMenuRow row3 = new MenuRow(info3, 25.90);

        //список строк меню
        List<IMenuRow> rows = new ArrayList<>();
        rows.addAll(List.of(row1, row2, row3));

        //создание самого меню
        IMenu menu = new Menu(rows);

        //создание объекта пиццерии
        IPizzeria pizzeria = new Pizzeria(menu);

        //начинаем выбор позиций для заказа
        ISelectedItem choice1 = new SelectedItem(row1, 2);
        ISelectedItem choice2 = new SelectedItem(row2, 1);

        //формируем заказ
        List<ISelectedItem> selected = new ArrayList<>();
        selected.addAll(List.of(choice1, choice2));
        IOrder order = new Order(selected);

        //создаём квиток
        ITicket ticket = pizzeria.create(order);

        //подтверждаем заказ
        OrderStatus orderStatus = acceptOrder(ticket);
        System.out.println(orderStatus);

        /*
        заказ готовится. Тут можно узнать статус заказа
        при вызове метода nextStage() номер стадии (stageNumber) увеличивается на единицу,
        а в поле объекта orderStatus, содержащее список стадий (List<IStage>) добавляется новый объект Stage,
        содержащий описание стадии
         */
        Scanner sc = new Scanner(System.in);
        int stageNumber = 1;
        while (!orderStatus.isDone()) {
            System.out.println("Для перехода к следующему этапу заказа нажмите '1'");
            int choice = sc.nextInt();
            if (choice == 1){
                stageNumber = nextStage(orderStatus, stageNumber);
                System.out.println(orderStatus);
            }else{
                continue;
            }
            if (stageNumber == 5){
                orderStatus.setPrepared(true);
                break;
            }
        }
        sc.close();

        //создаём готовый заказ
        IDoneOrder doneOrder = pizzeria.pickup(ticket);
        System.out.println("Забирайте заказ: \n" + doneOrder);
    }

    /**
     * Статический метод для подтверждения заказа по квитку
     * @param ticket - квиток, по которому нужно подтвердить заказ
     * @return Возвращает объект калсса OrderStatus, у которого первый элемен поля stageList
     * хранит ссылку на объект Stage, который содержит информацию о первой стадии заказа
     */
    public static OrderStatus acceptOrder(ITicket ticket){
        OrderStatus status = new OrderStatus(ticket);
        status.getHistory().add(new Stage("Заказ принят"));
        return status;
    }

    /**
     * Статический метод для увеличения номера порядкового номера стадии приготовления заказа
     * @param stage - получает номер предыдущей стадии
     * @return - увеличенный на единицу порядковый номер стадии
     */
    public static int increaseStageNumber(int stage){
        return ++stage;
    }

    /**
     * Статический метод для перехода на следующую стадию
     * @param status - принимает объект класса OrderStatus и добавляет в его поле stageList новый объект
     *               типа Stage
     * @param stage - принимает номер текущей стадии и увеличивает её на единицу
     * @return - возвращает порядковый номер следующей стадии приготовления заказа
     */
    public static int nextStage(OrderStatus status, int stage){
        int nextStage;

        if (stage >= 5) {
            nextStage = -1;
            status.setPrepared(true);
            return nextStage;
        }
        nextStage = increaseStageNumber(stage);
        switch (nextStage) {
            case 1:
                status.getHistory().add(new Stage("Заказ принят"));
                break;
            case 2:
                status.getHistory().add(new Stage("Начато приготовление пиццы"));
                break;
            case 3:
                status.getHistory().add(new Stage("Пицца в печи"));
                break;
            case 4:
                status.getHistory().add(new Stage("Заказ пакуется"));
                break;
            case 5:
                status.getHistory().add(new Stage("Заказ готов"));
                break;

        }
        return nextStage;
    }
}
