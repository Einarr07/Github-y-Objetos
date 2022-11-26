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
        tipo = "";
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
        while ((op < 0) || (op > 3)) {
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

                if((op < 0) || (op > 3)){
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
        while((op < 0) || (op > 5)){
            System.out.println("---------------------------------------------");
            System.out.println("|  NOTA: La cantidad maxima es 5 vehiculos  |");
            System.out.println("---------------------------------------------");
            System.out.print("¿Cuantos vehículos desea ingresar? ");
            op = entrada.nextInt();

            if((op < 0) || (op > 5)){
                System.out.println("--------------------");
                System.out.println("| Opcion no valida |");
                System.out.println("--------------------");
            }
        }
        return op;
    }
    //Metodos
    public void car1 (Vehiculos datos1){
        System.out.println("Ingrese el tipo de vehiculo que va a registrar");
        datos1.setTipo(entrada.nextLine());
        System.out.println("Ingrese la marca del vehiculo");
        datos1.setMarca(entrada.nextLine());
        System.out.println("Ingrese el modelo del vehiculo");
        datos1.setModelo(entrada.nextLine());
        System.out.println("Ingrese el color del vehiculo");
        datos1.setColor(entrada.nextLine());
        System.out.println("Ingrese las placas del vehiculo");
        datos1.setPlacas(entrada.nextLine());
        System.out.println("Ingrese comodidad del vehiculo");
        datos1.setComodidad(entrada.nextLine());
        System.out.println("Ingrese el costo del mantenimiento del vehiculo");
        datos1.setCoste_matenimiento(entrada.nextLine());
        System.out.println("Ingrese el nivel de seguridad del vehiculo");
        datos1.setSeguridad(entrada.nextLine());
        System.out.println("Ingrese el año de fabricacion del vehiculo");
        datos1.setAnio_fabricacion(entrada.nextInt());
    }
    public void car2 (Vehiculos datos2){
        System.out.println("Ingrese el tipo de vehiculo que va a registrar");
        datos2.setTipo(entrada.nextLine());
        System.out.println("Ingrese la marca del vehiculo");
        datos2.setMarca(entrada.nextLine());
        System.out.println("Ingrese el modelo del vehiculo");
        datos2.setModelo(entrada.nextLine());
        System.out.println("Ingrese el color del vehiculo");
        datos2.setColor(entrada.nextLine());
        System.out.println("Ingrese las placas del vehiculo");
        datos2.setPlacas(entrada.nextLine());
        System.out.println("Ingrese comodidad del vehiculo");
        datos2.setComodidad(entrada.nextLine());
        System.out.println("Ingrese el costo del mantenimiento del vehiculo");
        datos2.setCoste_matenimiento(entrada.nextLine());
        System.out.println("Ingrese el nivel de seguridad del vehiculo");
        datos2.setSeguridad(entrada.nextLine());
        System.out.println("Ingrese el año de fabricacion del vehiculo");
        datos2.setAnio_fabricacion(entrada.nextInt());
    }
    public void car3 (Vehiculos datos3){
        System.out.println("Ingrese el tipo de vehiculo que va a registrar");
        datos3.setTipo(entrada.nextLine());
        System.out.println("Ingrese la marca del vehiculo");
        datos3.setMarca(entrada.nextLine());
        System.out.println("Ingrese el modelo del vehiculo");
        datos3.setModelo(entrada.nextLine());
        System.out.println("Ingrese el color del vehiculo");
        datos3.setColor(entrada.nextLine());
        System.out.println("Ingrese las placas del vehiculo");
        datos3.setPlacas(entrada.nextLine());
        System.out.println("Ingrese comodidad del vehiculo");
        datos3.setComodidad(entrada.nextLine());
        System.out.println("Ingrese el costo del mantenimiento del vehiculo");
        datos3.setCoste_matenimiento(entrada.nextLine());
        System.out.println("Ingrese el nivel de seguridad del vehiculo");
        datos3.setSeguridad(entrada.nextLine());
        System.out.println("Ingrese el año de fabricacion del vehiculo");
        datos3.setAnio_fabricacion(entrada.nextInt());
    }
    public void car4 (Vehiculos datos4){
        System.out.println("Ingrese el tipo de vehiculo que va a registrar");
        datos4.setTipo(entrada.nextLine());
        System.out.println("Ingrese la marca del vehiculo");
        datos4.setMarca(entrada.nextLine());
        System.out.println("Ingrese el modelo del vehiculo");
        datos4.setModelo(entrada.nextLine());
        System.out.println("Ingrese el color del vehiculo");
        datos4.setColor(entrada.nextLine());
        System.out.println("Ingrese las placas del vehiculo");
        datos4.setPlacas(entrada.nextLine());
        System.out.println("Ingrese comodidad del vehiculo");
        datos4.setComodidad(entrada.nextLine());
        System.out.println("Ingrese el costo del mantenimiento del vehiculo");
        datos4.setCoste_matenimiento(entrada.nextLine());
        System.out.println("Ingrese el nivel de seguridad del vehiculo");
        datos4.setSeguridad(entrada.nextLine());
        System.out.println("Ingrese el año de fabricacion del vehiculo");
        datos4.setAnio_fabricacion(entrada.nextInt());
    }
    public void car5 (Vehiculos datos5){
        System.out.println("Ingrese el tipo de vehiculo que va a registrar");
        datos5.setTipo(entrada.nextLine());
        System.out.println("Ingrese la marca del vehiculo");
        datos5.setMarca(entrada.nextLine());
        System.out.println("Ingrese el modelo del vehiculo");
        datos5.setModelo(entrada.nextLine());
        System.out.println("Ingrese el color del vehiculo");
        datos5.setColor(entrada.nextLine());
        System.out.println("Ingrese las placas del vehiculo");
        datos5.setPlacas(entrada.nextLine());
        System.out.println("Ingrese comodidad del vehiculo");
        datos5.setComodidad(entrada.nextLine());
        System.out.println("Ingrese el costo del mantenimiento del vehiculo");
        datos5.setCoste_matenimiento(entrada.nextLine());
        System.out.println("Ingrese el nivel de seguridad del vehiculo");
        datos5.setSeguridad(entrada.nextLine());
        System.out.println("Ingrese el año de fabricacion del vehiculo");
        datos5.setAnio_fabricacion(entrada.nextInt());
    }
    public void impresion (Vehiculos datos1, Vehiculos datos2, Vehiculos datos3, Vehiculos datos4, Vehiculos datos5, int op_registro){

        if(op_registro >= 1) {
            System.out.println("--------------------------");
            System.out.println("| Datos del 1er vehiculo |");
            System.out.println("--------------------------");
            System.out.println("Tipo: " + datos1.getTipo());
            System.out.println("Marca: " + datos1.getMarca());
            System.out.println("Modelo: " + datos1.getModelo());
            System.out.println("Color: " + datos1.getColor());
            System.out.println("Placas: " + datos1.getPlacas());
            System.out.println("Comodidad: " + datos1.getComodidad());
            System.out.println("Costo Mantenimiento: " + datos1.getCoste_matenimiento());
            System.out.println("Nivel de seguridad: " + datos1.getSeguridad());
            System.out.println("Año de fabricacion: " + datos1.getAnio_fabricacion());
        }
        if(op_registro >= 2) {
            System.out.println("--------------------------");
            System.out.println("| Datos del 2do vehiculo |");
            System.out.println("--------------------------");
            System.out.println("Tipo: " + datos2.getTipo());
            System.out.println("Marca: " + datos2.getMarca());
            System.out.println("Modelo: " + datos2.getModelo());
            System.out.println("Color: " + datos2.getColor());
            System.out.println("Placas: " + datos2.getPlacas());
            System.out.println("Comodidad: " + datos2.getComodidad());
            System.out.println("Costo Mantenimiento: " + datos2.getCoste_matenimiento());
            System.out.println("Nivel de seguridad: " + datos2.getSeguridad());
            System.out.println("Año de fabricacion: " + datos2.getAnio_fabricacion());
        }
        if(op_registro >= 3) {
            System.out.println("--------------------------");
            System.out.println("| Datos del 3er vehiculo |");
            System.out.println("--------------------------");
            System.out.println("Tipo: " + datos3.getTipo());
            System.out.println("Marca: " + datos3.getMarca());
            System.out.println("Modelo: " + datos3.getModelo());
            System.out.println("Color: " + datos3.getColor());
            System.out.println("Placas: " + datos3.getPlacas());
            System.out.println("Comodidad: " + datos3.getComodidad());
            System.out.println("Costo Mantenimiento: " + datos3.getCoste_matenimiento());
            System.out.println("Nivel de seguridad: " + datos3.getSeguridad());
            System.out.println("Año de fabricacion: " + datos3.getAnio_fabricacion());
        }
        if(op_registro >= 4) {
            System.out.println("--------------------------");
            System.out.println("| Datos del 4to vehiculo |");
            System.out.println("--------------------------");
            System.out.println("Tipo: " + datos4.getTipo());
            System.out.println("Marca: " + datos4.getMarca());
            System.out.println("Modelo: " + datos4.getModelo());
            System.out.println("Color: " + datos4.getColor());
            System.out.println("Placas: " + datos4.getPlacas());
            System.out.println("Comodidad: " + datos4.getComodidad());
            System.out.println("Costo Mantenimiento: " + datos4.getCoste_matenimiento());
            System.out.println("Nivel de seguridad: " + datos4.getSeguridad());
            System.out.println("Año de fabricacion: " + datos4.getAnio_fabricacion());
        }
        if(op_registro >= 5) {
            System.out.println("--------------------------");
            System.out.println("| Datos del 5to vehiculo |");
            System.out.println("--------------------------");
            System.out.println("Tipo: " + datos5.getTipo());
            System.out.println("Marca: " + datos5.getMarca());
            System.out.println("Modelo: " + datos5.getModelo());
            System.out.println("Color: " + datos5.getColor());
            System.out.println("Placas: " + datos5.getPlacas());
            System.out.println("Comodidad: " + datos5.getComodidad());
            System.out.println("Costo Mantenimiento: " + datos5.getCoste_matenimiento());
            System.out.println("Nivel de seguridad: " + datos5.getSeguridad());
            System.out.println("Año de fabricacion: " + datos5.getAnio_fabricacion());
        }
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
