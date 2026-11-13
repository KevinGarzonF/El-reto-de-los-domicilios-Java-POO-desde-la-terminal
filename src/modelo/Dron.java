package modelo;

public class Dron extends Repartidor {

    private double tarifaBase = 4000;
    private double valorPorKilometro = 600;
    private double velocidad = 50;
    private double distanciaMaxima = 8;

    public Dron(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String getTipo() {
        return "Dron";
    }

    @Override
    public double calcularCosto(double km, boolean lluvia) {
        return tarifaBase + (km * valorPorKilometro);
    }

    @Override
    public double calcularTiempo(double km) {
        return 0;
    }

    @Override
    public boolean puedeLlevar(double km, boolean pedidoGrande, boolean lluvia) {
        return false;
    }
}