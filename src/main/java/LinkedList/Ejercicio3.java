package LinkedList;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> productos = new LinkedList<>();
        StringBuilder formato = new StringBuilder();

        // Agregar productos a la LinkedList
        productos.add("Laptop");
        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");
        productos.add("Auriculares");

        // Mostrar productos antes de eliminar
        formato.append("Productos antes de eliminar:\n");
        for(String producto : productos) {
            formato.append("- ").append(producto).append("\n");
        }

        // Eliminar un producto específico
        String productoAEliminar = "Mouse";
        productos.remove(productoAEliminar);

        formato.append("\nProductos después de eliminar '").append(productoAEliminar).append("':\n");
        for(String producto : productos) {
            formato.append("- ").append(producto).append("\n");
        }

        JOptionPane.showMessageDialog(null, formato.toString());
    }
}
