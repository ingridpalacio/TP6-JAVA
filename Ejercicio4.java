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

public class Ejercicio4{
    public static void main(String[] args){
        Libro[] biblioteca=new Libro[2];

        biblioteca[0]=new Libro();
        biblioteca[0].titulo="El Principito";
        biblioteca[0].paginas=200;

        biblioteca[1]=new Libro();
        biblioteca[1].titulo="Boulevard";
        biblioteca[1].paginas=350;

        for(int i=0; i<biblioteca.length; i++){
            System.out.println("---Libro "+(i+1)+"---");
            biblioteca[i].mostrarDatos();
            if(biblioteca[i].esLargo()){
                System.out.println("El libro es largo, tiene mas de 300 paginas");
            }else{
                System.out.println("El libro no es largo");
            }
        }
    }
}