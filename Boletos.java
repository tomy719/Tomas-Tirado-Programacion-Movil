/*
Tomas Tirado Millan 9-3 2019030480
Programacion Movil
Clase Padre: Boletos
 */
package Boletos;

import java.util.Scanner;


public class Boletos {
      //ATRIBUTOS
    private int NumerodeBoleto;
    private String NombreCliente;
    private String Destino;
    private int TipodeViaje;
    private float Precio;
    private String Fecha;
    private float subtotal;
    private float Iva;
    private int Edad;
    private float Descuento;
    private float Total;
    
     //METODOS
    //Constructores
    //Constructor Vacio
    public Boletos(){
        this.NumerodeBoleto=0;
        this.NombreCliente="";
        this.Destino="";
        this.TipodeViaje=0;
        this.Precio=0.0f;
        this.Fecha="";
    }
 //CONSTRUCTOR DE PARAMETROS
    public Boletos(int NumerodeBoleto, String NombreCliente, String Destino,
            int TipodeViaje, float Precio, String Fecha){
        this.NumerodeBoleto=NumerodeBoleto;
        this.NombreCliente=NombreCliente;
        this.Destino=Destino;
        this.TipodeViaje=TipodeViaje;
        this.Precio=Precio;
        this.Fecha=Fecha;
    }
      //CONSTRUCTOR DE COPIA 
      public Boletos (Boletos boleto){
        this.NumerodeBoleto=boleto.NumerodeBoleto;
        this.NombreCliente=boleto.NombreCliente;
        this.Destino=boleto.Destino;
        this.TipodeViaje=boleto.TipodeViaje;
        this.Precio=boleto.Precio;
        this.Fecha=boleto.Fecha;
    }
     
    //Encapsulamiento

  
    public int getNumerodeBoleto() {
        return NumerodeBoleto;
    }

    public void setNumerodeBoleto(int NumerodeBoleto) {
        this.NumerodeBoleto = NumerodeBoleto;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public int getTipodeViaje() {
        return TipodeViaje;
    }

    public void setTipodeViaje(int TipodeViaje) {
        this.TipodeViaje = TipodeViaje;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
        public void capturarDatos (){
        Scanner b= new Scanner (System.in);
        System.out.println("Numero de Boleto: ");
        this.NumerodeBoleto=b.nextInt(); b.nextLine();
        System.out.println("Nombre: ");
        this.NombreCliente=b.nextLine();
        System.out.println("Destino: ");
        this.Destino= b.nextLine();
        System.out.println("Tipo de Viaje: ");
        this.TipodeViaje=b.nextInt(); b.nextLine();
        System.out.println("Precio: ");
        this.Precio= b.nextInt(); b.nextLine();
        System.out.println("Fecha: ");
        this.Fecha= b.nextLine();
        }
        
        public void CalcularSubtotal (){
            if (TipodeViaje==2){
             subtotal=Precio*(1.80f);
            }
            else
            {
                subtotal=Precio;
            }
        }
        
         public void CalcularIVA (){
            Iva = subtotal*(.16f);
            }
        
        public void CalcularDescuento (){
            Scanner b= new Scanner (System.in);
            System.out.println("Introduzca su Edad: ");
            this.Edad= b.nextInt(); b.nextLine();
            if (Edad>60){
                Descuento=(subtotal+Iva)/2;
            }
        }
        
        public void CalcularTotal (){
            Total = subtotal+Iva-Descuento;
        }
        
         public void imprimirDatos (){
        System.out.println("Numero de Boleto: "+this.NumerodeBoleto);
        System.out.println("Nombre: "+this.NombreCliente);
        System.out.println("Destino: "+this.Destino);
        System.out.println("Tipo de Viaje: "+this.TipodeViaje);
        System.out.println("Precio: "+this.Precio);
        System.out.println("Fecha: "+this.Fecha);
        System.out.println("---------------------------");
        System.out.println("Subtotal: "+this.subtotal);
        System.out.println("Iva: "+this.Iva);
        System.out.println("Descuento: "+this.Descuento);
        System.out.println("Total: "+this.Total);
        
    }
        
        } 
           
