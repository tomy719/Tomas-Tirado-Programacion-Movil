/*
Tomas Tirado Millan 9-3 2019030480
Programacion Movil
Main class
 */

package Boletos;


public class Main {

    public static void main(String[] args) {
        System.out.println("Bievenido usuario: ");
        Boletos a = new Boletos ();
        a.capturarDatos();
        a.CalcularSubtotal();
        a.CalcularIVA();
        a.CalcularDescuento();
        a.CalcularTotal();
        a.imprimirDatos();
    }
}
