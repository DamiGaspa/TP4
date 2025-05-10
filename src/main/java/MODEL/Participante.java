package BACKEND;

public class Participante {
    private String nombre;
    private String telefono;
    private String region;

    public Participante(String nombre, String telefono, String region) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getRegion() {
        return region;
    }

    public boolean telefonoEsValido() {
        return telefono.matches("\\d{4}-\\d{6}");
    }

    public boolean regionEsValida() {
        return region.equals("China") || region.equals("US") || region.equals("Europa");
    }

    public boolean esValido() {
        return !nombre.isEmpty() && !telefono.isEmpty() && telefonoEsValido() && regionEsValida();
    }

    public String mensajeDeError() {
        if (nombre.isEmpty()) return "Debe cargar un nombre";
        if (telefono.isEmpty()) return "Debe cargar un telefono";
        if (!telefonoEsValido()) return "El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN";
        if (!regionEsValida()) return "Region desconocida. Las conocidas son: China, US, Europa";
        return null;
    }
}
