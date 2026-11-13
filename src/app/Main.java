package app;

import modelo.Bici;
import modelo.Repartidor;

public class Main {
    public static void main(String[] args) {
        Repartidor r = new Bici("R-01", "Camila Torres");

        System.out.println(r.promedio());

        r.recibirCalificacion(5);
        r.recibirCalificacion(4);
        System.out.println(r.promedio());

        try {
            r.recibirCalificacion(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}