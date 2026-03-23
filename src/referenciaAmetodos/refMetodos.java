package referenciaAmetodos;

import java.util.function.Function;

public class refMetodos {


    public static void main(String[] args) {
        Function<Integer, String> convert  = String::valueOf;
        String res = convert.apply(50);
//
//        System.out.println(res);

        Person per = new Person();
        per.nombre = "Hernan";

        Runnable saludo = per::saludo;
        saludo.run();
        System.out.println(saludo);
///  Devuelve-> esta saludando: Hernan
    }

}
