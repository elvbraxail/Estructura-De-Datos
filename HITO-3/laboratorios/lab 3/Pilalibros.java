package Libro;

public class Pilalibros {

    private String autor;

    private int numeroPag;

    private double precio ;

    private String Titulo;

    private String categoria ;


    public Pilalibros (String autor, int numeroPag, double precio, String titulo, String categoria) {
        this.autor = autor;
        this.numeroPag = numeroPag;
        this.precio = precio;
        Titulo = titulo;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrar_libro(){

        System.out.println("mostrando libro ");
        System.out.print("Nombre: "+ autor);
        System.out.print("Nrmo de pag : "+ numeroPag);
        System.out.print("Precio : "+ precio);
        System.out.print("Titulo : "+ Titulo);
        System.out.print("categoria : "+ categoria);

        System.out.println();




    }
}
