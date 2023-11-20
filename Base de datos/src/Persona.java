public class Persona {
    
    int rut;
    String nombreCompleto;
    String facultad;
    int telefono;
    String correo_electronico;
    String direccion;

    public Persona(int rut, String nombreCompleto, String facultad, int telefono, String correo_electronico,
            String direccion) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.facultad = facultad;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.direccion = direccion;
    }


    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String mostrarDatos() {
        return "Nombre: " + nombreCompleto +
                "\nRut: " + rut +
                "\nFacultad: " + facultad +
                "\nTeléfono: " + telefono +
                "\nCorreo Electrónico: " + correo_electronico +
                "\nDirección: " + direccion + "\n";
    }
    

}


