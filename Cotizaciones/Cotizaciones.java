/*
Tomas Tirado Millan 9-3 2019030480
Programacion Movil
08/Mayo/2022
Class Padre de ejericio 2
Cotizaciones
 */
package Cotizaciones;

import java.util.Scanner;



public class Cotizaciones {
        //ATRIBUTOS
    protected int NumerodeCotizacion;
    protected String Descripcion;
    protected float Precio;
    protected float PorcentajeInicial;
    protected int Plazo;
    protected float PagoInicial;
    protected float TotalaFin;
    protected float PagoMensual;

      public Cotizaciones(){
        this.NumerodeCotizacion = 0;
        this.Descripcion = "";
        this.Precio = 0.0f;
        this.PorcentajeInicial = 0.0f;
        this.Plazo = 0;
        this.PagoInicial = 0.0f;
        this.TotalaFin = 0.0f;
        this.PagoMensual = 0.0f;
    }
    
    public Cotizaciones(int NumerodeCotizacion, String Descripcion, float Precio, float PorcentajeInicial, int Plazo, float PagoInicial, float TotalaFin, float PagoMensual) {
        this.NumerodeCotizacion = NumerodeCotizacion;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.PorcentajeInicial = PorcentajeInicial;
        this.Plazo = Plazo;
        this.PagoInicial = PagoInicial;
        this.TotalaFin = TotalaFin;
        this.PagoMensual = PagoMensual;
    }
     public Cotizaciones(Cotizaciones cotizacion) {
        this.NumerodeCotizacion = cotizacion.NumerodeCotizacion;
        this.Descripcion = cotizacion.Descripcion;
        this.Precio = cotizacion.Precio;
        this.PorcentajeInicial = cotizacion.PorcentajeInicial;
        this.Plazo = cotizacion.Plazo;
        this.PagoInicial = cotizacion.PagoInicial;
        this.TotalaFin = cotizacion.TotalaFin;
        this.PagoMensual = cotizacion.PagoMensual;
    }

    public int getNumerodeCotizacion() {
        return NumerodeCotizacion;
    }

    public void setNumerodeCotizacion(int NumerodeCotizacion) {
        this.NumerodeCotizacion = NumerodeCotizacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public float getPorcentajeInicial() {
        return PorcentajeInicial;
    }

    public void setPorcentajeInicial(float PorcentajeInicial) {
        this.PorcentajeInicial = PorcentajeInicial;
    }

    public int getPlazo() {
        return Plazo;
    }

    public void setPlazo(int Plazo) {
        this.Plazo = Plazo;
    }

    public float getPagoIncial() {
        return PagoInicial;
    }

    public void setPagoIncial(float PagoIncial) {
        this.PagoInicial = PagoIncial;
    }

    public float getTotalaFin() {
        return TotalaFin;
    }

    public void setTotalaFin(float TotalaFin) {
        this.TotalaFin = TotalaFin;
    }

    public float getPagoMensual() {
        return PagoMensual;
    }

    public void setPagoMensual(float PagoMensual) {
        this.PagoMensual = PagoMensual;
    }
     
     public void capturarDatos (){
        Scanner b= new Scanner (System.in);
        System.out.println("Numero de Cotizacion: ");
        this.NumerodeCotizacion=b.nextInt(); b.nextLine();
        System.out.println("Descripcion: ");
        this.Descripcion=b.nextLine();
        System.out.println("Precio: ");
        this.Precio= b.nextInt(); b.nextLine();
        System.out.println("Porcentaje Inicial: ");
        this.PorcentajeInicial= b.nextFloat(); b.nextLine();
        System.out.println("Plazo (en meses): ");
        this.Plazo=b.nextInt(); b.nextLine();
 
        }
    public void CalcularPagoInicial (){
        PagoInicial= Precio*PorcentajeInicial;
    }
    
    public void CalcularTotalaFin (){
        TotalaFin= Precio-PagoInicial;
    }
    
    public void PagoMensual (){
        PagoMensual= TotalaFin/Plazo;
    }
    
    public void imprimirDatos (){
        System.out.println("Numero de Cotizaciono: "+this.NumerodeCotizacion);
        System.out.println("Descripcion: "+this.Descripcion);
        System.out.println("Precio: "+this.Precio);
        System.out.println("Porcentaje Inicial: "+this.PorcentajeInicial);
        System.out.println("Plazo: "+this.Plazo);
        System.out.println("Pago Inicial: "+this.PagoInicial);
        System.out.println("Total a Fin: "+this.TotalaFin);
        System.out.println("PagoMensual: "+this.PagoMensual);
    
    
    
    
}
}