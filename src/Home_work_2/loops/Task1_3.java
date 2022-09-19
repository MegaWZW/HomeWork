package Home_work_2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {

        double result = 1.0;
        double number;

        System.out.println("Введите число, которое хотите возвести в степень");
        Scanner console = new Scanner(System.in);

        String strNumber = console.nextLine();
        if(strNumber.contains(",")) {
            strNumber = strNumber.replaceAll(",", ".");
        }
        number = Double.parseDouble(strNumber);
        System.out.println("Введите степень (целую, положительную), в которую хотите возвести число");
        int pow = console.nextInt();
        console.close();

        if (pow < 0) {
            System.out.println("Степень должна быть положительной");
        }else {
            for(int i = 0; i < pow; i++) {
                result *= number;
            }
            System.out.printf("%.2f ^ %d = %.2f", number, pow, result);
        }
    }

    public double pow (double n, int a) {
        double result = 1.0;
        for (int i = 0; i < a; i++) {
            result *= n;
        }
        return result;
    }
}
