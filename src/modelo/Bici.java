package modelo;

public class Bici extends Repartidor {
    // datos brindados en la guia para realizar los calculos
    private double tarifaBase = 2000;
    private double valorPorKilometro = 800;
    private double velocidad = 15;
    private double distanciaMaxima = 5;
    private boolean aceptaPedidosGrandes = false;


    //  constructor que hereda atributos del padre
    public Bici(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String getTipo() {
        return "Bici";
    }
    // metodo para calcular valor de los kilometros recorridos
    @Override
    public double calcularCosto(double km, boolean lluvia) {
        double costo = tarifaBase + (km * valorPorKilometro);
        if (lluvia) {
            costo = costo * 1.20; // Aumento del 20% por lluvia
        }
        return costo;
    }
    // metodo para calcular el tiempo que tarda el repartidor
    @Override
    public double calcularTiempo(double km) {
        return (km / velocidad) * 60;
    }
    // metodo que valida si puede aceptar pedidos grandes
    @Override
    public boolean puedeLlevar(double km, boolean pedidoGrande, boolean lluvia) {
        if (lluvia) return false;
        if (pedidoGrande && !aceptaPedidosGrandes) return false;
        return km >= 0 && km <= distanciaMaxima;
    }
}
