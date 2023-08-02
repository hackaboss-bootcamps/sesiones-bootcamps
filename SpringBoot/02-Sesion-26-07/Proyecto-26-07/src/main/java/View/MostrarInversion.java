package View;
import Class.Inversion;

import java.util.Scanner;

public class MostrarInversion {

    public static void main(String[] args) {
        Inversion inversion = new Inversion();
        inversion.setMes(Validar());
        inversion.Mostrar();
    }

    public static Byte Validar(){
        Byte mes  = 0;
        Scanner scanner = new Scanner(System.in);
        while (mes<=0 || mes>12){
            try {
                System.out.println("Digite los meses de 1-12: ");
                mes = Byte.parseByte(scanner.nextLine());
                if(mes<=0 || mes >12 ){
                    System.out.println("Debe ingresar solo meses entre 1-12.");
                    mes= 0;
                }
            }catch (Exception ex){
                System.out.println("Ha ingresado un dato no válido, debe ingresar solo del 1-12.");
            }
        }

        return mes;
    }
}
