package Colas;

import CLiente.Cliente;
import CLiente.PilaCliente;

public class ColaDeNumeros {

    private int max;
    private int ini;

    // ini guarda procesos de borrado de items
    private int fin;
    // fin seria casi lo mismo que max en pila ya que en esta parte se registra los items nuevos
    private int [] numeros ;

    public ColaDeNumeros () {
        this.max = 10;
        this.ini = 0;
        this.fin=0;
        this.numeros = new int[this.max+1];

    }

    public boolean esVacia (){
        if (ini == 0 && fin==0){
            return true;
        }else {
            return false ;
        }
    }

    public boolean esLLena (){
        if (fin == max ){
            return true ;

        }else {
            return false ;
        }
    }

    public void adicionarNumero (int nuevonunmero) {

        if (esLLena() == true) {
            System.out.println("cola llena ");
        } else {
            fin = fin + 1;
            numeros[fin] = nuevonunmero;
        }
    }

    public int eliminarnumero() {
        int  numeroeliminado = 0;

        if (esVacia()) {
            System.out.println("La cola esta vacia");
        } else {
            ini = ini+1;
            numeroeliminado = numeros[ini];

        }

        return numeroeliminado;
    }

    public int vaciar (ColaDeNumeros cola ) {

        while (!cola.esVacia()) {

            adicionarNumero(cola.eliminarnumero());
        }

        return 0;
    }

    public void mostrarcolanumeros () {

        int numeros = 0;

        if (esVacia()) {
            System.out.println("No hay numeros que mostrar ");
        }
        else
        {
            System.out.println("Muestra de numeros :");

            ColaDeNumeros aux = new ColaDeNumeros();
            while (!esVacia()) {
                numeros= eliminarnumero();
                aux.adicionarNumero(numeros);
                System.out.println("numero : "+ numeros);

            }
            vaciar(aux);
        }
    }

    public int Numerodeelementos (){

        return fin - ini;
    }

}
