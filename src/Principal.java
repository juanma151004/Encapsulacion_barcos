import java.util.HashMap;

import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {
	
        HashMap<Integer, Mascotas1> mapaMascotas = new HashMap<>();

        int rep;
        int codigo = 1;

        do {
            Mascotas1 mascota = new Mascotas1();
            mascota.ingresar();
            mapaMascotas.put(codigo, mascota);
            codigo++;

            rep = JOptionPane.showConfirmDialog(null, "Desea ingresar otro barco?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        } while (rep == JOptionPane.YES_OPTION);

        int opcion;
        
        String mensaje;
        do {
                    
            
            mensaje="MENU DE BUSQUEDA\n";
            mensaje+="1. Consultar barco\n";
            mensaje+="2. Consultar lista de barcos\n";
            mensaje+="3. salir\n";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            switch (opcion) {
                case 1:
                    int codigoMascota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del barco"));
                    Mascotas1 mascota = mapaMascotas.get(codigoMascota);
                    if (mascota != null) {
                        System.out.println("Informacion del barco:");
                        mascota.InfoMascota();
                       
                    } else {
                        System.out.println(mascota+" no ha sido encontrada.");
                    }
                    break;
                case 2:
                    System.out.println("Lista de barcos:");
                    for (Mascotas1 m : mapaMascotas.values()) {
                        m.InfoMascota();
                        
                    }
                    break;
                case 3:
                    System.out.println("taluego");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        } while (opcion != 3);
    }
}