package Logica;

public class Cliente {

    public String nombre;
    public Double pesosInicial;
    private Double interes;
    private Double cantidadFinal;
    public Integer meses;

    public void Cliente() {
    }

    public Cliente(Double pesosInicial, Double interes, Integer meses) {
        this.pesosInicial = pesosInicial;
        this.interes = interes;
        this.meses = meses;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPesosInicial() {
        return pesosInicial;
    }

    public void setPesosInicial(Double pesosInicial) {
        this.pesosInicial = pesosInicial;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getCantidadFinal() {
        return cantidadFinal;
    }

    public void setCantidadFinal(Double cantidadFinal) {
        this.cantidadFinal = cantidadFinal;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    public void Mostrar() {
        this.setCantidadFinal(this.pesosInicial * Math.pow((1 + this.interes), this.meses));
        System.out.println(this.getNombre() + " debe pagar en total " + this.getCantidadFinal() + " de intereses anuales ");
    }
}