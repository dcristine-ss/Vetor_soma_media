
package com.mycompany.exerecicio25;

import javax.swing.JOptionPane;


public class Exerecicio25 {

    public static void main(String[] args) {
       
        int [] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100,
                         110, 120, 130, 140, 150, 160, 170, 180, 190, 200};

        int soma = 0;

        
        for (int i = 0; i < 20; i++) {
            soma = soma + numeros[i];}

        double media = (double) soma / 20;

        JOptionPane.showMessageDialog(null, "Soma: " + soma);
        JOptionPane.showMessageDialog(null, "Média: " + media);
    }
}
