package home_work_5.runners;

import home_work_5.generators.RandomPassword;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        String nick = "";

        try(BufferedReader reader = new BufferedReader(new FileReader("HomeWork\\person_names.txt"))) {
            nick = reader.readLine();
        }catch (IOException e) {
            System.out.println("File not found");
        }
        System.out.println(nick);

        RandomPassword rp = new RandomPassword();
        System.out.println(rp.generate());
    }



}
