/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import areadepartamental.productos.AlmacenTienda;
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
        Usuario c = control.agregarValores();
        System.out.println(c);
        Usuario a = control.agregarValores();
        System.out.println(a);
        Usuario b = control.agregarValores();
        System.out.println(b);
        //  AlmacenTienda a=new AlmacenTienda();
        //System.out.println(""+a.listaRopa());
        //System.out.println(a.listaElectronica());
        // System.out.println(a.listaElectronica());

    }

}
