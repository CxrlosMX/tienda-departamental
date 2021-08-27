/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;
import usuariotienda.Usuario;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 26/08/2021
 *
 */
public class Banco {

    //Método para realizar un deposito

    public void realizarDeposito(Usuario u) {
        int cantidad = 0;
        Object[] o = {"A.-1000$", "B.-3000$", "C.-5000$", "D.-Otra cantidad"};
        int x = JOptionPane.showOptionDialog(null, "DEPOSITO", "REALIZANDO DEPOSITO", 1, 1, null, o, null);
        if (x == 0) {
            cantidad = 1000;
        } else if (x == 1) {
            cantidad = 3000;
        } else if (x == 2) {
            cantidad = 5000;
        } else if (x == 3) {
            boolean correcto = false;
            do {
                try {

                    cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduca la cantidad del deposito", "Introduciendo cantidad", 1));
                    if (cantidad > 0) {
                        correcto = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Introduce valores positivos", "Error de valores", 0);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Introduce valores numericos", "Error de caracteres", 0);
                }
            } while (!correcto);
        }
        JOptionPane.showMessageDialog(null, "Deposito realizado con exito", "Deposito relizado", 1);
        u.setSaldo(u.getSaldo() + cantidad);
    }

}
