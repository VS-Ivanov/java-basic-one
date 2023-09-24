package ru.otus.vadim.ivanov.java.basic.lesson20;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ClientApp {

    public static Socket clientSocket;
    public static BufferedReader in;
    public static BufferedWriter out;

    public static Scanner scanner;
    public static void main(String[] args) {
        System.out.println("----hw20----");
        System.out.println("Client application....");

        try{
            try{ //finally в отдельном try так как можем словить исключение
                clientSocket = new Socket("localhost",8888);

                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                //получаем Welcome String от сервера
                String serverResponse = in.readLine();
                System.out.println(serverResponse);

                scanner = new Scanner(System.in);

                String userMsg = "";
                while(!"exit".equals(userMsg)) {

                    //получаем выражение от пользователя и отправляем его на сервер
                    System.out.print("Enter math expression or \"exit\": ");
                    userMsg = scanner.nextLine();
                    out.write(userMsg+"\n");
                    out.flush();

                    //получаем ответ сервера и отдаем пользователю
                    serverResponse = in.readLine();
                    System.out.println(serverResponse);
                }

            } finally {
                clientSocket.close();
                scanner.close();
                in.close();
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
