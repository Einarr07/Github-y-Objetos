public class main {
    public static void main(String[] args){
        Vehiculos vehiculo1 = new Vehiculos();

        //
        Vehiculos menu_registro = new Vehiculos();
        Vehiculos menu_de_opciones = new Vehiculos();
        int op_registro = 0;
        boolean salir = false;

        while (!salir){
            switch(menu_de_opciones.menu()){
                case 1:
                    op_registro = menu_registro.menu_cantidad();
                    System.out.println("REGISTRE SUS VECHICULOS A CONTINUACION");
                    if(op_registro == 1){
                        vehiculo1.car1(vehiculo1);
                    }
                    break;
                case 2:
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
