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
        JOptionPane.showMessageDialog(null, "Deposito realizado con exito " + "\nCantidad Depositada: " + cantidad + "$", "Deposito relizado", 1);
        u.setSaldo(u.getSaldo() + cantidad);
        
    }

    /*
     Método para realizar un retiro
     */
    public void realizarRetiro(Usuario u) {
        int cantidad = 0;
        double saldoDisponible = u.getSaldo();
        try {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad que desea retirar", "Retiro", 1));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Introdusca valores númericos por favor", "Error de caracteres", 0);
        }
        
        if (cantidad > 0 && cantidad <= saldoDisponible) {
            
            JOptionPane.showMessageDialog(null, "Retiro realizado con exito", "Retiro realizado", 1);
            u.setSaldo(saldoDisponible - (cantidad));
        } else {
            JOptionPane.showMessageDialog(null, (cantidad < 0) ? "Introdusca una cantidad mayor a cero" : "Saldo insuficiente\nUsted no cuenta con suficiente saldo", "Error", 2);
        }
    }

    /*
     Método para realizar una tranferencia a otra cuenta
     */
    public void realizarTransferencia(Usuario salida, Usuario entrada) {
        int cantidad = 0;
        double saldo = salida.getSaldo();
        try {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad que desea tranferir a la cuenta de " + entrada.getNombre(), "Realizando Transferencia", 1));
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de valores", "Error", 0);
        }
        if (cantidad <= saldo && cantidad > 0) {
            JOptionPane.showMessageDialog(null, "Transferencia realizada con exito a " + entrada.getNombre(), "Transferencia realizada", 1);
            salida.setSaldo(saldo-(cantidad));
            entrada.setSaldo(entrada.getSaldo() + cantidad);
        }
        else{
        JOptionPane.showMessageDialog(null,((cantidad>saldo)?"Saldo Insuficiente para realizar la transferencia":"Introduce valores mayores a cero"), "Transferencia No realizada", 0);
        }
    }
}
