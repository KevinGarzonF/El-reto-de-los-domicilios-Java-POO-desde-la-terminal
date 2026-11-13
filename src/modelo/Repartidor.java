package modelo;

public abstract class Repartidor implements Calificable {
    private String codigo;
    private String nombre;
    private boolean disponible;
    private double sumaCalificaciones;
    private int cantidadCalificaciones;


    public Repartidor(String codigo, String nombre) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede estar vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del repartidor no puede estar vacio");
        }
        this.codigo = codigo.trim();
        this.nombre = nombre.trim();
        this.disponible = true;
        this.sumaCalificaciones = 0;
        this.cantidadCalificaciones = 0;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public boolean isDisponible() { return disponible; }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract String getTipo();

    public abstract double calcularCosto(double km, boolean lluvia);

    public abstract double calcularTiempo(double km);

    public abstract boolean puedeLlevar(double km, boolean pedidoGrande, boolean lluvia);



    @Override
    public void recibirCalificacion(int estrellas) {
        if (estrellas < 1 || estrellas > 5) {
            throw new IllegalArgumentException("La calificación debe ser entre 1 y 5.");
        }
        this.sumaCalificaciones += estrellas;
        this.cantidadCalificaciones++;
    }

    @Override
    public double obtenerPromedio() {
        if (cantidadCalificaciones == 0) {
            return 0.0;
        }
        return sumaCalificaciones / cantidadCalificaciones;
    }

    @Override
    public String toString() {
        return codigo + nombre + " (" + getTipo() + ") " + (disponible ? "Disponible" : "No disponible");
    }

}