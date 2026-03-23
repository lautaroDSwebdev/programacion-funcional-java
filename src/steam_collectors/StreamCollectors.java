package steam_collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectors {


    public static void main(String[] args) {

        List<String> names = List.of("Hernan", "Lautaro", "Florencia", "Roberto");

        List<String> namesFiltered = names.stream()
                .filter(e -> e.contains("a"))
                .collect(Collectors.toList());
///        System.out.println(namesFiltered);
///        Elimina los que por condicion no contienen una "a"
///    Devuelve-> [Hernan, Lautaro, Florencia]

        List<String> languajes = List.of("Typescript", "Typescript", "Python", "C Sharp", "Javascript", "Rust");
        Set<String> languajesWithoutRepeat = languajes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
///        System.out.println(languajesWithoutRepeat);
///        Lo ordena alfabeticamente y sin repeticiones
///    Devuelve-> [JAVASCRIPT, C SHARP, RUST, TYPESCRIPT, PYTHON]


        List<String> languajes2 = List.of("Typescript", "Typescript", "Python", "C Sharp", "Javascript", "Rust");
        String listaLang = languajes2.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" - "));

        /// Coloca un elemento string de separacion entre cada una de las propiedades
        ///  System.out.println(listaLang);
        ///  Devuelve -> TYPESCRIPT - TYPESCRIPT - PYTHON - C SHARP - JAVASCRIPT - RUST

        Long contadorCant = languajes2.stream()
                .filter(e -> e.startsWith("T"))
                .collect(Collectors.counting());

        System.out.println(contadorCant);
///  Cuenta la cantidad de veces existe tal caracter
/// Devuelve -> 2

        List<Integer> nums = List.of(65, 678, 43, 87, 56, 98);

        Map<Boolean, List<Integer>> mayoresQue = nums.stream()
                .collect(Collectors.partitioningBy(e -> e >= 60));
        System.out.println(mayoresQue);
/// Devuelve -> {false=[43, 56], true=[65, 678, 87, 98]}

    }


}
