/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadepartamental;

import metodos.TallasRopa;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/08/2021
 *
 */
public class DepartamentoRopa extends Producto {

    private String talla;

    public DepartamentoRopa(String talla, String nombre, String marca, double precio, boolean descuento) {
        super(nombre, marca, precio, descuento);
        verificarTalla(talla);
    }

    private void verificarTalla(String t) {
        boolean encontrado = false;
        for (int i = 0; i < TallasRopa.tallasRopa.length && !encontrado; i++) {
            if (t.equalsIgnoreCase(TallasRopa.tallasRopa[i])) {
                encontrado = true;
                this.talla = t;
            }
        }
        if (!encontrado) {
            this.talla = "UNIX";
        }
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public void aplicarDescuento() {
        if (super.isDescuento()) {
            double n = super.getPrecio() * 0.10;
            super.setPrecio(super.getPrecio() + n);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nTalla: " + talla + ((super.isDescuento()) ? "\n10% DESCUENTO" : "");
    }

}
