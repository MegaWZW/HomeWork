package home_work_5.generators;

import java.util.Random;

public class RandomEngCharStringGenerator implements IGenerator {

    private int length;

    public RandomEngCharStringGenerator(int length){
        this.length = length;
    }

    public RandomEngCharStringGenerator() {
        Random rnd = new Random();
        this.length = rnd.nextInt(51);
    }

    @Override
    public String generate() {
        String str= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < this.length; i++){
            int number = random.nextInt(52);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
