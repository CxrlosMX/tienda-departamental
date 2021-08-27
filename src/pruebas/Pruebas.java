/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import areadepartamental.productos.AlmacenTienda;
import banco.Banco;
import gestiontienda.ControlTienda;
import usuariotienda.Usuario;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/08/2021
 *
 */
public class Pruebas {

    public static void main(String[] args) {
        ControlTienda control = new ControlTienda();
        Banco banco = new Banco();
        Usuario c = new Usuario("Luis", "Rendon", 20, "1234", 'H');
        control.addUsuarioBanco(c);
        //System.out.println(c);
        Usuario a = new Usuario("Sayuri", "Aparicio", 18, "2233", 'M');
        control.addUsuarioBanco(a);
        System.out.println(a);
        //control.realizarDeposito(a);
        banco.realizarDeposito(a);
        System.out.println(a);
        // control.realizarDeposito(a);
        banco.realizarDeposito(a);
        System.out.println(a);
        banco.realizarTransferencia(a,c);
        System.out.println(a);
        System.out.println(c);
        // banco.realizarRetiro(a);
        // System.out.println(a);
        //control.usuarios();
         /* Usuario b = control.agregarValores();
         System.out.println(b);
         //  AlmacenTienda a=new AlmacenTienda();
         //System.out.println(""+a.listaRopa());
         //System.out.println(a.listaElectronica());
         // System.out.println(a.listaElectronica());
         */
    }

}
