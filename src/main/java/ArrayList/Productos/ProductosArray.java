package ArrayList.Productos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProductosArray {
    public static void main(String[] args) {
        List<String>productos=new ArrayList<>();
        String name;
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"====Menu===\n" +
                    "1. Agregar productos\n" +
                    "2. Contar cuantos productos hay\n" +
                    "3. Salir"));
            switch (opcion){
                case 1:
                    name=JOptionPane.showInputDialog(null,"Nombre del producto: ");
                    productos.add(name);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Hay "+productos.size()+" productos en total");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema");
                    break;
            }
        }while (opcion!=3);
    }
}
