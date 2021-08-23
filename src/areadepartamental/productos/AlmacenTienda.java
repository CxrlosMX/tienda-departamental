/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadepartamental.productos;

import areadepartamental.DepartamentoRopa;
import areadepartamental.Electrodomesticos;
import areadepartamental.Electronica;
import areadepartamental.Producto;
import java.util.ArrayList;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 22/08/2021
 *
 */
public class AlmacenTienda {

    private ArrayList<DepartamentoRopa> listaRopa;
    private ArrayList<Electronica> listaElectronica;
    private ArrayList<Electrodomesticos> listaElectrodomesticos;

    public AlmacenTienda() {
        listaRopa = new ArrayList<>();
        listaElectronica = new ArrayList<>();
        listaElectrodomesticos = new ArrayList<>();
    }

    //Rellenaremos cada lista con 2 productos
    public void addListaRopa() {
        DepartamentoRopa p1 = new DepartamentoRopa("XXL", "Pantalón 551", "Levi´s", 990, true);
        DepartamentoRopa p2 = new DepartamentoRopa("M", "Blusa Amarilla", "Refill", 249, false);
        listaRopa.add(p1);
        listaRopa.add(p2);
    }

    //Rellenaremos cada lista con 2 productos
    public void addListaElectronica() {
        Electronica p1 = new Electronica("Iphone 11", "2020", "Iphone 11", "Apple", 18599, false);
    }
}
