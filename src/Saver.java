import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Saver {
    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println ("Введите имя нового файла (без указания формата): ");
        String fileName = reader.readLine();
        System.out.println("Введите формат нового файла: ");
        String fileFormat = reader.readLine();
        System.out.println("Введите текст для сохранения: ");
        String fileText = reader.readLine();
        System.out.println("Создание файла завершено.");

        try {
            FileWriter writer = new FileWriter(fileName + "." + fileFormat);
            writer.write(fileText);
            writer.close();

        } catch(Exception ex){ex.printStackTrace();}
    }
}
