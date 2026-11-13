package modelo;

public abstract class Repartidor {

    //Atributos
    private String codigo;
    private String nombre;
    private boolean disponible;

//constructor (no permite espacios vacio)
    public Repartidor(String codigo, String nombre) {
        if (codigo == null || codigo.trim()isEmpty()) {
            throw new IllegalArgumetException("El codigo no puede estar vacio");
        }
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.disponible = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public abstract double calcularCosto(double km);

    public abstract double calcularTiempo(double km);

    public abstract boolean puedeHacerPedido(double km, boolean esGrande);
}
