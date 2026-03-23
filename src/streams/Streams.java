package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
//        Con ArrayList
//        List<String> names = new ArrayList<>();
//
//        names.add("Hernan");
//        names.add("Bruno");
//        names.add("Lautaro");
//
//
//        names.stream().forEach(System.out::println);

        List<String> names = Arrays.asList("Hernan", "Lautaro", "Florencia", "Roberto");


        names.stream()
                .filter(e -> e.toLowerCase().contains("a"))
                .forEach(System.out::println);

/// Devuelve->  Hernan Lautaro Florencia

    }
}
