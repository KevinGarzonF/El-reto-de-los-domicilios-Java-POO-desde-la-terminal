package modelo;

<<<<<<< HEAD
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
=======
import java.util.ArrayList;
import java.util.List;

public abstract class Repartidor implements Calificable {

    //Atributos
    private String codigo;
    private String nombre;
    private boolean disponible;
    private final List<Integer> calificaciones = new ArrayList<>();

    //constructor (no permite espacios vacíos)
    public Repartidor(String codigo, String nombre) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

>>>>>>> 66b63ff029f6fbb41f98c471a38e34e93d3f18eb
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

<<<<<<< HEAD
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

=======
    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public void recibirCalificacion(int calificacion) {
        if (calificacion < 1 || calificacion > 5) {
            throw new IllegalArgumentException("La calificación debe estar entre 1 y 5");
        }
        calificaciones.add(calificacion);
    }

    @Override
    public double promedio() {
        if (calificaciones.isEmpty()) {
            return 0;
        }
        int suma = 0;
        for (int c : calificaciones) {
            suma += c;
        }
        return (double) suma / calificaciones.size();
    }
>>>>>>> 66b63ff029f6fbb41f98c471a38e34e93d3f18eb
}