package ru.otus.vadim.ivanov.java.basic.lesson20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

    private static ServerSocket server;
    private static Socket clientSocket;
    private static BufferedReader in;
    private static BufferedWriter out;

    private static String serverResponse;
    private final static String welcomeMsg = "Hello from Server Application!" +
            " You can use the following math operators: +,-,*,/";
    public static void main(String[] args) {

        System.out.println("Server application...");

        try {

            try { //finally в отдельном try так как можем словить исключение

                server = new ServerSocket(8888);

                clientSocket = server.accept(); // ждем пока кто-то подключится
                try {
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                    //отправляем приветствие пользователю
                    sendMsg(welcomeMsg);

                    while(true) {

                        String msg = in.readLine();
                        System.out.println("Получил сообщение: "+msg);

                        if(msg.trim().startsWith("exit")) {
                            sendMsg("Bye!");
                            break;
                        }

                        //парсим и вычисляем выражение
                        try {
                            MathParserResult parserResult = MathParser.parse(msg);
                            //System.out.println(result.getOperator());
                            switch (parserResult.getOperator()) {
                                case "+":
                                    serverResponse = "Result: " + (parserResult.getOperand1() + parserResult.getOperand2());
                                    break;

                                case "-":
                                    serverResponse = "Result: " + (parserResult.getOperand1() - parserResult.getOperand2());
                                    break;

                                case "*":
                                    serverResponse = "Result: " + (parserResult.getOperand1() * parserResult.getOperand2());
                                    break;

                                case "/":
                                    serverResponse = "Result: " + (parserResult.getOperand1() / parserResult.getOperand2());
                                    break;

                                default:
                                    serverResponse = "Invalid operator: " + parserResult.getOperator();
                            }

                            //отправляем результат вычислений клиенту
                            sendMsg(serverResponse);

                        } catch (MathParserException e) {
                            //при ошибке парсинга оповещаем пользователя
                            sendMsg(e.getMessage());
                        } catch (ArithmeticException e) {
                            //если что-то не так при вычислении сообщаем пользователю
                            sendMsg(e.toString());
                        }

                    }


                } finally {

                  //закрываем стримы
                  in.close();
                  out.close();
                  clientSocket.close();
                }

            } finally {
                server.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void sendMsg(String msg) throws IOException {
        if(out != null) {
            out.write(msg+"\n");
            out.flush();
        }
    }
}
