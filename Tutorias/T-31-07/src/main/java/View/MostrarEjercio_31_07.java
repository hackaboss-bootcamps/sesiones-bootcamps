package View;
import Class.Ejercicio_31_07;

import javax.swing.*;

public class MostrarEjercio_31_07 {
    public static void main(String[] arg){
        int i=0;
        String dataSoftwareNombre[] = new String[14];
        String dataSoftwareTotalPagar[] = new String[14];
        double totalPercibido=0;
        Ejercicio_31_07 obj = new Ejercicio_31_07();
        for (i=0; i<2; i++){
            obj.setNomClien(JOptionPane.showInputDialog("Digite nombre del cliente"));
            obj.setCantKilo(obj.SoloPositivo("Digite la cantidad de kilos: "));
            System.out.println(obj.ValorPagarCliente());
            dataSoftwareNombre[i] = obj.getNomClien();
            totalPercibido+=obj.ValorPagarCliente();
            dataSoftwareTotalPagar[i] = String.valueOf(obj.ValorPagarCliente());
        }

        //Recorrer y mostrar datos
        for (i=0; i<2; i++){
            System.out.println("Cliente "+(i+1)+": "+dataSoftwareNombre[i]+" Total a pagar:"+dataSoftwareTotalPagar[i]);
        }

        //Mostrar el valor acumulado
        System.out.println("El valor de venta fue de: "+totalPercibido);
    }
}
