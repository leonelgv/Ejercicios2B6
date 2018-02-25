/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.lang.*;

/**
 *
 * @author Leonel Gonzalez Vidales
 */
public class Principal {
    public static void main(String[] args){
        double radio = 0;
        double perimetro = 0;
        double area = 0;        
        boolean esNumero = false;
        do {
            try {
                radio = Double.parseDouble(JOptionPane.showInputDialog(
                null, 
                "Ingresa el radio del circulo", 
                "Ingresando el radio",
                JOptionPane.QUESTION_MESSAGE));
                esNumero = true;
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, 
                "Tonto, escribe sólo números :P",
                "Cuidado", 
                JOptionPane.INFORMATION_MESSAGE);
                esNumero = false;
            }
        } while(esNumero != true);
        perimetro = 2 * Math.PI * radio;
        area = Math.PI * (radio * radio);
        JOptionPane.showMessageDialog(null, 
        "El perimetro es: " + perimetro + 
        "\nEl área es: " + area,
        "Resultados", 
        JOptionPane.INFORMATION_MESSAGE);        
    }
}
