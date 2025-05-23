import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int fileCount = 0;
        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists) {
                System.out.println("Файл не существует");
                continue;
            }
            if (isDirectory) {
                System.out.println("Указан путь к папке, а не к файлу");
                continue;
            }
            fileCount++;
            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + fileCount);
        }
    }
}
