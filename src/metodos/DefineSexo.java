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
public interface DefineSexo {
     static char defineSexo() {
        Object[] lista = {'H', 'M'};
        int x = (JOptionPane.showOptionDialog(null, "SEXO", "Solicitando Tarjeta", JOptionPane.DEFAULT_OPTION, 1, null, lista, null));
        if (x == 0) {
            return 'H';
        }
        return 'M';
    }
    
}
