/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadepartamental;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/08/2021
 *
 */
public class Electronica extends Producto {

    private String modelo;
    private String agnoLanzamiento;

    public Electronica(String modelo, String agnoLanzamiento, String nombre, String marca, int precio, boolean descuento) {
        super(nombre, marca, precio, descuento);
        this.modelo = modelo;
        this.agnoLanzamiento = agnoLanzamiento;
        aplicarDescuento();
    }

    @Override
    public void aplicarDescuento() {
        if (super.isDescuento()) {
            double n = super.getPrecio() * 0.20;
            super.setPrecio(super.getPrecio() + n);
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAgnoLanzamiento() {
        return agnoLanzamiento;
    }

    public void setAgnoLanzamiento(String agnoLanzamiento) {
        this.agnoLanzamiento = agnoLanzamiento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nModelo: " + modelo + "\nAño de Lanzamiento: " + agnoLanzamiento + ((super.isDescuento()) ? "\n20% DESCUENTOS" : "");
    }

}
