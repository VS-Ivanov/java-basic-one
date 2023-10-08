package ru.otus.vadim.ivanov.java.basic.lesson27;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp27 {

    public static void main(String[] args) {
        System.out.println("----hw27----");

        System.out.print("\nEnter filename: ");
        Scanner sc = new Scanner(System.in);
        File content = new File(sc.nextLine());
        //System.out.println(content.exists());
        if(!content.exists()) {
            System.out.println(String.format("File %s not found",content.getName()));
            System.exit(1);
        }

        System.out.print("Enter character sequence to search: ");
        String seq = sc.nextLine();
        System.out.println(String.format("Sequence count in file: %s",countSeqInFile(content,seq).getCount()));

    }

    private static SeqCounter countSeqInFile(File file, String seq) {
        SeqCounter counter = new SeqCounter();

        byte[] pattern = seq.getBytes(StandardCharsets.UTF_8);
        try(RandomAccessFile raf = new RandomAccessFile(file,"r")) {
            //System.out.println(raf.length());
            byte[] bufSeq = new byte[pattern.length];
            byte[] bufChar = new byte[1];
            //сканируем файл побайтово
            while(raf.read(bufChar) != -1) {
                //если первые байты совпадают возможно это наша последовательность
                if(bufChar[0] == pattern[0]) {
                    //делаем шаг назад, чтобы прочитать всю последовательность
                    raf.seek(raf.getFilePointer() - 1);
                    raf.read(bufSeq);
                    //если последовательность попадает под шаблон, увеличиваем счетчик
                    if (Arrays.equals(bufSeq, pattern)) {
                        counter.inc();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return counter;
    }
}
