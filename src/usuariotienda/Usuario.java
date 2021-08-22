/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuariotienda;

import metodos.GenerarNumeroAleatorio;
import superFunciones.RecorreString;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/08/2021
 *
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String curp;
    private int edad;
    private int nip;
    private double saldo;
    private double deuda;
    private String numeroCuenta;

    public Usuario(String nombre, String apellido, int edad, int nip) {
        this.nombre = nombre;
        this.apellido = apellido;
        //Curp se genera automaticamente
        this.curp = generarCurp();
        this.edad = edad;
        this.nip = nip;
        this.saldo = 0;
        this.deuda = 0;
        //El numero de cuenta lo genera el banco
        this.numeroCuenta = generarNumeroCuenta();
    }

    private String generarNumeroCuenta() {
        String cadena = "";
        char a;
        int n;
        for (int i = 0; i < 6; i++) {
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

    private String generarCurp() {
        String cadena = "";
        cadena += RecorreString.recorre(apellido);
        cadena += String.valueOf(edad);
        cadena += RecorreString.recorre(nombre);
        return cadena;
    }
    //Métodos Get y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nApellido: " + apellido + "\nCURP: " + curp + "\nEdad:" + edad + "\nNIP: " + nip + "\nSaldo: " + saldo + "\nDeuda: " + deuda + "\nNumero De Cuenta: " + numeroCuenta;
    }

}
