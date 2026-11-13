package modelo;

public interface Calificable {
    void recibirCalificacion(int calificacion);
    double promedio();
}

package modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Repartidor implements Calificable {
    private final String codigo;
    private final String nombre;
    private boolean disponible;
    private final List<Integer> calificaciones = new ArrayList<>();

    protected Repartidor(String codigo, String nombre) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.codigo = codigo.trim();
        this.nombre = nombre.trim();
        this.disponible = true;
    }

    // Getters y setters
    @Override
    public void recibirCalificacion(int calificacion) {
        if (calificacion < 1 || calificacion > 5) {
            throw new IllegalArgumentException("La calificación debe estar entre 1 y 5.");
        }
        calificaciones.add(calificacion);
    }

    @Override
    public double promedio() {
        if (calificaciones.isEmpty()) {
            return 0; // regla del reto: sin calificaciones, promedio 0
        }
        int suma = 0;
        for (int c : calificaciones) {
            suma += c;
        }
        return (double) suma / calificaciones.size();
    }
}
