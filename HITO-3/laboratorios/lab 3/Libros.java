package Libro;


public class Libros {


    public class PilaDeCadenas {


        private int max;
        private int tope;
        private Pilalibros [] libro;

        public PilaDeCadenas(int max){
            this.max = max;
            this.tope = 0;
            this.libro = new Pilalibros[this.max+1] ;

        }
        public boolean esVacio(){
            if (tope==0){
                return true;
            }
            else{
                return false;
            }
        }

        public boolean esllena(){
            if (tope==max){
                return true;
            }
            else{
                return false;
            }

        }
        public int nroElem(){

            return tope;
        }

        public void adicionar(Pilalibros nuevolibro){

            if(esllena() == true){
                System.out.println("Pila llena");

            }
            else{
                tope= tope+1;
                libro[tope] = nuevolibro;
            }
        }

        public Pilalibros eliminar(){


            Pilalibros  lirbroeliminado = null;

            if(esVacio() == true){
                System.out.println("Pila Vacia");
            }
            else{
                lirbroeliminado = libro [tope];
            }

            tope = tope-1;

            return lirbroeliminado;
        }


        public void vaciar(PilaDeCadenas pila){

            while (pila.esVacio()==false){ // o podemos usar !pila.esVacio

                adicionar(pila.eliminar());
            }

        }
        public void mostrar(){

            Pilalibros item = null;
            if(esVacio()){
                System.out.println("No hay items a mostrar");
            }
            else {
                System.out.println("mostrando la Pila de elementos");
                PilaDeCadenas aux = new PilaDeCadenas( max);
                while(esVacio()==false){
                    item = eliminar();






                    aux.adicionar(item);
                    item.mostrar_libro();
                }
                vaciar(aux);
            }
        }
    }

}
