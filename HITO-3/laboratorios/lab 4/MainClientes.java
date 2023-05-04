package PiladeClientes;



public class MainClientes {
    public static void main (String [] args ){


        Cliente c1 = new Cliente("Wilmer ", "de la fuente " , 25, "satelite", "Masculino");
        Cliente c2 = new Cliente("Daniel", "Quispe", 19, "Ceja", "Masculino");
        Cliente c3 = new Cliente("Rosa", "Mamani", 21, "Sopocachi ", "Femenino");
        Cliente c4 = new Cliente("Mariel", "Morales", 25, "Plaza Avaroa", "Femenino");
        Cliente c5 = new Cliente("Erick", "Machaca", 15, "Calacoto ", "Masculino");

        PilaCliente cliente = new PilaCliente();
        cliente.adicionarCliente(c1);
        cliente.adicionarCliente(c2);
        cliente.adicionarCliente(c3);
        cliente.adicionarCliente(c4);
        cliente.adicionarCliente(c5);

        //cliente.mostrarPilacliente();

        //cliente.mostrarPilacliente();
        //numeroMaoyorPersona(cliente, 20);
        //System.out.println("--------------------------------------------");
        //cliente.mostrarPilacliente();


        //cliente.mostrarPilacliente();
        //kEsimoPosecion(cliente, 3);
        //System.out.println("--------------------------------------------");
        //cliente.mostrarPilacliente();

        //cliente.mostrarPilacliente();
        //asignaDireccion(cliente,"Senkata");
        //System.out.println("--------------------------------------------");
        //cliente.mostrarPilacliente();

        cliente.mostrarPilacliente();
        reordenarPila(cliente);
        System.out.println("--------------------------------------------");
        cliente.mostrarPilacliente();


    }

    public static void numeroMaoyorPersona (PilaCliente pila , int edadM){

        PilaCliente aux = new PilaCliente();
        Cliente deletecliente = null ;
        int contador = 0;
        while (!pila.esVacio()){
            deletecliente = pila.eliminarcliente();

            if (deletecliente.getEdad() > edadM){
                contador = contador +1 ;
            }
            aux.adicionarCliente(deletecliente);
        }
        pila.vaciar (aux);
        System.out.println("exiten " +contador + " personas mayores a "+edadM );



    }

    public static void kEsimoPosecion (PilaCliente pila , int valorTope){

        PilaCliente aux = new PilaCliente();
        Cliente deletecliente = null ;
        Cliente almacenador = null ;
        while (!pila.esVacio()){
            deletecliente = pila.eliminarcliente();

            if (pila.Numeroclientes() +1 == valorTope){
                almacenador = deletecliente;

            }else
            {
                aux.adicionarCliente(deletecliente);

            }

        }
        pila.vaciar(aux);
        pila.adicionarCliente(almacenador);

    }

    public static void asignaDireccion (PilaCliente pila , String nuevadireccion){

        PilaCliente aux = new PilaCliente();
        Cliente deletecliente = null ;

        while (!pila.esVacio()){
            deletecliente = pila.eliminarcliente();

            if (deletecliente.getGenero() .equals ("Femenino") ){
                deletecliente.setDireccion(nuevadireccion);
            }
            aux.adicionarCliente(deletecliente);


        }
        pila.vaciar(aux);


    }

    public static void reordenarPila (PilaCliente pila){
        PilaCliente aux = new PilaCliente();
        Cliente deletecliente = null ;
        PilaCliente almacen  = new PilaCliente();

        while (!pila.esVacio()){
            deletecliente = pila.eliminarcliente();

            if (deletecliente.getGenero() .equals("Femenino") ){
                almacen.adicionarCliente(deletecliente);
            }else{
                aux.adicionarCliente(deletecliente);

            }

        }
        pila.vaciar(aux);
        pila.vaciar(almacen);


    }

}



