/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontienda;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import metodos.DefineSexo;
import metodos.VerificaNip;
import usuariotienda.Usuario;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 23/08/2021
 *
 */
public class ControlTienda {

    private ArrayList<Usuario> listaUsuarios;
    private int contador;

    public ControlTienda() {
        listaUsuarios = new ArrayList<>();
        contador = -1;
    }

    //Método para rellenar valores
    public Usuario agregarValores() {
        String nombre = JOptionPane.showInputDialog(null, "Introdusca su Nombre", "Solicitando Tarjeta", 1);
        String apellido = JOptionPane.showInputDialog(null, "Introdusca su Apellido", "Solicitando Tarjeta", 1);
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introdusca su Edad", "Solicitando Tarjeta", 1));
        char sexo = DefineSexo.defineSexo();
        String nip = VerificaNip.verificarNip();
        /* String nip = JOptionPane.showInputDialog(null, "El Siguiente campo es muy importante\nIntrodusca su NIP", "Solicitando Tarjeta", 1);
         if (!verificarNip(nip)) {
         boolean continuar = false;
         do {
         JOptionPane.showMessageDialog(null, "Su NIP debe ser de 4 Digitos", "NIP no valido", 2);
         nip = JOptionPane.showInputDialog(null, "El Siguiente campo es muy importante\nIntrodusca su NIP", "Solicitando Tarjeta", 1);
         if (verificarNip(nip)) {
         continuar = true;
         }
         } while (!continuar);
         }*/
        return new Usuario(nombre, apellido, edad, nip, sexo);
    }

    //Método para agregar un Usuario al banco
    public void addUsuarioBanco(Usuario u) {
        listaUsuarios.add(u);
        JOptionPane.showMessageDialog(null, "Bienvenido " + u.getNombre() + " usted ya cuenta con su tarjeta Coppel", "Bienvenido", -1, new ImageIcon("recursos/tarjeta.png"));
        this.contador++;
    }

    //Método para inicar Sesión
    public Usuario iniciarSesion(String nip) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getNip().equalsIgnoreCase(nip)) {
                return listaUsuarios.get(i);
            }
        }
        return null;
    }

    //Método para verificar el NIP
    public boolean verificarNip(String nip) {
        if (nip.length() == 4) {
            return true;
        }
        return false;
    }

    //Método para verificar que tengamos usuarios dentro de nuestra tienda
    public boolean listaVacia() {
        return (contador == -1);
    }
}
