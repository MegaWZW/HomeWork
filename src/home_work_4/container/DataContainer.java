package home_work_4.container;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] arr){
        this.data = arr;
    }

    /**
     * Метод для получения содержимого поля класса
     * @return возвращает содержимое в виде массива
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Добавляет данные во внутренне поле класса
     * @param item - элемент, который нужно добавить
     * @return - индекс, по которому произошло добавление элемента
     * возвращает -1, если добавление элемента не произошло.
     */
    public int add (T item){
        int index;
        boolean containsNull = false;

        if (data.length == 0){
            data = Arrays.copyOf(data, data.length + 1);
        }

        for(int i = 0; i < data.length; i++){
            if (data[i] == null){
                containsNull = true;
                break;
            }
        }

        if (!containsNull){
            data = Arrays.copyOf(data, data.length + 1);
        }

        if (item != null){
            for (int i = 0; i < data.length; i++){
                if(data[i] == null) {
                    data[i] = item;
                    index = i;
                    return index;
                }
            }
        }
        return -1;
    }

    /**
     * Получает элемент по его индексу
     * @param index индекс элемента, который нужно получить
     * @return - элемент. Если элемент не найден - возвращает null
     */
    public T get (int index){
        if (index >= data.length){
            return null;
        }
        return data[index];
    }

    /**
     * Удаляет элемент по его индексу
     * @param index идекс, по которому нужно произвести удаление элемента
     * @return true - если элемент удалён, false - если удаление не произошло
     */
    public boolean delete (int index){
        boolean isDelete = false;

        if (index >= 0 && index < data.length){
            T[] newData = Arrays.copyOf(data, data.length - 1);
            T[] prt1Data = Arrays.copyOfRange(data, 0, index);
            T[] prt2Data= Arrays.copyOfRange(data, index + 1, data.length);

            System.arraycopy(prt1Data, 0, newData, 0, prt1Data.length);
            System.arraycopy(prt2Data, 0, newData, prt1Data.length, prt2Data.length);
            data = newData;
            isDelete = true;
        }
       return isDelete;
    }

    /**
     * Удаление конкретного элемента
     * @param item элемент, который нужно удалить
     * @return true - если элемент удалён, false - если удаление не произошло
     */
    public boolean delete (T item){
        boolean isDelete = false;
        int index = -1;

        if (item == null){
            return false;
        }else{
            for (T datum : data){
                index++;
                if (item.equals(datum)){
                    isDelete = true;
                    break;
                }
            }
            if (isDelete){
                T[] newData = Arrays.copyOf(data, data.length - 1);
                T[] prt1Data = Arrays.copyOfRange(data, 0, index);
                T[] prt2Data= Arrays.copyOfRange(data, index + 1, data.length);

                System.arraycopy(prt1Data, 0, newData, 0, prt1Data.length);
                System.arraycopy(prt2Data, 0, newData, prt1Data.length, prt2Data.length);
                data = newData;
            }
        }
        return isDelete;
    }

    /**
     * Сортирует элементы, используя объект типа Comparator<T>
     * @param cmp компаратор, содержащий реализацию сравнения
     */
    public void sort (Comparator<T> cmp){
        for (int i = 0; i < data.length; i++){
            for (int j = data.length - 1; j > i; j--){
                if (cmp.compare(data[j-1], data[j]) > 0){
                    T tmp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
    /**
     * Переопределённый метод toString
     * @return возвращает строковое предствление поля класса, исключая null
     */
    @Override
    public String toString() {
        String str = "[";
        for (T datum : data){
            if (datum != null){
                str += datum.toString() + ", ";
            }
        }
        return str + "\b\b" +"]";
    }

    /**
     * Сортирует элементы, хранящиеся в поле объета DataContainer,
     * используя реализацию сравнения, хранящуюся внутри самих объектов
     * @param container - объект типа DataContainer, должен содержать в своём поле объекты,
     *                 реализующие интерфейс Comparable
     * @param <T> - тип сортируемых элементов
     */
   public static <T> void sort (DataContainer<? extends Comparable<T>> container) {

       Comparable<T>[] arrObj = container.getItems();
       for (int i = 0; i < arrObj.length; i++){
           for (int j = arrObj.length - 1; j > i; j--){
               if (arrObj[j-1] != null && arrObj[j-1].compareTo((T)arrObj[j]) > 0){
                   Comparable<T> tmp = arrObj[j-1];
                   arrObj[j-1] = container.data[j];
                   arrObj[j] = tmp;
               }
           }
       }
   }

    /**
     * Сортирует элементы, хранящиеся в поле объета DataContainer,
     * используя переданный компаратор
     * @param container - объект типа DataContainer, содержащий в своём поле массив элементов
     * @param cmp - объект компаратора
     * @param <T> - тип сортируемых элементов
     */
   public static <T> void sort (DataContainer<T> container, Comparator<T> cmp){
       T[] arrObj = container.getItems();
       for (int i = 0; i < arrObj.length; i++){
           for (int j = arrObj.length - 1; j > i; j--){
               if (cmp.compare(arrObj[j-1], arrObj[j]) > 0){
                   T tmp = arrObj[j-1];
                   arrObj[j-1] = arrObj[j];
                   arrObj[j] = tmp;
               }
           }
       }
   }
}
