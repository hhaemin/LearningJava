package exercise.chapter_57;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        try(ServerSocket serverSocket = new ServerSocket(1234); // 서버 소켓 생성

        ) {
            System.out.println("서버가 시작되었습니다.");

            while(true) {
                try (Socket clientSocket = serverSocket.accept();
                ) {

                    System.out.println("클라이언트가 접속하였습니다.");

                    // 클라이언트로부터 데이터를 받기 위한 InputStream 생성
                    InputStream clientInputStream = clientSocket.getInputStream();
                    BufferedReader clientBufferedReader = new BufferedReader(new InputStreamReader(clientInputStream));

                    // 클라이언트로부터 데이터를 보내기 위한 OutputStream 생성
                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

                    // inputLine;
                    String inputLine;

                    // 클라이언트로부터 데이터를 읽고 화면에 출력
                    while ((inputLine = clientBufferedReader.readLine()) != null) {
                        System.out.println("클라이언트로 부터 온 요청은 " + inputLine);

                        String[] strs = inputLine.split(",");

                        String ID = strs[0];
                        String name = strs[1];

                        Customer customer = new Customer(ID, name);

                        customerList.add(customer);

                        printWriter.println("현재 고객대기명단은: " + customerList);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
