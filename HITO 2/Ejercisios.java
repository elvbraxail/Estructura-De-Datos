package ejercisio;

public class Ejercisios {
    private int i;
    private int limite;

    public Ejercisios () {
        this.i =1 ;
        this.limite = 10 ;
    }
    public void mostrarMensaje (){
        System.out.println("hola mundo desde java ");
    }
    public void generarNumerosNaturalesFOR (){

        for (int i=1 ; i <= 20 ; i ++)
            System.out.println ("i:" +i) ;
    }


    public void generarNumerosNaturalesWhile (){
        int i ;
        i = 0 ;
        while (i<= 5){
            System.out.println (i);
                    i=i+1;
        }

    }

}
