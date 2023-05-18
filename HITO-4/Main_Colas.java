package Colas;

public class Main_Colas {

      public static void main(String[] args) {

       // tipado = las variables si o si tiene que estar declaradas ya sea de tipo string o bool


            ColaDeNumeros cola =  new ColaDeNumeros();

            cola.adicionarNumero(2);
            cola.adicionarNumero(9);
            cola.adicionarNumero(1);
            cola.adicionarNumero(4);
            cola.adicionarNumero(5);
            cola.adicionarNumero(6);

            //cola.mostrarcolanumeros();


            cola.mostrarcolanumeros();
            multiplosde3(3);
            cola.mostrarcolanumeros();
      }

      public static void multiplosde3 ( ColaDeNumeros cola, int multiplos){

            ColaDeNumeros aux = new ColaDeNumeros();
            int eliminadatos = 0;
            int contador=0;
            while (!cola.esVacia()){

                  contador = cola.eliminarnumero();
                  if (contador % multiplos ==0 ){
                        contador = contador +1;

                  }
                  aux.adicionarNumero(eliminadatos);
            }
            cola.vaciar(aux);
            System.out.println("multiplos de 3 " + contador );


      }

      public static void eliminadatosiguales (ColaDeNumeros cola ){

            ColaDeNumeros aux =  new ColaDeNumeros();
            int elimanador = 0;
            int contador = 0;
            while (!cola.esVacia())
                  contador = cola.eliminarnumero();

            if (elimanador ==  )
      }



}
