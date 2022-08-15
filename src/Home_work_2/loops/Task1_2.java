package Home_work_2.loops;

public class Task1_2 {
    public static void main(String[] args) {

        double doubleValue;
        long longValue;
        String strValue;
        String strLongValue;
        int productOfDigits = 1;

        if(args[0].contains(",")){
            strValue = args[0].replaceAll(",", ".");
        }else {
            strValue = args[0];
        }

        try {
            doubleValue = Double.parseDouble(strValue);
            if (doubleValue % 1 != 0) {
                System.out.println("Введено не целое число");
            }else {
                longValue = (long)doubleValue;
                strLongValue = String.valueOf(longValue);
                for (int i = 0; i < strLongValue.length(); i++) {
                    if(Character.isDigit(strLongValue.charAt(i))) {
                        productOfDigits *= Character.getNumericValue(strLongValue.charAt(i));
                        System.out.print(strLongValue.charAt(i) + " * ");
                    }
                }
                System.out.print("\b\b");
                System.out.print("= " + productOfDigits);
            }
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        }
    }
}
