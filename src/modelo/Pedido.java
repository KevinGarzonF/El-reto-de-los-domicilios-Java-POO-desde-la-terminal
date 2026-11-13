package modelo;

public class Pedido {

    private int numero;
    private Cliente cliente;
    private String descripcion;
    private static int consecutivo = 1;
    private boolean pedidoGrande;
    private double km;
    private Repartidor repartidorAsignado;
    private double costo;
    private double tiempo;
    private String estado;

    public Pedido(Cliente cliente, String descripcion, boolean pedidoGrande, double km) {
        this.numero = consecutivo++;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.pedidoGrande = pedidoGrande;
        this.km = km;
        this.estado = "en camino";
    }


    public int getNumero() { return numero; }
    public Cliente getCliente() { return cliente; }
    public String getDescripcion() { return descripcion; }
    public boolean ispedidoGrande() { return pedidoGrande; }
    public double getKm() { return km; }
    public Repartidor getRepartidorAsignado() { return repartidorAsignado; }
    public double getCosto() { return costo; }
    public double getTiempo() { return tiempo; }
    public String getEstado() { return estado; }


    public void setRepartidorAsignado(Repartidor repartidorAsignado) {
        this.repartidorAsignado = repartidorAsignado;
    }

    public void setCosto(double costo) { this.costo = costo; }
    public void setTiempo(double tiempo) { this.tiempo = tiempo; }

    public void setEstado(String estado) {

        if (estado.equals("en camino") || estado.equals("entregado") || estado.equals("cancelado")) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("Error en estado " + estado);
        }
    }
}
