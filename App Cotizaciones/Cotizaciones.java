package com.example.cotizaciones;

import java.util.Scanner;

public class Cotizaciones {

    //ATRIBUTOS
    protected int numerodeCotizacion;
    protected String descripcion;
    protected float precio;
    protected float porcentajeInicial;
    protected int plazo;
    protected float pagoInicial;
    protected float totalaFin;
    protected float pagoMensual;

    public Cotizaciones(){
        this.numerodeCotizacion = 0;
        this.descripcion = "";
        this.precio = 0.0f;
        this.porcentajeInicial = 0.0f;
        this.plazo = 0;
        this.pagoInicial = 0.0f;
        this.totalaFin = 0.0f;
        this.pagoMensual = 0.0f;
    }

    public Cotizaciones(int numerodeCotizacion, String descripcion, float precio, float porcentajeInicial, int plazo, float pagoInicial, float totalaFin, float pagoMensual) {
        this.numerodeCotizacion = numerodeCotizacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.porcentajeInicial = porcentajeInicial;
        this.plazo = plazo;
        this.pagoInicial = pagoInicial;
        this.totalaFin = totalaFin;
        this.pagoMensual = pagoMensual;
    }
    public Cotizaciones(Cotizaciones cotizacion) {
        this.numerodeCotizacion = cotizacion.numerodeCotizacion;
        this.descripcion = cotizacion.descripcion;
        this.precio = cotizacion.precio;
        this.porcentajeInicial = cotizacion.porcentajeInicial;
        this.plazo = cotizacion.plazo;
        this.pagoInicial = cotizacion.pagoInicial;
        this.totalaFin = cotizacion.totalaFin;
        this.pagoMensual = cotizacion.pagoMensual;
    }

    public int getNumerodeCotizacion() {
        return numerodeCotizacion;
    }

    public void setNumerodeCotizacion(int numerodeCotizacion) {
        this.numerodeCotizacion = numerodeCotizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPorcentajeInicial() {
        return porcentajeInicial;
    }

    public void setPorcentajeInicial(float porcentajeInicial) {
        this.porcentajeInicial = porcentajeInicial;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public float getPagoIncial() {
        return pagoInicial;
    }

    public void setPagoIncial(float pagoIncial) {
        this.pagoInicial = pagoIncial;
    }

    public float getTotalaFin() {
        return totalaFin;
    }

    public void setTotalaFin(float totalaFin) {
        this.totalaFin = totalaFin;
    }

    public float getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(float pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public float CalcularPagoInicial (){
        pagoInicial= precio*porcentajeInicial;
        return pagoInicial;
    }

    public float CalcularTotalaFin (){
        totalaFin= precio-pagoInicial;
        return totalaFin;
    }

    public float PagoMensual (){
        pagoMensual= totalaFin/plazo;
        return pagoMensual;
    }
}
