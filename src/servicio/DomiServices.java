package servicio;

import modelo.Repartidor;
import modelo.Cliente;
import modelo.Pedido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DomiServices {

    //Almacenar clientes usando su cedula como identificador
    private HashMap<String, Cliente> clientes;

    //Almacenar los barrios que tiene cobertura
    public HashSet<String> barriosCubiertos;

    // Guardar las distancias entre barrios
    private HashMap<String, Double> distancias;

    // Almacenar los repartidores registrados
    private ArrayList<Repartidor> repartidores;

    // Almacenar los pedidos realizados
    private ArrayList<Pedido> pedidos;

    // Constructor
    public DomiServices() {
        clientes = new HashMap<>();
        barriosCubiertos = new HashSet<>();
        distancias = new HashMap<>();
        repartidores = new ArrayList<>();
        pedidos = new ArrayList<>();

    }
}
