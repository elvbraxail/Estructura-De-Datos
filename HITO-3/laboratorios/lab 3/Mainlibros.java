package Libro;

public class Mainlibros {
    public static void main(String[] args) {

        Pilalibros pil1 = new Pilalibros( "Homer ", 500, 50, "la Odisea ", "Historia" );
        Pilalibros pil2 = new Pilalibros( "Homer ", 500, 20, "la Iliada", "Historia" );

        Libros.PilaDeCadenas pila = new Libros.PilaDeCadenas();
        pila.adicionar (libro1);
        pila.adicionar (libro2 );

        pila.mostrar_libro();

    }

}
