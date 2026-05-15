package ArrayList.Numeros;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ListNumeros {
    public static void main(String[] args) {
        List<Integer> numeros=new ArrayList<>();
        StringBuilder formato=new StringBuilder();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        for(int i:numeros){
            formato.append(i).append("\n");
        }
        JOptionPane.showMessageDialog(null,"Numeros en el arreglo: \n"+formato);

    }
}
