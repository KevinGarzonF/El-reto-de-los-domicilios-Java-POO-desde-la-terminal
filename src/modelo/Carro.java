package modelo;

public class Carro extends Repartidor {
    private final double tarifaBase = 5000;
    private final double valorPorKilometro = 1200;
    private final double velocidad = 25;
    private final double distanciaMaxima = Double.MAX_VALUE;
    private final boolean aceptaPedidosGrandes = true;

    //  constructor que hereda atributos del padre
    public Carro(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    // metodo para calcular valor de los kilometros recorridos
    @Override
    public double calcularCosto(double km, boolean lluvia) {
        double costo = tarifaBase + (km * valorPorKilometro);
        if (lluvia) {
            costo = costo * 1.20;
        }
        return costo;
    }

    // metodo para calcular el tiempo que tarda el repartidor
    @Override
    public double calcularTiempo(double km) {
        return (km / velocidad) * 60;
    }

    @Override
    public boolean puedeLlevar(double km, boolean pedidoGrande, boolean lluvia) {
        return km >= 0 && km <= distanciaMaxima;
    }
}
