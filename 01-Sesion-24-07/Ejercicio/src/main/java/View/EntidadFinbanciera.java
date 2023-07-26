package View;

import Logica.Cliente;

//Se dispone de 1.000.000(P) de pesos el cual se deposita en una entidad financiera que pagara un interes mesual de
// 2,5 (i) sobre la cantidad inicial acumulada cada mes ¿Cuanto se obtendrá al finañ de un año (n en meses)
public class EntidadFinbanciera {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1.0, 2.5, 10);
        cliente.setNombre("Alvaro");
        cliente.Mostrar();
    }
}