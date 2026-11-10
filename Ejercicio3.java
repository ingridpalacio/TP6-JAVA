class Libro{
    String titulo;
    int paginas;   

    void mostrarDatos(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Paginas: " + paginas);
    }

    boolean esLargo(){
        return paginas > 300;
    }
}

public class Ejercicio3{
    public static void main(String[] args){
        Libro libro1 = new Libro();
        libro1.titulo = "El Principito";
        libro1.paginas = 200;

        Libro libro2 = new Libro();
        libro2.titulo="Boulevard";
        libro2.paginas=350;

        System.out.println("---Libro 2---");
        libro1.mostrarDatos();
        if(libro1.esLargo()){
            System.out.println("El libro es largo, tiene mas de 300 paginas");
        }else{
            System.out.println("El libro no es largo");
        }

        System.out.println("---Libro 2---");
        libro2.mostrarDatos();
        if(libro2.esLargo()){
            System.out.println("El libro es largo, tiene mas de 300 paginas");
        }else{
            System.out.println("El libro no es largo");
        }
    }
}
