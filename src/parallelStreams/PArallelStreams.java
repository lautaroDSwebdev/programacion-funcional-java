package parallelStreams;

import java.util.Arrays;

public class PArallelStreams {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//Stream secuencial
        long timeToStart = System.nanoTime();
        Arrays.stream(nums)
                .forEach(e -> System.out.println(e));
        long timeToEnd = System.nanoTime();
        System.out.println("Tiempo total de calculo en nanosegundos: " + (timeToEnd - timeToStart));
/// Devuelve ->
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        Tiempo total de calculo en nanosegundos: 1385100

//        Parallel Stream
        long timeToStart2 = System.nanoTime();
        Arrays.stream(nums)
                .parallel().forEach(e -> System.out.println("Con hilos paralelos: " + e));

        long timeToEnd2 = System.nanoTime();
        System.out.println("Tiempo total de calculo en nanosegundos: " + (timeToEnd2 - timeToStart2));
        /// Devuelve ->
//        Con hilos paralelos: 5
//        Con hilos paralelos: 6
//        Con hilos paralelos: 7
//        Con hilos paralelos: 4
//        Con hilos paralelos: 2
//        Con hilos paralelos: 8
//        Con hilos paralelos: 3
//        Con hilos paralelos: 9
//        Con hilos paralelos: 1
//        Tiempo total de calculo en nanosegundos: 9712200
    }
}
