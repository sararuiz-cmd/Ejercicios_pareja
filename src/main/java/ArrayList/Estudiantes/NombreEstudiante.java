package ArrayList.Estudiantes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

public class NombreEstudiante {
    public static void main(String[] args) {
        List<String>nombres=new ArrayList<>();
        String nombre,nombre_eliminar;
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"====Menu====\n" +
                    "1. Agregar nombres\n" +
                    "2. Eliminar nombre\n" +
                    "3. Mostrar Lista\n" +
                    "4. Salir"));
            switch (opcion){
                case 1:
                    nombre=JOptionPane.showInputDialog(null,"Nombre: ");
                    nombres.add(nombre);
                    break;
                case 2:
                    nombre_eliminar=JOptionPane.showInputDialog(null,"Nombre a eliminar: ");
                    nombres.remove(nombre_eliminar);
                    JOptionPane.showMessageDialog(null,"Nombre eliminado");
                    break;
                case 3:
                    StringBuilder formato=new StringBuilder();
                    for(String nom:nombres){
                        formato.append(nom).append("\n");
                    }
                    JOptionPane.showMessageDialog(null,"===Lista====\n"+formato);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema");
                    break;

            }

        }while (opcion!=4);
    }
}
