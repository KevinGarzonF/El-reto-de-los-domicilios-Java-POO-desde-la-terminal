package app;

import java.util.Scanner;
import servicio.DomiServices;
import modelo.Cliente;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DomiServices servicio = new DomiServices();
        int opcion = -1;

        do {
            System.out.println("===== DOMI - SISTEMA DE DOMICILIOS =====");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Registrar repartidor");
            System.out.println("3. Crear pedido");
            System.out.println("4. Consultar pedidos");
            System.out.println("5. Consultar repartidores");
            System.out.println("6. Listar clientes");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");

            try {

                String opcionTexto = scanner.nextLine();
                opcion = Integer.parseInt(opcionTexto);

                switch (opcion) {
                    case 1:
                        System.out.println("--- REGISTRAR CLIENTE ---");
                        System.out.print("Cédula: ");
                        String cedula = scanner.nextLine();

                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Telefono: ");
                        String telefono = scanner.nextLine();

                        System.out.print("Barrio: ");
                        String barrio = scanner.nextLine();

                        System.out.print("Direccion: ");
                        String direccion = scanner.nextLine();

                        servicio.registrarCliente(cedula, nombre, telefono, barrio, direccion);
                        System.out.println("Cliente registrado con exito");
                        break;

                    case 2:
                        System.out.println("Registrar repartidor (En construcción)");
                        break;

                    case 3:
                        System.out.println("Crear pedido (En construcción)");
                        break;

                    case 4:
                        System.out.println("Consultar pedidos (En construcción)");
                        break;

                    case 5:
                        System.out.println("Consultar repartidores (En construcción)");
                        break;

                    case 6:
                        System.out.println("--- LISTA DE CLIENTES ---");
                        for (Cliente c : servicio.obtenerClientes()) {
                            System.out.println(c.toString());
                        }
                        break;

                    case 0:
                        System.out.println("Gracias por utilizar DOMI.");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número en el menú.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }

        } while (opcion != 0);

        scanner.close();
    }
}