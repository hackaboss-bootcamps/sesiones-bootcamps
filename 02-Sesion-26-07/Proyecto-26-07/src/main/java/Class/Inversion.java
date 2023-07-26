package Class;

public class Inversion {
    private Double inversion;
    private Double interes;
    private Byte mes;
    private Double saldoActual;

    public Inversion(){
        this.interes= 0.025; //Equivale al 2.5%
        this.inversion=1000000.0;
    }

    public Byte getMes() {
        return mes;
    }

    public void setMes(Byte mes) {
        this.mes = mes;
    }

    private Double getSaldoActual() {
        return saldoActual;
    }

    private void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void Mostrar(){
        this.setSaldoActual(inversion*(Math.pow(1+interes,this.getMes())));
        System.out.println("El saldo actual es: "+this.getSaldoActual());
    }
}
