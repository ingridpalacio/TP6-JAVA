class Libro{
    String titulo;
    int paginas;   

    void mostrarDatos(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Paginas: " + paginas);
    }
}

public class Principal{
    public static void main(String[] args){
        Libro libro1 = new Libro();
        libro1.titulo = "El Principito";
        libro1.paginas = 200;

        Libro libro2 = new Libro();
        libro2.titulo="Boulevard";
        libro2.paginas=350;

        System.out.println("---Libro 1---");
        libro1.mostrarDatos();

        System.out.println("---Libro 2---");
        libro2.mostrarDatos();
    }
}