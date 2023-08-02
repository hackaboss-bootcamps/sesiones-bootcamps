package View;

import Logica.Tienda;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Instanciar una clase
        Tienda tienda = new Tienda(0.8);
        tienda.setNombre("Jesús Ariel");
        tienda.setCantidad(3.0);
        tienda.Mostrar();
    }
}
