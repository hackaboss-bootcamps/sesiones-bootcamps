package Logica;

public class Tienda {
    /*
        Visualización y seguridad de atributos o métodos
        private
        public
        protected
     */
    private String nombre;
    private Double valorUnitario;
    private Double cantidad;
    private Double totalPagar;

    //Definir constructor vacio
    public Tienda(){
    }

    public Tienda(Double valorUnitario){
        this.valorUnitario = 0.8;
    }

    //Encapsulamiento -> set[enviar o modificar el datos del atributo] - get[obtener]
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    private void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    private void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public void Mostrar(){
        this.setTotalPagar(this.getCantidad()*this.getValorUnitario());
        System.out.println(this.getNombre()+" debe pagar: "+this.getTotalPagar());

    }
}
