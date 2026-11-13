package modelo;

public class Moto extends Repartidor {
    private final double tarifaBase = 3000;
    private final double valorPorKilometro = 1000;
    private final double velocidad = 30;
    private final double distanciaMaxima = 15;
    private final boolean aceptaPedidosGrandes = false;

    //  constructor que hereda atributos del padre
    public Moto(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
    // metodo para calcular valor de los kilometros recorridos
    @Override
    public double calcularCosto(double km, boolean lluvia) {
        double costo = tarifaBase + (km * valorPorKilometro);
        if (lluvia) {
            costo = costo * 1.20; // Aumento del 20% por lluvia
        }
        return costo;
    public double calcularCosto(double km){
        return tarifaBase + (km * valorPorKilometro);
    }
    // metodo para calcular el tiempo que tarda el repartidor
    @Override
    public double calcularTiempo(double km) {
        return (km / velocidad) * 60;
    }
    // metodo que valida si puede aceptar pedidos grandes
    @Override
    public boolean puedeLlevar(double km, boolean pedidoGrande, boolean lluvia) {
        // La moto SÍ sale con lluvia, solo validamos el tamaño y la distancia
        if (pedidoGrande && !aceptaPedidosGrandes) {
            return false;
        }
        return km >= 0 && km <= distanciaMaxima;
    }
}
