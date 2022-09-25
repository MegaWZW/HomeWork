package home_work_5.generators;

import java.util.Random;

public class RandomPassword implements IGenerator {

    private int length;

    public RandomPassword() {
        Random rnd = new Random();
        this.length = rnd.nextInt(6) + 5;
    }

    @Override
    public String generate() {
        String str= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^&*";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < this.length; i++){
            int number = random.nextInt(69);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
