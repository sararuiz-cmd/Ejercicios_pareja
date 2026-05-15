package ListOrder.Nombres;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nombres {
    public static void main(String[] args) {
        List<String>nombres=new ArrayList<>();
        String nombre;
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"===Menu==\n" +
                    "1. Agregar nombre\n" +
                    "2. Nombres ordenados\n" +
                    "3. Salir"));
            switch (opcion){
                case 1:
                    nombre=JOptionPane.showInputDialog(null,"Nombre: ");
                    nombres.add(nombre);
                    break;
                case 2:
                    Collections.sort(nombres);
                    JOptionPane.showMessageDialog(null,"===Nombres ordenados===\n"+nombres);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Saliendo...");
                    break;
            }

        }while (opcion!=3);

    }
}
