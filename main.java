public class main {
    public static void main(String[] args){
        Vehiculos registros = new Vehiculos();
        Vehiculos vehiculo1 = new Vehiculos();
        Vehiculos vehiculo2 = new Vehiculos();
        Vehiculos vehiculo3 = new Vehiculos();
        Vehiculos vehiculo4 = new Vehiculos();
        Vehiculos vehiculo5 = new Vehiculos();
        //
        Vehiculos menu_registro = new Vehiculos();
        Vehiculos menu_de_opciones = new Vehiculos();
        //
        int op_registro = 0;
        boolean salir = false;
        //
        while(!salir){
            switch(menu_de_opciones.menu()){
                case 1:
                    op_registro = menu_registro.menu_cantidad();
                    System.out.println("");
                    System.out.println("REGISTRE SUS VECHICULOS A CONTINUACION");
                    System.out.println("");
                    if(op_registro >= 1){
                        System.out.println("-----------------------------");
                        System.out.println("| Registro del 1er vehiculo |");
                        System.out.println("-----------------------------");
                        vehiculo1.car1(vehiculo1);
                    }
                    if(op_registro >= 2){
                        System.out.println("-----------------------------");
                        System.out.println("| Registro del 2do vehiculo |");
                        System.out.println("-----------------------------");
                        vehiculo2.car2(vehiculo2);
                    }
                    if(op_registro >= 3){
                        System.out.println("-----------------------------");
                        System.out.println("| Registro del 3er vehiculo |");
                        System.out.println("-----------------------------");
                        vehiculo3.car3(vehiculo3);
                    }
                    if(op_registro >= 4){
                        System.out.println("-----------------------------");
                        System.out.println("| Registro del 4to vehiculo |");
                        System.out.println("-----------------------------");
                        vehiculo4.car4(vehiculo4);
                    }
                    if(op_registro >= 5){
                        System.out.println("-----------------------------");
                        System.out.println("| Registro del 5to vehiculo |");
                        System.out.println("-----------------------------");
                        vehiculo5.car5(vehiculo5);
                    }
                    break;
                case 2:
                    System.out.println("---------------------------------------");
                    System.out.println("| VEHICULOS REGISTRADOS EN EL SISTEMA |");
                    System.out.println("---------------------------------------");
                    registros.impresion(vehiculo1,vehiculo2,vehiculo3,vehiculo4,vehiculo5,op_registro);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("-------------------");
                    System.out.println("| OPCION NO VALIDA|");
                    System.out.println("-------------------");
            }
        }//fin bucle
        System.out.println("-------------------------");
        System.out.println("| GRACIAS VUELVA PRONTO |");
        System.out.println("-------------------------");
    }
}
