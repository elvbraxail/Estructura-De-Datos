package PILAS;

public class pila_de_cadenas {

    private int max;
    private int  tope;
    private String [] nombres ;

    public  pila_de_cadenas () {
        this.max = 10;
        this.tope = 0;
        this.nombres = new String[this.max + 1];

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

    public void  adicionar (String nuevonombres){

        if (esLLena ()== true){

            System.out.println("pila llena ");

        }else {

            tope =  tope + 1;
            nombres [tope ] = nuevonombres;
        }

    }

    public String eliminar () {

        String itemelminado = "";

        if (esVacio() == true ) {
            System.out.println(" pila vacia ");
        } else {

            itemelminado = nombres[tope];

            tope = tope -1;
        }
        return itemelminado;

    }

    public void mostrar (){

        String item = " ";

        if (esVacio()== true ){

            System.out.println("no hay nada para mostrar waacho");
        }else {
            System.out.println("mostrando pila de numeros ");

            pila_de_cadenas aux = new pila_de_cadenas();
            while (esVacio()== false ){
                item = eliminar();
                System.out.println("Numero " + item );
                aux.adicionar(item);
            }
            aux.adicionar(item);
            vaciar(aux);

        }


    }

    public void vaciar (pila_de_cadenas pila ){

        while (!pila.esVacio())
            adicionar(pila.eliminar());

    }




}
