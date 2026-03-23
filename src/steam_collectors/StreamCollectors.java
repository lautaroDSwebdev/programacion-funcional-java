package steam_collectors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectors {


    public static void main(String[] args) {

        List<String> names = List.of("Hernan", "Lautaro", "Florencia", "Roberto");


        List<String> namesFiltered = names.stream()
                .filter(e -> e.contains("a"))
                .collect(Collectors.toList());

        System.out.println(namesFiltered);
///    Devuelve-> [Hernan, Lautaro, Florencia]
    }


}
