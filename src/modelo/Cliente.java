package modelo;

public class Cliente {

    private String cedula;
    private String nombre;
    private String telefono;
    private String barrio;
    private String direccion;

    public Cliente(String  cedula, String nombre, String telefono, String barrio, String direccion) {

        setCedula(cedula);
        setNombre(nombre);
        setTelefono(telefono);
        setBarrio(barrio);
        setDireccion(direccion);

    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    // validacion numerica de la cedula
    public void setCedula(String cedula) {
        if(cedula == null || !cedula.trim().matches("[0-9]+")) {
            throw new IllegalArgumentException("La cedula solo debe contener caracteres numericos");
        }
        this.cedula = cedula.trim();
    }

    // Validacion del telefono
    public void setTelefono(String telefono) {
        if(telefono == null || !telefono.trim().matches("[0-9]{7,10}")) {
            throw new IllegalArgumentException("El telefono de contener de 7 a 10 caracteres numericos");
        }
        this.telefono = telefono.trim();
    }

    // validacion del nombre
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre = nombre.trim();
    }

    // validacion casilla barrio
    public void setBarrio(String barrio) {
        if (barrio == null || barrio.trim().isEmpty()) {
            throw new IllegalArgumentException("El barrio no puede estar vacio");
        }
        this.barrio = barrio.trim();
    }

    //validacion casilla direccion
    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La direccion no puede estar vacia");
        }
        this.direccion = direccion.trim();
    }
}
