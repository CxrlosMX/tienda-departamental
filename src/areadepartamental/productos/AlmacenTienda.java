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
        addListaRopa();
        addListaElectronica();
        addListaElectrodomesticos();
    }

    //Rellenaremos cada lista con 2 productos
    private void addListaRopa() {
        DepartamentoRopa p1 = new DepartamentoRopa("XXL", "Pantalón 551", "Levi´s", 990, true);
        DepartamentoRopa p2 = new DepartamentoRopa("M", "Blusa Amarilla", "Refill", 249, false);
        listaRopa.add(p1);
        listaRopa.add(p2);
    }

    //Rellenaremos cada lista con 2 productos
    public void addListaElectronica() {
        Electronica p1 = new Electronica("Iphone 11", "2020", "Iphone 11", "Apple", 18599, false);
        Electronica p2 = new Electronica("Smart TV 55H6F", "2020", "Pnatalla LED 55' HD 4K", "Hisense", 18999, true);
        listaElectronica.add(p1);
        listaElectronica.add(p2);
    }

    //Rellenaremos cada lista con 2 productos
    public void addListaElectrodomesticos() {
        Electrodomesticos p1 = new Electrodomesticos("500", "Refrigerador Top Mount", "LG", 17999, true);
        Electrodomesticos p2 = new Electrodomesticos("120", "Horno de Microondas", "Whirlpool", 3699, false);
        listaElectrodomesticos.add(p1);
        listaElectrodomesticos.add(p2);
    }

    //Método para mostrar los productos
    public String listaRopa() {
        String cadena = "";
        for (int i = 0; i < listaRopa.size(); i++) {
            cadena += "\n" + (i + 1) + ".-" + listaRopa.get(i) + "\n";
        }
        return cadena;
    }

    public String listaElectrodmesticos() {
        String cadena = "";
        for (int i = 0; i < listaElectrodomesticos.size(); i++) {
            cadena += "\n" + (i + 1) + ".-" + listaElectrodomesticos.get(i) + "\n";
        }
        return cadena;
    }

    public String listaElectronica() {
        String cadena = "";
        for (int i = 0; i < listaElectronica.size(); i++) {
            cadena += "\n" + (i + 1) + ".-" + listaElectronica.get(i) + "\n";
        }
        return cadena;
    }

    
    
}
