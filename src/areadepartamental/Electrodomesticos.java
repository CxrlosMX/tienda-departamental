/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadepartamental;

import metodos.GenerarNumeroAleatorio;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/08/2021
 *
 */
public class Electrodomesticos extends Producto {

    private String codigo;
    private String consumoEnergia;

    public Electrodomesticos(String consumoEnergia, String nombre, String marca, double precio, boolean descuento) {
        super(nombre, marca, precio, descuento);
        this.codigo = generarCodigo();
        this.consumoEnergia = consumoEnergia;
    }

    @Override
    public void aplicarDescuento() {
        if (super.isDescuento()) {
            double n = super.getPrecio() * 0.10;
            super.setPrecio(super.getPrecio() + n);
        }
    }

    private String generarCodigo() {
        String cadena = "";
        char a;
        int n;
        for (int i = 0; i < 4; i++) {
            n = GenerarNumeroAleatorio.generarNumeroAleatorio(2, 1);
            if (n == 1) {
                n = GenerarNumeroAleatorio.generarNumeroAleatorio(90, 65);
                a = (char) n;
                cadena += a;
            } else {
                n = GenerarNumeroAleatorio.generarNumeroAleatorio(57, 48);
                a = (char) n;
                cadena += a;
            }

        }
        return cadena;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCodigo: " + codigo + "\nConsumo Energia: " + consumoEnergia+"kWh";
    }

}
