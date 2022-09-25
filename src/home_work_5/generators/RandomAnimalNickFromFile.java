package home_work_5.generators;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomAnimalNickFromFile implements IGenerator {

    private List<String> nicks = new ArrayList<>();

    public RandomAnimalNickFromFile (String path) {
        try(BufferedReader reader =  new BufferedReader(new FileReader(path))){
            String item = null;
            while ((item = reader.readLine()) != null) {
                nicks.add(item);
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public RandomAnimalNickFromFile(File data) {
        try(BufferedReader reader =  new BufferedReader(new FileReader(data))){
            String item = null;
            while ((item = reader.readLine()) != null) {
                nicks.add(item);
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String generate() {
        Random rnd = new Random();
        int length = nicks.size();
        int index = rnd.nextInt(length);
        return nicks.get(index);
    }

    public int getSize() {
        return nicks.size();
    }
}
