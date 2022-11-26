import java.util.Scanner;
public class Vehiculos {
    //Atributos
    String tipo;
    String marca;
    String modelo;
    String color;
    String placas;
    String comodidad;
    String coste_matenimiento;
    String seguridad;
    int anio_fabricacion;

    Scanner entrada = new Scanner(System.in);
    //Constructor
    public Vehiculos (){
        marca = "";
        modelo = "";
        color = "";
        placas = "";
        comodidad = "";
        coste_matenimiento = "";
        seguridad = "";
        anio_fabricacion = 0;
    }
    //Menu de opciones
    int menu(){
        int op = -1;
        while ((op < 0) && (op > 3)) {
            System.out.println("---------------------------------------");
            System.out.println("| BIENVENIDO AL REGISTRO DE VEHICULOS |");
            System.out.println("---------------------------------------");
            System.out.println("---------------------------------------------");
            System.out.println("|     1.- Registrar vehiculos               |");
            System.out.println("|                                           |");
            System.out.println("|     2.- Ver los vehiculos registrados     |");
            System.out.println("|                                           |");
            System.out.println("|     3.- Salir                             |");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            op = entrada.nextInt();
                if((op < 0) && (op > 3)){
                    System.out.println("--------------------");
                    System.out.println("| Opcion no valida |");
                    System.out.println("--------------------");
                }
            }
        return op;
    }
    //menu cantidad de vehiculos
    int menu_cantidad(){
        int op = -1;
        while((op < 0) && (op > 5)){
            System.out.println("---------------------------------------------");
            System.out.println("|  ¿Cuantos vehículos desea ingresar?       |");
            System.out.println("|  NOTA: La cantidad maxima es 5 vehiculos  |");
            System.out.println("---------------------------------------------");
            op = entrada.nextInt();
        }
        if((op < 0) && (op > 5)){
            System.out.println("--------------------");
            System.out.println("| Opcion no valida |");
            System.out.println("--------------------");
        }
        return op;
    }
    //Metodos
    public void car1 (Vehiculos datos1){
        System.out.println("Ingrese el tipo de vehiculo que va a registrar");
        datos1.setTipo(entrada.nextLine());
        System.out.println("Ingrese la marca del vehiculo");
        datos1.setMarca(entrada.nextLine());
    }
    //SETTER AND GETTER

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getComodidad() {
        return comodidad;
    }

    public void setComodidad(String comodidad) {
        this.comodidad = comodidad;
    }

    public String getCoste_matenimiento() {
        return coste_matenimiento;
    }

    public void setCoste_matenimiento(String coste_matenimiento) {
        this.coste_matenimiento = coste_matenimiento;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(int anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }
}
