package home_work_1;

public class LearningMath {
    public static void main(String[] args) {

        System.out.println("Нахождение гипотенузы прямоугольного треугольника:");
        System.out.println();
        double cat1 = 3D;
        double cat2 = 4D;
        double hyp = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        System.out.printf("У треугольника с катетами %.2f и %.2f гипотенуза равна %.2f\n", cat1, cat2, hyp);
        System.out.print("Вычисление той же гипотенузы встроенным методом hypot(): " + Math.hypot(cat1, cat2));

        System.out.println();
        System.out.println("=====================================");

        System.out.println("Пробуем различные варианты округлений:");
        System.out.println();

        System.out.println("Привычное окгругление:");
        System.out.println("5.3 -> " + Math.round(5.3)); // 5
        System.out.println("5.4 -> " + Math.round(5.4)); // 5
        System.out.println("5.5 -> " + Math.round(5.5)); // 6
        System.out.println("5.6 -> " + Math.round(5.6)); // 6

        System.out.println();

        System.out.println("Окгугление в сторону отрицательной бесконечности:");
        System.out.println("5.3 -> " + Math.floor(5.3)); // 5.0
        System.out.println("5.4 -> " + Math.floor(5.4)); // 5.0
        System.out.println("5.5 -> " + Math.floor(5.5)); // 5.0
        System.out.println("5.6 -> " + Math.floor(5.6)); // 5.0

        System.out.println();

        System.out.println("Округление в сторону положительной бесконечности:");
        System.out.println("5.3 -> " + Math.ceil(5.3)); // 6.0
        System.out.println("5.4 -> " + Math.ceil(5.4)); // 6.0
        System.out.println("5.5 -> " + Math.ceil(5.5)); // 6.0
        System.out.println("5.6 -> " + Math.ceil(5.6)); // 6.0

        System.out.println("=====================================");

        System.out.println("Вычисление значения числа по модулю:");
        System.out.println();
        System.out.println("-5 по модулю равно: " + Math.abs(-5));
        System.out.println("-7.95 по модулю равно: " + Math.abs(-7.95));

        System.out.println("=====================================");

        System.out.println("Логарифм с основанием 10:");
        System.out.println();
        System.out.println("Логарифм 1000 по основанию 10 равен " + Math.log10(1000));

        System.out.println("=====================================");

        System.out.println("Возврат наибольшего и наименьшего числа из двух:");
        System.out.println();
        System.out.println("Наибольшее из двух чисел 145 и 256: " + Math.max(256, 145));
        System.out.println("Наименьшее из двух чисел 145 и 256: " + Math.min(256, 145));

        System.out.println("=====================================");

        System.out.println("Генерация случайных чисел:");
        /*
        Math.random() генерирует вещественные числа от 0 включительно до 1 исключительно, что
        не совсем удобно. Если мы хотим сгенерировать число из определённого диапазона, то можем
        воспользоваться формулой из интернета: Math.random() * (b-a) ) + a, где
        а - нижняя граница диапазона
        b - верхняя граница диапазона
        В конце результат приводим к int
         */
        System.out.println();
        System.out.println("Случайное число от 25 до 100:");
        System.out.println((int)(Math.random()*75) + 25);

        System.out.println("=====================================");
        System.out.println("Перевод градусов в радианы и наоборот:");
        System.out.println();

        System.out.printf("90 градусов это %.2f радиан\n", Math.toRadians(90));
        System.out.printf("%.2f радиан это %.1f градусов ", Math.toRadians(90), Math.toDegrees(Math.toRadians(90)));
    }
}
