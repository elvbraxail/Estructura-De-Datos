package PiladeClientes;


    public class PilaCliente {


        int max;
        private int tope;
        private Cliente[] Clientes;

        public PilaCliente() {

            this.max = 10;
            this.tope = 0;
            this.Clientes = new Cliente[max+1];


        }

        public boolean esVacio() {
            if (tope == 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean esllena() {
            if (tope == max) {
                return true;
            } else {
                return false;
            }

        }
        public int Numeroclientes (){

            return tope;
        }



        public void adicionarCliente(Cliente nuevocliente) {

            if (esllena() == true) {
                System.out.println("Pila llena");
            } else {
                tope = tope + 1;
                Clientes[tope] = nuevocliente;
            }
        }

        public Cliente eliminarcliente() {
            Cliente clienteEliminado = null;

            if (esVacio()) {
                System.out.println("La pila está vacía.");
            } else {
                clienteEliminado = Clientes[tope];
                Clientes[tope] = null;
                tope--;
            }

            return clienteEliminado;

        }


        public void vaciar (PilaCliente pila) {
            while (!pila.esVacio()) {
                adicionarCliente(pila.eliminarcliente());
            }
        }

        public void mostrarPilacliente () {

            Cliente item = null;
            if (esVacio()) {
                System.out.println("No hay items a mostrar.");
            }
            else
            {
                System.out.println("Mostrando la pila de elementos:");

                PilaCliente aux = new PilaCliente();
                while (!esVacio()) {
                    item = eliminarcliente();
                    aux.adicionarCliente(item);
                    item.muetracliente();
                }
                vaciar(aux);
            }
        }
    }



