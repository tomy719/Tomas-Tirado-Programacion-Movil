package com.example.boletos;

import java.util.Scanner;

public class Boletos {
    //ATRIBUTOS
    private int numerodeBoleto;
    private String nombreCliente;
    private String destino;
    private int tipodeViaje;
    private float precio;
    private String fecha;
    private float subtotal;
    private float iva;
    private float descuento;
    private float total;

    //METODOS
    //Constructores
    //Constructor Vacio
    public Boletos(){
        this.numerodeBoleto=0;
        this.nombreCliente="";
        this.destino="";
        this.tipodeViaje=0;
        this.precio=0.0f;
        this.fecha="";
    }
    //CONSTRUCTOR DE PARAMETROS
    public Boletos(int numerodeBoleto, String nombreCliente, String destino,
                   int tipodeViaje, float precio, String fecha){
        this.numerodeBoleto=numerodeBoleto;
        this.nombreCliente=nombreCliente;
        this.destino=destino;
        this.tipodeViaje=tipodeViaje;
        this.precio=precio;
        this.fecha=fecha;
    }
    //CONSTRUCTOR DE COPIA
    public Boletos (Boletos boleto){
        this.numerodeBoleto=boleto.numerodeBoleto;
        this.nombreCliente=boleto.nombreCliente;
        this.destino=boleto.destino;
        this.tipodeViaje=boleto.tipodeViaje;
        this.precio=boleto.precio;
        this.fecha=boleto.fecha;
    }

    //Encapsulamiento


    public int getNumerodeBoleto() {
        return numerodeBoleto;
    }

    public void setNumerodeBoleto(int numerodeBoleto) {
        this.numerodeBoleto = numerodeBoleto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.nombreCliente = NombreCliente;
    }

    public String getDestino() { //Ultima correccion set de destino
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTipodeViaje() {
        return tipodeViaje;
    }

    public void setTipodeViaje(int tipodeViaje) {
        this.tipodeViaje = tipodeViaje;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float CalcularSubtotal (){
        if (tipodeViaje==2){
            subtotal=precio*(1.80f);
        }
        else
        {
            subtotal=precio;
        }
        return subtotal;
    }

    public float CalcularIVA (){
        iva = subtotal*(.16f);
        return iva;
    }

    public float CalcularDescuento (int edad){
        if (edad>60){
            descuento=(subtotal+iva)/2;
        }
        return descuento;
    }

    public float CalcularTotal (){
        total = subtotal+iva-descuento;
        return total;
    }
}
