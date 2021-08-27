/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import areadepartamental.productos.AlmacenTienda;
import banco.Banco;
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
        int op = 0, op2 = 0, op3 = 0;
        ControlTienda control = new ControlTienda();
        Banco banco=new Banco();
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
                                usuario = control.iniciarSesion(nip);
                                JOptionPane.showMessageDialog(null, "BIENVENIDO " + usuario.getNombre().toUpperCase(), "BIENVENIDA", -1);
                                do {
                                    try {
                                        op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "MI CUENTA\n"
                                                + "1.-Bancoppel\n"
                                                + "2.-Realizar Compra\n"
                                                + "3.-Salir al menu principal", "Mi Cuenta Coppel", 3));
                                        switch (op2) {
                                            case 1: { //Banco
                                                do {
                                                    try {
                                                        op3 = Integer.parseInt(JOptionPane.showInputDialog(null, "BANCOPPEL\n"
                                                                + "1.-Mi cuenta Coppel\n"
                                                                + "2.-Realizar Deposito"
                                                                + "", "BANCO", 3));
                                                        switch (op3) {
                                                            case 1: {
                                                                JOptionPane.showMessageDialog(null, usuario, "Mis datos", 1);
                                                                break;
                                                            }
                                                            case 2: {
                                                                banco.realizarDeposito(usuario);
                                                                break;
                                                            }

                                                        }
                                                    } catch (NumberFormatException e) {
                                                        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
                                                    }
                                                } while (op3 != 3);
                                                break;
                                            }
                                            case 2: { //Compras

                                                break;
                                            }
                                            case 3: {
                                                JOptionPane.showMessageDialog(null, "Saliendo al ménu principal", "Saliendo", 1);
                                                break;
                                            }
                                            default: {
                                                JOptionPane.showMessageDialog(null, "Introduce una opción valida", "Error de Opción", 2);
                                                break;
                                            }
                                        }
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
                                    }

                                } while (op2 != 3);

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
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
            }
        } while (op != 4);

    }
    /*static int seleccionarOpcion(){
     int x=JOptionPane.showOptionDialog(null, "Retiro","Realizando Retiro", i, i1, null, os, null)
     }*/

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
