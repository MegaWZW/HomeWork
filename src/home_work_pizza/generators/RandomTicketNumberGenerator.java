package home_work_pizza.generators;

import java.util.Random;

/**
 * Класс для генерации случайного номера квитка
 */
public class RandomTicketNumberGenerator {
    /**
     * генерирует случайный номер для квитка
     * @return возвращает случайный номер квитка в виде строки, содержащую буквенно-цифровой код
     */
    public static String generate() {
        String str1 = "ABC";
        String str2 = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 1; i++){
            int number = random.nextInt(3);
            sb.append(str1.charAt(number));
        }
        for(int i = 0; i < 4; i++){
            int number = random.nextInt(10);
            sb.append(str2.charAt(number));
        }

        return sb.toString();
    }
}
