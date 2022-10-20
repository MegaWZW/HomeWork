package war_and_peace.runners;


import war_and_peace.api.ISearchEngine;
import war_and_peace.searchers.RegExSearch;
import war_and_peace.searchers.SearchEnginePunctuationNormalizer;
import war_and_peace.text_processors.WholeTextFileToStringConverter;

import java.io.File;
import java.util.Scanner;

public class UserSearch {
    public static void main(String[] args) {
        System.out.println("Список папок, доступных для выбора");
        System.out.println("----------------------------------");
        File data = new File("HomeWork");
        if (data.exists()) {
            File[] files = data.listFiles();
            for (File file : files) {
                if (file.getName().startsWith("book")) {
                    System.out.println(file.getName());
                }
            }
        }
        System.out.println("----------------------------------");
        System.out.println("Введите имя папки, в которой хотите читать файлы");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        String userPath = builder.append("HomeWork/").append(input).toString();


        File userData = new File(userPath);
        if (userData.exists()) {
            System.out.println();
            System.out.println("Список книг");
            System.out.println("----------------------------------");
            File[] files = userData.listFiles();
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Неверный ввод");
        }
        System.out.println("----------------------------------");
        System.out.println("Введите книгу, в которой хотите осуществить поиск слова");
        String strBook = scanner.nextLine();
        String userPathToBook = builder.append("/").append(strBook).toString();

        File userBook = new File(userPathToBook);
        if(userBook.exists()){
            WholeTextFileToStringConverter converter = new WholeTextFileToStringConverter();
            ISearchEngine regExSearcher = new RegExSearch();
            ISearchEngine normalizer = new SearchEnginePunctuationNormalizer(regExSearcher);
            String strText = converter.convert(userBook);
            System.out.println("Введите слово, которое хотите найти");
            String wantedWord = scanner.nextLine();
            System.out.println("Слово " + "'" + wantedWord + "'" + " встретилось " + normalizer.search(strText, wantedWord) + " раз(а)");
        }else {
            System.out.println("Неверный ввод");
        }
    }
}
