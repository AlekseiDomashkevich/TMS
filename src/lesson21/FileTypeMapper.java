package lesson21;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileTypeMapper {
    private OutputStream outputStream;

    public void setOutputStream(OutputStream stream) {
        this.outputStream = stream;
    }

    public void writeResponse(File file) throws IOException {
        var header = new StringBuilder();
        header.append("HTTP/1.1 200 OK\r\n");
        header.append("Server: YarServer/2009-09-09\r\n");
        header.append(getContentType(file));
        header.append("Content-Length: " + file.length() + "\r\n");
        header.append("Connection: close\r\n\r\n");

        outputStream.write(header.toString().getBytes());
        outputStream.write(Files.readAllBytes(Paths.get(file.getPath())));
        outputStream.flush();
    }

    //не стал маппить все типы данных, для теста сделал несколько из тех что у меня на "сервере"
    //думаю для понимания достаточно
    private String getContentType(File file) {
        var fileNameWords = file.getName().split("\\.");
        var suffix = fileNameWords[fileNameWords.length - 1];
        switch (suffix) {
            case "txt", "java" -> {
                return "Content-Type: text/plain; charset=UTF-8\r\n";
            }
            case "png" -> {
                return "Content-Type: image/png\r\n";
            }
            default -> {
                return "Content-Type: application/octet-stream\r\n";
            }
        }
    }
}
