package lesson15;

import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        var file = new File("E://photos");

//        getDirectory(file);
//        getFile(file, ".txt");
        readPath(file);

    }

    public static void getDirectory(File file) {

        if (file != null && file.canRead()) {
            var list = file.listFiles(File::isDirectory);

                Stream.ofNullable(list)
                        .flatMap(Stream::of)
                        .peek(Application::getDirectory)
                        .forEach(System.out::println);


        }
    }

    public static void getFile(File file, String extention){
        Stream.ofNullable(file.listFiles(File::isDirectory))
                .flatMap(Stream::of)
                .forEach(f -> getFile(f, extention));

        Stream.ofNullable(file.listFiles(((dir, name  ) -> name.endsWith(extention))))
                .flatMap(Stream::of)
                .forEach(System.out::println);
    }

    public static void readPath(File f) {
        var collect = Stream.ofNullable(f.listFiles())
                .flatMap(Stream::of)

                .peek(l -> {
                    if (l != null && l.canRead())
                        readPath(l);
                })
                .collect(Collectors.groupingBy(k -> k.isDirectory()));

        Optional.ofNullable(collect.get(true)).ifPresent((c) -> {
            c.stream().map(File::getAbsolutePath).sorted().forEach(System.out::println);
        });
        Optional.ofNullable(collect.get(false)).ifPresent((c) -> {
            c.stream().map(File::getAbsolutePath).sorted().forEach(System.out::println);

        });
    }

}
