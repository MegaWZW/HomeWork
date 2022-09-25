package home_work_5.generators;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPersonNameFromFile implements IGenerator{

    private List<String> names = new ArrayList<>();

    public RandomPersonNameFromFile (String path) {
        try(BufferedReader reader =  new BufferedReader(new FileReader(path))){
            String item = null;
            while ((item = reader.readLine()) != null) {
                names.add(item);
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public RandomPersonNameFromFile (File data) {
        try(BufferedReader reader =  new BufferedReader(new FileReader(data))){
            String item = null;
            while ((item = reader.readLine()) != null) {
                names.add(item);
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String generate() {
        Random rnd = new Random();
        int length = names.size();
        int index = rnd.nextInt(length);
        return names.get(index);
    }

    public int getSize() {
        return names.size();
    }
}
