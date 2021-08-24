/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author CxrlosMX
 */
public interface VerificaNip {

    static String verificarNip(String nip) {
        boolean continuar = false;
        do {
            if (nip.length() == 4) {
                continuar = true;
            } else {
                JOptionPane.showMessageDialog(null, "Su NIP debe ser de 4 Digitos", "NIP no valido", 2);
                nip = JOptionPane.showInputDialog(null, "El Siguiente campo es muy importante\nIntrodusca su NIP","Solicitando Tarjeta",1);
            }

        } while (!continuar);
        return nip;

    }

}
