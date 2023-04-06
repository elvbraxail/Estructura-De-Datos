package PILAS;

public class PILAS {

    private int max ;

    private int tope ;

    private int []numeros ;


    public  PILAS () {
        this.max = 10;
        this.tope = 0;
        this.numeros = new int  [this.max + 1];

    }


    public boolean esVacio () {

        if ( this.tope == 0){
           return  true ;
        }else {
             return false;
        }
    }

    public boolean esLLena (){
        if (tope ==  max ){
            return true;


        }else {
            return false;
        }


    }

    public int nroElem (){

        return this.tope;
    }

    public void  adicionar (int nuevonumero){

        if (esLLena ()== true){

            System.out.println("pila llena ");

        }else {

            tope =  tope + 1;
            numeros [tope ] = nuevonumero;
        }

    }

    public int eliminar () {

        int itemelminado = 0;

        if (esVacio() == true ) {
             System.out.println(" pila vacia ");
        } else {

            itemelminado = numeros[tope];

            tope = tope -1;
        }
        return itemelminado;

    }

    public void mostrar (){
        int item = 0;

        if (esVacio()== true ){

            System.out.println("no hay nada para mostrar waacho");
        }else {
            System.out.println("mostrando pila de numeros ");

            PILAS aux = new PILAS();
            while (esVacio()== false ){
                item = eliminar();
                System.out.println("Numero " + item );
                aux.adicionar(item);
            }
            aux.adicionar(item);
            vaciar(aux);

        }


    }

    public void vaciar (PILAS pila ){

        while (!pila.esVacio())
            adicionar(pila.eliminar());

    }


}
