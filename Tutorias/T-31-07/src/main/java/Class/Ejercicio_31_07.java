package Class;

import javax.swing.*;

public class Ejercicio_31_07 {
    private int cantKilo;
    private String nomClien;
    private double porcDes;
    private double descu;
    private double totalPagarBruto;
    private double totalPagarNeto;
    private double totalPerci;
    final double valorUnitario = 2000;

    public int getCantKilo() {
        return cantKilo;
    }

    public void setCantKilo(int cantKilo) {
        this.cantKilo = cantKilo;
    }

    public String getNomClien() {
        return nomClien;
    }

    public void setNomClien(String nomClien) {
        this.nomClien = nomClien;
    }

    private double getPorcDes() {
        return porcDes;
    }

    private void setPorcDes(double porcDes) {
        this.porcDes = porcDes;
    }

    private double getDescu() {
        return descu;
    }

    private void setDescu(double descu) {
        this.descu = descu;
    }

    private double getTotalPagarBruto() {
        return totalPagarBruto;
    }

    private void setTotalPagarBruto(double totalPagarBruto) {
        this.totalPagarBruto = totalPagarBruto;
    }

    private double getTotalPagarNeto() {
        return totalPagarNeto;
    }

    private void setTotalPagarNeto(double totalPagarNeto) {
        this.totalPagarNeto = totalPagarNeto;
    }

    private double getTotalPerci() {
        return totalPerci;
    }

    private void setTotalPerci(double totalPerci) {
        this.totalPerci = totalPerci;
    }

    public double ValorPagarCliente(){
        //Aplicar la lógica del ejercicio.
        if(this.getCantKilo()>10){
            this.setPorcDes(0.15);
        }else{
            this.setPorcDes(0);
        }
        this.setTotalPagarBruto(this.getCantKilo()*valorUnitario);
        this.setDescu(this.getTotalPagarBruto()*this.getPorcDes());
        this.setTotalPagarNeto(this.getTotalPagarBruto()-this.getDescu());
        this.setTotalPerci(this.getTotalPerci()+this.getTotalPagarNeto());
        return this.getTotalPagarNeto();
    }

    //Capturar solo positivos
    public int SoloPositivo(String mensaje){
        int numero=0;
        while (numero<=0){
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            }catch (Exception e){
                System.out.println("Dato ingresado no es valido.");
            }
        }
        return numero;
    }
}
