class Mascota{
    private String nombre;
    private String especie;
    private int edad;
    private double[] pesos = new double[3];

    public Mascota(String n, String e, int ed, double[] p){
        this.nombre=n;
        this.especie=e;
        this.edad=ed;
        this.pesos=p;
    }

    public void setNombre(String n){
        this.nombre=n;
    }

    public void setEdad(int ed){
        if(ed>=0){
            this.edad=ed;
        }else{
            System.out.println("La edad no puede ser negativa");
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void modificarPeso(int posicion, double p){
        if(posicion>=0 && posicion<pesos.length){
            if(p>0){
                this.pesos[posicion]=p;
            }else{
                System.out.println("El peso no puede ser negativo");
            }
        }else{
            System.out.println("Posicion no valida");
        }
    }

    public double promedioPesos(){
        double suma=0;
        int i;
        for(i=0; i<pesos.length; i++){
            suma+=pesos[i];
        }
        double promedio=suma/pesos.length;
        return promedio;
    }

    public boolean esAdulto(){
        return this.edad>=2;
    }

    public void mostrarDatos(){
        System.out.println("Datos de la mascota: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Pesos en las últimas 3 consultas: ");
        int i;
        for(i=0; i<pesos.length; i++){
            System.out.println("Consulta " + (i+1) + ": " + this.pesos[i] + " Kg");
        }
    }
}


