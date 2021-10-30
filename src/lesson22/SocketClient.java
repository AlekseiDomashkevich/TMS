package lesson22;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) throws IOException {

        Socket client = new Socket("localhost", 8082);
//        var client = new Socket("httpbin.org", 80);

        var in = client.getInputStream();
        var out = client.getOutputStream();
        var request = new StringBuilder();
//        request.append("GET / HTTP/1.1\r\n");
//        request.append("Host: httpbin.org\r\n\r\n");
        request.append("GET /src/lesson22 HTTP/1.1\r\n");
        request.append("Host: localhost\r\n");
        request.append("Content-type: text/html\r\n\r\n");


        out.write(request.toString().getBytes());
        out.flush();


        var response = new StringBuilder();
        int c = 0;
        while ((c = in.read()) != -1) {
            response.append((char) c);
        }
        System.out.println(response);

    }
}


