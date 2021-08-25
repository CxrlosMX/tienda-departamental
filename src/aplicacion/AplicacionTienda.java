/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import areadepartamental.productos.AlmacenTienda;
import gestiontienda.ControlTienda;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import usuariotienda.Usuario;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 24/08/2021
 *
 */
public class AplicacionTienda {

    public static void main(String[] args) {
        int op = 0, op2 = 0;
        ControlTienda control = new ControlTienda();
        AlmacenTienda almacen = new AlmacenTienda();
        String nip;
        Usuario usuario;
        //Mensaje de Bienvenida
        JOptionPane.showMessageDialog(null, "", "BIENVENIDO", -1, new ImageIcon("recursos/logo.jpg"));
        do {
            try {

                op = Integer.parseInt(JOptionPane.showInputDialog(null, "COPPEL\n"
                        + "1.-Iniciar Sesión\n"
                        + "2.-Solicitar Mi Tarjeta Coppel\n"
                        + "3.-Ver Productos\n"
                        + "4.-Salir\n", "Coppel", 3));
                switch (op) {
                    case 1: {
                        if (!control.listaVacia()) {
                            nip = JOptionPane.showInputDialog(null, "Introdusca su NIP", "Iniciando Sesión", 1);
                            if (control.iniciarSesion(nip) != null) {

                            } else {
                                JOptionPane.showMessageDialog(null, "Ningun NIP conside con la busqueda\nIntente más tarde", "Busqueda Erronea", 0);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Sin usuarios registrados\n*Solicite su tarjeta Coppel", "Lista Vacia", 2);
                        }
                        break;
                    }
                    case 2: {
                        JOptionPane.showMessageDialog(null, "", "Solicitando Tarjeta Coppel", -1, new ImageIcon("recursos/solicitar.png"));
                        usuario = control.agregarValores();
                        control.addUsuarioBanco(usuario);
                        break;
                    }
                    case 3: {

                        break;
                    }
                    case 4: {

                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Introduce una opción valida", "Error de Opción", 2);
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, e.getMessage(), "Error", 0);
            }
        } while (op != 4);

    }

}
/*
 -Iniciar Sesión
 {
 -*Mi cuenta
 -*Área de Compras
        
 }
 -Solicitar Tarjeta Coppel
 -Ver Productos{
 -*Solo Muestra los productos de cada sección
 }
 -Salir
        
 */
