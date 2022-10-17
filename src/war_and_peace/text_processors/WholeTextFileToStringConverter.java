package war_and_peace.text_processors;

import war_and_peace.api.IConverter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WholeTextFileToStringConverter implements IConverter<File> {

    public String convert (File text) {
        String line;
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(text))) {
            do {
                line = reader.readLine();
                builder.append(line);
            } while (line != null);
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return builder.toString();
    }
}
