package modelo;

public class Moto extends Repartidor {

    private double tarifaBase = 3000 ;
    private double valorPorKilometro = 1000;
    private double  velocidad = 30 ;
    private double distanciaMaxima = 15;
    private boolean aceptaPedidosGrandes = false;

    //  constructor que hereda atributos del padre
    public Moto(String codigo, String nombre){
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
        return km >= 0 && km <= distanciaMaxima && (!esGrande || aceptaPedidosGrandes);
    }
}
