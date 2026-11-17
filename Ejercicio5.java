import java.util.Scanner;

class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double[] pesos = new double[3];

    public Mascota(String n, String e, int ed, double[] p) {
        this.nombre = n;
        this.especie = e;
        this.edad = 0;
        setEdad(ed);

        for(int i = 0; i < pesos.length; i++) {
            this.pesos[i] = p[i];
        }
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setEdad(int ed) {
        if(ed >= 0) {
            this.edad = ed;
        } else {
            System.out.println("La edad no puede ser negativa");
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void modificarPeso(int posicion, double p) {
        if(posicion >= 1 && posicion <= pesos.length) {
            if(p > 0) {
                this.pesos[posicion - 1] = p;
                System.out.println("Peso modificado correctamente");
            } else {
                System.out.println("El peso debe ser positivo");
            }
        } else {
            System.out.println("Posicion no valida");
        }
    }

    public double promedioPesos() {
        double suma = 0;

        for(int i = 0; i < pesos.length; i++) {
            suma += pesos[i];
        }

        double promedio = suma / pesos.length;
        return promedio;
    }

    public boolean esAdulto() {
        return this.edad >= 2;
    }

    public void mostrarDatos() {
        System.out.println("Datos de la mascota: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Pesos en las ultimas 3 consultas: ");

        for(int i = 0; i < pesos.length; i++) {
            System.out.println("Consulta " + (i + 1) + ": " + this.pesos[i] + " Kg");
        }
    }
}

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Mascota miMascota = null;

        int opcion;

        do {

            System.out.println("========== VETERINARIA ==========");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Mostrar datos de la mascota");
            System.out.println("3. Modificar nombre");
            System.out.println("4. Modificar edad");
            System.out.println("5. Modificar un peso");
            System.out.println("6. Calcular promedio de pesos");
            System.out.println("7. Verificar si es adulta");
            System.out.println("0. Salir");
            System.out.println("=================================");
            System.out.println("Ingrese una opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch(opcion) {

                case 1:

                    System.out.println("Ingrese el nombre de la mascota: ");
                    String nombre = entrada.nextLine();

                    System.out.println("Ingrese la especie de la mascota: ");
                    String especie = entrada.nextLine();

                    int edad;

                    do {
                        System.out.println("Ingrese la edad de la mascota: ");
                        edad = entrada.nextInt();

                        if(edad < 0) {
                            System.out.println("La edad no puede ser negativa");
                        }

                    } while(edad < 0);

                    double[] pesosIniciales = new double[3];

                    for(int i = 0; i < pesosIniciales.length; i++) {

                        do {
                            System.out.println("Ingrese el peso de la mascota en la consulta " + (i + 1) + ": ");
                            pesosIniciales[i] = entrada.nextDouble();

                            if(pesosIniciales[i] <= 0) {
                                System.out.println("El peso debe ser positivo");
                            }

                        } while(pesosIniciales[i] <= 0);

                    }

                    miMascota = new Mascota(nombre, especie, edad, pesosIniciales);

                    System.out.println("Mascota registrada exitosamente");

                    break;

                case 2:

                    if(miMascota != null) {
                        miMascota.mostrarDatos();
                    } else {
                        System.out.println("Error: Primero debe registrar una mascota");
                    }

                    break;

                case 3:

                    if(miMascota != null) {

                        System.out.println("Ingrese el nuevo nombre de la mascota: ");
                        String nuevoNombre = entrada.nextLine();

                        miMascota.setNombre(nuevoNombre);

                        System.out.println("Nombre modificado exitosamente");

                    } else {
                        System.out.println("Error: Primero debe registrar una mascota");
                    }

                    break;

                case 4:

                    if(miMascota != null) {

                        int nuevaEdad;

                        do {
                            System.out.println("Ingrese la nueva edad de la mascota: ");
                            nuevaEdad = entrada.nextInt();

                            if(nuevaEdad < 0) {
                                System.out.println("La edad no puede ser negativa");
                            }

                        } while(nuevaEdad < 0);

                        miMascota.setEdad(nuevaEdad);

                        System.out.println("Edad modificada exitosamente");

                    } else {
                        System.out.println("Error: Primero debe registrar una mascota");
                    }

                    break;

                case 5:

                    if(miMascota != null) {

                        System.out.println("Ingrese la posicion del peso que desea modificar (1, 2 o 3): ");
                        int posicion = entrada.nextInt();

                        System.out.println("Ingrese el nuevo peso: ");
                        double nuevoPeso = entrada.nextDouble();

                        miMascota.modificarPeso(posicion, nuevoPeso);

                    } else {
                        System.out.println("Error: Primero debe registrar una mascota");
                    }

                    break;

                case 6:

                    if(miMascota != null) {

                        System.out.println("El promedio de los pesos es: " + miMascota.promedioPesos());

                    } else {
                        System.out.println("Error: Primero debe registrar una mascota");
                    }

                    break;

                case 7:

                    if(miMascota != null) {

                        if(miMascota.esAdulto()) {
                            System.out.println("La mascota es adulta");
                        } else {
                            System.out.println("La mascota no es adulta");
                        }

                    } else {
                        System.out.println("Error: Primero debe registrar una mascota");
                    }

                    break;

                case 0:

                    System.out.println("Saliendo del programa...");

                    break;

                default:

                    System.out.println("Opcion no valida");

                    break;

            }

        } while(opcion != 0);

        entrada.close();
    }
}
