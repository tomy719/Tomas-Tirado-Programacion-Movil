/*
Tomas Tirado Millan 9-3 2019030480
Programacion Movil
08/Mayo/2022
Main class de ejericio 2
Cotizaciones
 */
package Cotizaciones;


public class MainCotizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cotizaciones c = new Cotizaciones ();
        c.capturarDatos();
        c.CalcularPagoInicial();
        c.CalcularTotalaFin();
        c.PagoMensual();
        c.imprimirDatos();
    }
    
}
