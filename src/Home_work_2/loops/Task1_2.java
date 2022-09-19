package Home_work_2.loops;

public class Task1_2 {
    public String productOfDigitsInNumber (String number) {

        double doubleValue;
        long longValue;
        String strValue;
        String strLongValue;
        int productOfDigits = 1;

        if(number.contains(",")){
            strValue = number.replaceAll(",", ".");
        }else {
            strValue = number;
        }
        StringBuilder builder = new StringBuilder();
        try {
            doubleValue = Double.parseDouble(strValue);
            if (doubleValue % 1 != 0) {
                return "Введено не целое число";
            }else {
                longValue = (long)doubleValue;
                strLongValue = String.valueOf(longValue);

                boolean needStar = false;
                for (int i = 0; i < strLongValue.length(); i++) {
                    if(Character.isDigit(strLongValue.charAt(i))) {
                        productOfDigits *= Character.getNumericValue(strLongValue.charAt(i));
                        if(needStar) {
                            builder.append(" * ");
                        } else {
                            needStar = true;
                        }
                        builder.append(strLongValue.charAt(i));
                    }
                }
                builder.append(" = ").append(productOfDigits);
            }
        } catch (NumberFormatException e) {
            return "Введено не число";
        }
        return builder.toString();
    }
}
