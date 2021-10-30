package lesson21;

import java.io.IOException;
import java.net.ServerSocket;

public class WebFileServer {
    public static void main(String[] args) throws IOException, InterruptedException {
//        HttpClient client = HttpClient.newBuilder().build();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("http://httpbin.org:80"))
//                .GET()
//                .build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.statusCode());
//        System.out.println(response.statusCode());
//        var headers = response.headers();
//        headers.map().entrySet().forEach(System.out::println);
////        System.out.println(response.body());
//        var requestHeaders = request.headers();
//        requestHeaders.map().entrySet().forEach(System.out::println);

        ServerSocket serverSocket = new ServerSocket(8082);
        while (true){
           var socket =  serverSocket.accept();
            System.out.println("Client accepted");
            new Thread(new SocketProcessor(socket)).start();
        }
    }
}
