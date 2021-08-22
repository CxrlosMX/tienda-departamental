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
public abstract class Producto {

    private String nombre;
    private int precio;
    private boolean descuento;

    public Producto(String nombre, int precio, boolean descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }
    //Método que da descuento 
    public abstract  void aplicarDescuento();
     
    //Método para imprimir datos

    @Override
    public String toString() {
        return   "Nombre: " + nombre + "Precio: " + precio + "Descuento: " + ((descuento)?"SI":"NO");
    }
    
   
}
