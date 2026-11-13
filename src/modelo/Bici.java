package modelo;

// extends porque hereda de repartidor
public class Bici extends Repartidor {
// datos brindados en la guia para realizar los calculos
        private double tarifaBase = 2000 ;
        private double valorPorKilometro = 800;
        private double  velocidad = 15 ;
        private double distanciaMaxima = 5;
        private boolean aceptaPedidosGrandes = false;

      //  constructor que hereda atributos del padre
        public Bici (String codigo,  String nombre) {
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
