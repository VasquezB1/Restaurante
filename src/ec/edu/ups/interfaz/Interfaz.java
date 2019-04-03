/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import ec.edu.ups.clases.Bebida;
import ec.edu.ups.clases.Caja;
import ec.edu.ups.clases.Mesa;
import ec.edu.ups.clases.Mesero;
import ec.edu.ups.clases.Parqueadero;
import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
////////////////////////////////////////////////////////////////////////////////

        //Creacion del menú
        Scanner n = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("********** Bienvenido Trabajo Programación Aplicada  *********");
            System.out.println("-----          Universidad Politecnica Salesiana        -----");
            System.out.println("-----                   Byron Vásquez            -----");
            System.out.println("1. Clase Parqueadero Opción 1");
            System.out.println("2. Clase Mesa Opción 2");
            System.out.println("3. Clase Mesero Opción 3");
            System.out.println("4. Clase Bebida Opción 4 ");
            System.out.println("5. Clase Caja Opción 5");
            System.out.println("6. Salir");
            System.out.println("*****  Selecciona una de las Clases que desees imprimir  *****");
            opcion = n.nextInt();

////////////////////////////////////////////////////////////////////////////////        
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la clase Parqueadero");
////////////////////////////////////////////////////////////////////////////////

                    //Creación del objeto (instanciado).
                    Parqueadero parqueadero = new Parqueadero();

                    //Seteo o especificación de los datos del objeto parqueadero.        
                    parqueadero.setCliente(2);
                    parqueadero.setMarca("Chevrolet");
                    parqueadero.setColor("Blanco");
                    System.out.println("Clase:*** PARQUEADERO ***");
                    System.out.println("OBJETOS:");

                    //Recuperación de los valores.
                    int clie = parqueadero.getCliente();
                    System.out.println("\t Número de Cliente: " + clie);
                    String mar = parqueadero.getMarca();
                    System.out.println("\t La marca del Vehiculo es: " + mar);
                    String col = parqueadero.getColor();
                    System.out.println("\t El color del vehiculo es: " + col);

                    //Mostrar valores a partir del método ToString.
                    System.out.println("MÉTODO TO STRING:");
                    System.out.println("\t " + parqueadero);
                    System.out.println("********************************************************");
                    break;
////////////////////////////////////////////////////////////////////////////////            
                case 2:
                    System.out.println("Has seleccionado la clase Mesa");
////////////////////////////////////////////////////////////////////////////////

                    //Creación del objeto (instanciado).
                    Mesa mesa = new Mesa();

                    //Seteo o especificación de los datos del objeto MesaRestaurante
                    mesa.setMesaLibre("Si");
                    mesa.setCodigo(23448);
                    mesa.setMesaDañda(5);
                    System.out.println("Clase:*** MESA ***");
                    System.out.println("OBJETOS:");

                    //Recuperación de los valores.
                    String mes = mesa.getMesaLibre();
                    System.out.println("\t ¿Hay mesas libres?: " + mes);
                    int cod = mesa.getCodigo();
                    System.out.println("\t El codigo de la mesa es: " + cod);
                    int dañ = mesa.getMesaDañada();
                    System.out.println("\t Hay: " + dañ + " mesas dañadas");

                    //Mostrar valores a partir del método ToString.
                    System.out.println("MÉTODO TO STRING:");
                    System.out.println("\t " + mesa);
                   System.out.println("********************************************************");
                    break;
////////////////////////////////////////////////////////////////////////////////  
                case 3:
                    System.out.println("Has seleccionado la clase Mesero");
////////////////////////////////////////////////////////////////////////////////   

                    //Creación del objeto (instanciado).
                    Mesero mesero = new Mesero();

                    //Seteo o especificación de los datos del objeto parqueadero.
                    mesero.setNombre("Byron");
                    mesero.setTurno("Dia");
                    mesero.setAsistente("Carlos");
                    System.out.println("Clase:*** MESERO ***");
                    System.out.println("OBJETOS:");

                    //Recuperación de los valores.
                    String nomb = mesero.getNombre();
                    System.out.println("\t Nombre de Mesero es: " + nomb);
                    String asis = mesero.getAsitente();
                    System.out.println("\t El nombre del Asistente es: " + asis);
                    String tur = mesero.getTurno();
                    System.out.println("\t El Turno del mesero es de: " + tur);

                    //Mostrar valores a partir del método ToString.
                    System.out.println("MÉTODO TO STRING:");
                    System.out.println("\t " + mesero);
                    System.out.println("********************************************************");
                    break;
////////////////////////////////////////////////////////////////////////////////     
                case 4:
                    System.out.println("Has seleccionado la clase Bebida");
////////////////////////////////////////////////////////////////////////////////   

                    //Creación del objeto (instanciado).
                    Bebida bebida = new Bebida();

                    //Seteo o especificación de los datos del objeto MesaRestaurante
                    bebida.setSabor("FANTA");
                    bebida.setExpirada(21);
                    bebida.setPorLlegar(30);
                    System.out.println("Clase:*** BEBIDA ***");
                    System.out.println("OBJETOS:");

                    //Recuperación de los valores.
                    String sab = bebida.getSabor();
                    System.out.println("\t El sabor que pidio es: " + sab);
                    int exp = bebida.getExpirada();
                    System.out.println("\t Se encuentran expiradas: " + exp + " bebidas");
                    int lle = bebida.getPorLlegar();
                    System.out.println("\t Estan por llegar: " + lle + " bebidas");

                    //Mostrar valores a partir del método ToString.
                    System.out.println("MÉTODO TO STRING:");
                    System.out.println("\t " + bebida);
                   System.out.println("********************************************************");
                    break;
////////////////////////////////////////////////////////////////////////////////  
                case 5:
                    System.out.println("Has seleccionado la clase Bebida");
////////////////////////////////////////////////////////////////////////////////                    
                    //Creación del objeto (instanciado).
                    Caja caja = new Caja();

                    //Seteo o especificación de los datos del objeto MesaRestaurante
                    caja.setDinero(25.30);
                    caja.setCambio(1.30);
                    caja.setPropina(0.60);
                    System.out.println("Clase:*** CAJA ***");
                    System.out.println("OBJETOS:");

                    //Recuperación de los valores.
                    double din = caja.getDinero();
                    System.out.println("\t El total de su pedido es de: " + " $" + din);
                    double cam = caja.getCambio();
                    System.out.println("\t Su cambio es: " + " $" + cam);
                    double pro = caja.getPropina();
                    System.out.println("\t Usuario dio de propina: " + " $" + pro);

                    //Mostrar valores a partir del método ToString.
                    System.out.println("MÉTODO TO STRING:");
                    System.out.println("\t " + caja);
                    System.out.println("********************************************************");
                    break;
////////////////////////////////////////////////////////////////////////////////     
                case 6:
                    salir = true;
                default:
                    System.out.println("*****  Haz elegido salir  *****");
                    System.out.println("*****  GRACIAS  *****");

            }
        }
    }
}
