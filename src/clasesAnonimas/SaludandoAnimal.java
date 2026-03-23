package clasesAnonimas;

public class SaludandoAnimal {
    public static void main(String[] args) {

        new Animal() {

            private int cifra;

            @Override
            public void saludar() {
                cifra = 5;
                System.out.println("Saludando a " + cifra + " animales distintos");
            }



        }.saludar() ;


    }
}
