package LinkedList;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> nombres = new LinkedList<>();
        StringBuilder formato = new StringBuilder();

        // Agregar nombres al final
        nombres.add("Carlos");
        nombres.add("María");
        nombres.add("Luis");

        // Agregar nombre al inicio (posición 0)
        nombres.add(0, "Ana");

        // Agregar nombre al final explícitamente
        nombres.add("Pedro");

        // Iterar y mostrar todos los nombres
        for(String nombre : nombres) {
            formato.append(nombre).append("\n");
        }

        JOptionPane.showMessageDialog(null, "Nombres en la LinkedList: \n" + formato);
    }
}
