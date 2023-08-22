import java.util.Scanner;

/**
 * La clase Program contiene el método principal que ejecuta la lógica del programa de reservas de habitaciones.
 */
public class Program {
    
    /**
     * Método principal que ejecuta la lógica del programa.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        Reserva[] wait_list = new Reserva[5];
        Habitacion estandar = new Habitacion("estandar",3,150,3,"Regular");
        Habitacion deluxe = new Habitacion("deluxe",3,300,4,"Frecuente");
        Habitacion suit = new Habitacion("suit",3,500,6,"VIP");
        boolean cicle = true;

        while(cicle){
            System.out.println("Elija el numero de la opcion que desea hacer:");
            System.out.println("1.Generar reserva:");
            System.out.println("2.Asignar reserva:");
            System.out.println("3.Mostrar reservas:");
            System.out.println("4.Mostrar disponibilidad:");
            System.out.println("5.Salir");

            int opt = myInput.nextInt();

            switch(opt) {
                case 1:{
                    System.out.println("Ingrese el nombre al que va estar la reserva:");
                    String nombre = myInput.next();
                    System.out.println("Ingrese el correo para la reserva:");
                    String email = myInput.next();
                    System.out.println("Ingrese la cantidad de noches que se alojara:");
                    int noches = myInput.nextInt();
                    System.out.println("Ingrese cuantas veces nos ha visitado con anterioridad:");
                    int visitas = myInput.nextInt();
                    System.out.println("Ingrese la cantidad de personas que alojara: ");
                    int personas = myInput.nextInt();
                    int cont = 0;
                    for(int index = 0; index < wait_list.length; index++){
                        if(wait_list[index] == null){
                            cont++;
                            wait_list[index] = new Reserva(nombre, email, noches, visitas, personas);
                            System.out.println("Se ha realizado la reserva con exito ");
                            break;
                        }
                    }
                    if(cont == 0){
                        System.out.println("No hay espacios disponibles en la lista de espera");
                    }
                    break;

                }
                case 2:{
                    System.out.println("Ingrese el ID(indice) de la reserva:");
                    int ID = myInput.nextInt();
                    if(ID<wait_list.length){
                        System.out.println("Ingrese el nombre de tipo de habitacion donde desea asignarlo:");
                        String type  = myInput.next();
                        String reservaTipo = wait_list[ID].getTipo();
                        if(wait_list[ID] != null){
                            switch(type){
                                case "estandar":{
                                    if(estandar.getDisponibilidad() != 0){
                                        if(reservaTipo == "VIP" || reservaTipo == "Frecuente" || reservaTipo == "Regular"){
                                            if(estandar.getCapacidad() >= wait_list[ID].getPersonas()){
                                                float caja = wait_list[ID].getNoches() * estandar.getPPN();
                                                System.out.println("Se ha realizado con exito la asigncion de reserva, debe pagar: Q" + caja );
                                                wait_list[ID] = null;
                                                estandar.setDisponibilidad(estandar.getDisponibilidad()-1);
                                            }else{
                                                System.out.println("La capacidad no es adecuada para sus requisitos");
                                                break;
                                            }
                                        }else{
                                            System.out.println("No es un tipo de cliente admitido");
                                            break;
                                        }
                                    }else{
                                        System.out.println("No hay habitaciones disponibles");
                                        break;
                                    }
                                    break;
                                }
                                case "deluxe":{
                                    if(deluxe.getDisponibilidad() != 0){
                                        if(reservaTipo == "VIP" || reservaTipo == "Frecuente"){
                                            if(deluxe.getCapacidad() >= wait_list[ID].getPersonas()){
                                                float caja = wait_list[ID].getNoches() * deluxe.getPPN();
                                                System.out.println("Se ha realizado con exito la asigncion de reserva, debe pagar: Q" + caja );
                                                wait_list[ID] = null;
                                                deluxe.setDisponibilidad(deluxe.getDisponibilidad()-1);
                                            }else{
                                                System.out.println("La capacidad no es adecuada para sus requisitos");
                                                break;
                                            }
                                        }else{
                                            System.out.println("No es un tipo de cliente admitido");
                                            break;
                                        }
                                    }else{
                                        System.out.println("No hay habitaciones disponibles");
                                        break;
                                    }
                                    break;
                                }
                                case "suit":{
                                    if(suit.getDisponibilidad() != 0){
                                        if(reservaTipo == "VIP"){
                                            if(suit.getCapacidad() >= wait_list[ID].getPersonas()){
                                                float caja = wait_list[ID].getNoches() * suit.getPPN();
                                                System.out.println("Se ha realizado con exito la asigncion de reserva, debe pagar: Q" + caja );
                                                wait_list[ID] = null;
                                                suit.setDisponibilidad(suit.getDisponibilidad()-1);
                                            }else{
                                                System.out.println("La capacidad no es adecuada para sus requisitos");
                                                break;
                                            }
                                        }else{
                                            System.out.println("No es un tipo de cliente admitido");
                                            break;
                                        }
                                    }else{
                                        System.out.println("No hay habitaciones disponibles");
                                        break;
                                    }
                                    break;
                                }
                            }
                        }else{
                            System.out.println("No hay ninguna reservacion con este ID");
                        }
                    }else{
                        System.out.println("No hay ninguna reservacion con este ID");
                    }
                }
                case 3:{
                    for(int index = 0; index < wait_list.length; index++){
                        if(wait_list[index] != null){
                        System.out.println("ID: " + index + ", Nombre: " + wait_list[index].getNombre() + ", Tipo: " + wait_list[index].getTipo() + ", Personas: " +wait_list[index].getPersonas());
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("Tipo: Estandar, Tipo cliente: " + estandar.getTcliente() + ", Disponibilidad: " +  estandar.getDisponibilidad() + " Capacidad: " + estandar.getCapacidad());
                    System.out.println("Tipo: Deluxe, Tipo cliente: " + deluxe.getTcliente() + ", Disponibilidad: " +  deluxe.getDisponibilidad() + " Capacidad: " + deluxe.getCapacidad());
                    System.out.println("Tipo: Suit, Tipo cliente: " + suit.getTcliente() + ", Disponibilidad: " +  suit.getDisponibilidad() + " Capacidad: " + suit.getCapacidad());
                }
                default:{
                    cicle = false;
                }
            }
        }
        myInput.close();
    }

}
