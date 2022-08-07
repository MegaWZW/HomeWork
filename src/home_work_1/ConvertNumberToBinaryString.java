package home_work_1;

import java.util.Scanner;

public class ConvertNumberToBinaryString {
   public static void main(String[] args) {
       Scanner console = new Scanner(System.in);

       System.out.println("Введите число от -128 до 127");
       byte number = console.nextByte();
       console.close();

       System.out.println("Запись числа в двоичной форме: " + toBinaryString(number));
   }

    public static String toBinaryString(byte b) {
        short mask = 0b11111111; //для XOR, чтобы инвертировать все биты числа

        if (b == 0) {
            return "00000000";
        }
        if (b == -128){
            return "10000000";
        }

        if (b > 0) {
            return String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        } else {
            return String.format("%8s", Integer.toBinaryString(((-b)^mask) + 1).replace(' ', '0'));
        }
        /*
        ((-b)^mask) + 1 -> отрицательное число превращаем в положительное,
        инвертируем все биты числа и добавляем единицу
         */
    }

}
