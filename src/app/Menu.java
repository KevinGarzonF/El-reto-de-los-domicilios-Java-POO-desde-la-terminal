package app;

public class Menu {

    public void mostrar(boolean lluvia) {

        System.out.println("=============Bienvenido a DOMI=============");

        System.out.println("==============CLIENTES======================");

        System.out.println("1.Registrar");
        System.out.println("2. Listar");
        System.out.println("3. Editar");
        System.out.println("4.Eliminar");


        System.out.println("===============REPARTIDORES=======================");
        System.out.println("5. Registrar");
        System.out.println("6. Listar");
        System.out.println("7. Cambiar disponibilidad");


        System.out.println("================PEDIDOS============================");
        System.out.println("8. Crear pedido (Cotiza y asigna)");
        System.out.println("9. Entregar");
        System.out.println("10. Cancelar");
        System.out.println("11. Listar Pedidos");

        System.out.println("================= OPERACIÓN=========================");
        System.out.println("12. Activar/Desactivar Lluvia");
        System.out.println("13. Cierre del día");
        System.out.println("0. Salir");
        System.out.println("=======================================================");

        if (lluvia) {
            System.out.println("Clima: Está lloviendo");
        } else {
            System.out.println("Clima: No está lloviendo");
        }
    }
}