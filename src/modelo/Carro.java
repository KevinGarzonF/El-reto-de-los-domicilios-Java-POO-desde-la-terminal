package modelo;

public class Carro extends Repartidor {

    private double tarifaBase = 5000 ;
    private double valorPorKilometro = 1200;
    private double  velocidad = 25 ;
    private boolean aceptaPedidosGrandes = true;

    //  constructor que hereda atributos del padre
    public Carro (String codigo, String nombre) {
        super(codigo, nombre);
    }
    // metodo para calcular valor de los kilometros recorridos
    public double calcularCosto(double km){
        return tarifaBase + (km * valorPorKilometro);
    }
    // metodo para calcular el tiempo que tarda el repartidor
    public double calcularTiempo(double km) {
        return (km / velocidad) * 60;
    }
    // metodo que valida si puede aceptar pedidos grandes
    public boolean puedeHacerPedido(double km, boolean esGrande) {
        return km >= 0 && (!esGrande || aceptaPedidosGrandes);
    }

}
