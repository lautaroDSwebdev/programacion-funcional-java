package optionalss;

import java.util.Optional;

public class optionalsClass {
    public static void main(String[] args) {
        Optional<String> value = Optional.ofNullable(null);
        Optional<String> value1 = Optional.of("hola");
        Optional<String> value2 = Optional.empty();


        System.out.println(value2);
        if(value2.isEmpty()){
            System.out.println("valor vacio");
        } else  {
            System.out.println("el valor devuelve un string");
        }

    }
}
