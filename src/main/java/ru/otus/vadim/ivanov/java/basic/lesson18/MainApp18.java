package ru.otus.vadim.ivanov.java.basic.lesson18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

public class MainApp18 {

    public static void main(String[] args) {
        System.out.println("----hw18----");

        //выводим текущую директорию
        //System.out.println(System.getProperty("user.dir")+":");
        try {
            File rootDir = new File(".");

            System.out.println(rootDir.getAbsolutePath() + ":");
            for (File file : rootDir.listFiles(new TxtFileFilter())) {
                System.out.println(file.getName());
            }

            //запрашиваем имя файла у пользователя
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter filename: ");
            String userChoice = scanner.nextLine();

            //читаем выбранный пользователем файл
            File userFile = new File(userChoice);
            System.out.println("\nReading file " + userFile.getName() + ":");
            readTxtFile(userFile);

            //записываем в файл строку
            System.out.println("\n\nWrite string into file " + userFile.getName() + ":");
            System.out.print("Enter string: ");
            String userString = scanner.nextLine();
            writeTxtFile(userFile,userString);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readTxtFile (File file) throws IOException {
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(file.getName()))) {
            byte[] buf = new byte[64];
            int n = in.read(buf);
            while (n > 0) {
                System.out.print(new String(buf, 0, n));
                n = in.read(buf);
            }
        }
    }

    public static void writeTxtFile(File file, String str) throws IOException {
        try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file.getName()))) {
            out.write(str.getBytes(StandardCharsets.UTF_8));
            out.flush();
        }
    }
}
