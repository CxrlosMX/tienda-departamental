/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontienda;

import java.util.ArrayList;
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
        String nip = JOptionPane.showInputDialog(null, "El Siguiente campo es muy importante\nIntrodusca su NIP", "Solicitando Tarjeta", 1);
        nip=VerificaNip.verificarNip(nip);
        return new Usuario(nombre, apellido, edad, nip, sexo);
    }

    //Método para verificar que tengamos usuarios dentro de nuestra tienda
    public boolean listaVacia() {
        return (contador == -1);
    }
}
