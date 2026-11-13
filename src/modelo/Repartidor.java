package modelo;

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

        this.codigo = codigo.trim();
        this.nombre = nombre.trim();
        this.disponible = true;
    }

    public String getCodigo() {
        return codigo;
    }

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
}