package home_work_pizza.api;

import java.time.LocalTime;

/**
 * Квиток выдаваемый к заказу
 */
public interface ITicket {

    /**
     * Уникальный номер заказа
     * @return
     */
    String getNumber();

    /**
     * Когда заказ получен
     * @return
     */
    LocalTime getCreateAt();

    /**
     * Заказ для которого выдали квиток
     * @return
     */
    IOrder getOrder();
}
