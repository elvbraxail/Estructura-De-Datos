package PiladeClientes;

public class Cliente {
    private String Nombre;
    private String Apellido;
    private int Edad ;
    private String Direccion ;
    private String Genero;

    public Cliente (String nombre, String apellido, int edad , String direccion, String genero) {

        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Edad = edad;
        this.Direccion = direccion;
        this.Genero = genero;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }




    public void muetracliente(){

        System.out.println("Nombre de los Clientes");

        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " +getEdad());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Genero: " + getGenero());

        System.out.println();



    }





}
