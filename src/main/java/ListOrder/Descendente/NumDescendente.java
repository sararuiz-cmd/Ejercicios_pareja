package ListOrder.Descendente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumDescendente {
    public static void main(String[] args) {
        List<Integer> numeros=new ArrayList<>();
        int opcion,num;
        do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog(null,"===Menu====\n" +
                    "1. Agregar numero\n" +
                    "2. Ordenar mayor a menor\n" +
                    "3. Salir"));
            switch (opcion){
                case 1:
                    num=Integer.parseInt(JOptionPane.showInputDialog(null,"num: "));
                    numeros.add(num);
                    break;
                case 2:
                    Collections.sort(numeros,Collections.reverseOrder());
                    JOptionPane.showMessageDialog(null,"==Lista ordenada===\n"+ numeros);

            }

        }while (opcion!=3);

    }
}
