package LinkedList;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros = new LinkedList<>();
        StringBuilder formato = new StringBuilder();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        for(int i:numeros){
            formato.append(i).append("\n");
        }
        JOptionPane.showMessageDialog(null,"Números en la LinkedList: \n"+formato);
    }
}
