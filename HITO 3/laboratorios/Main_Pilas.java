package PILAS;

public class Main_Pilas {
    public static void main(String[] args) {
        PILAS pil1 = new PILAS();

        pil1.adicionar(10);
        pil1.adicionar(2);
        pil1.adicionar(5);
        pil1.adicionar(23);
        pil1.adicionar(5);


        pil1.mostrar();
        muestranumeromax(pil1);
        determinarcuatosnumeros5hayenlapila (pil1, 5);



    }
    public static void muestranumeromax (PILAS pila ) {

        PILAS aux = new PILAS ();
        int num = 0;
        int max = 0;


        while (!pila.esVacio()) {

            num = pila.eliminar();
            if (num > max ){
                max = num ;
            }
            aux.adicionar(num);
        }

        pila.vaciar(aux);
        System.out.println("mayor :" + max );

    }

    public static  void determinarcuatosnumeros5hayenlapila (PILAS pila , int numero  ) {

        PILAS aux = new PILAS();

        int num = 0;
        int count = 0;


        while (!pila.esVacio()) {

            num = pila.eliminar();
            if (num  == numero  ){
                count =  count + 1 ;
            }
            aux.adicionar(num);
        }

        pila.vaciar(aux );
        System.out.println("cuantos 5 hay :" + count );


    }
}
