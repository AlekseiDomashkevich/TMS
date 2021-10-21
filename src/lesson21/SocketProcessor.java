package lesson21;

import java.io.*;
import java.net.Socket;

public class SocketProcessor implements Runnable {
    private Socket socket;
    private InputStream inputStream;
    private OutputStream outputStream;

    public SocketProcessor(Socket socket) throws IOException {
        this.socket = socket;
        this.inputStream = socket.getInputStream();
        this.outputStream = socket.getOutputStream();
        File file = new File("./");
    }

    @Override
    public void run() {
        try {
            File file0 = new File("./");
            File file = new File(file0, doRequest());
//            System.out.println(doRequest());
            if(file.exists()){
                doResponse(file);
            }

        } catch (Throwable exception) {
            exception.printStackTrace();
        }
    }

    public String doRequest() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String result = reader.readLine();
        var res = result.split(" ");
        result = res[1].substring(1);
        return result;
    }

    public void doResponse(File file) throws Throwable {
        var builder = new StringBuilder();
        if(file.isDirectory()){
            var listDirectory = file.listFiles();
            for(int i = 0; i<listDirectory.length; i++){
                builder.append("<a href =\"");
                builder.append(file.getName());
                builder.append(listDirectory[i].getAbsolutePath().replace(file.getAbsolutePath(), ""));
                builder.append("\">");
                builder.append(listDirectory[i].getName());
                builder.append("</a>");
                builder.append("<br>");
            }
            writeResponseForDirectory(builder.toString());

        }else {
            var bufferedReader = new BufferedReader(new FileReader(file));
            int x = 0;
            while ((x=bufferedReader.read())!=-1){
                builder.append((char) x);
            }
            writeResponseForFile(builder.toString());

        }


    }
    private void writeResponseForDirectory(String s) throws Throwable {
        String response = "HTTP/1.1 200 OK\r\n" +
                "Server: YarServer/2009-09-09\r\n" +
                "Content-Type: text/html\r\n" +
                "Content-Length: " + s.length() + "\r\n" +
                "Connection: close\r\n\r\n";
        String result = response + s;
        outputStream.write(result.getBytes());
        outputStream.flush();
    }
    private void writeResponseForFile(String s) throws Throwable {
        String response = "HTTP/1.1 200 OK\r\n" +
                "Server: YarServer/2009-09-09\r\n" +
                "Content-Type: text/plain\r\n" +
                "Content-Length: " + s.length() + "\r\n" +
                "Connection: close\r\n\r\n";
        String result = response + s;
        outputStream.write(result.getBytes());
        outputStream.flush();
    }
}
