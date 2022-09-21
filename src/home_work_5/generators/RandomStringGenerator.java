package home_work_5.generators;

import java.util.Random;

public class RandomStringGenerator implements IGenerator {

    private int length;

    public RandomStringGenerator(int length){
        this.length = length;
    }

    public RandomStringGenerator() {
        Random rnd = new Random();
        this.length = rnd.nextInt(51);
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
