package expresionesLambda;

public class ExpresionLambda {

    public static void main(String[] args) {


       Mensajero lamdMsn =  (name) -> {
            System.out.println("esto es un mensaje de: " + name );
        };

       lamdMsn.mensaje("Lautaro");
       /// Devuelve -> esto es un mensaje de: Lautaro
    }
}
