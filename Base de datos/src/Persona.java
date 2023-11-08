public class Persona {
    
    int rut;
    String nombreCompleto;
    String facultad;
    boolean si_es_Alumno;
    boolean si_es_Profesor;


    public Persona(int rut, String nombreCompleto, String facultad, boolean si_es_Alumno, boolean si_es_Profesor) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.facultad = facultad;
        this.si_es_Alumno = si_es_Alumno;
        this.si_es_Profesor = si_es_Profesor;
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

    public boolean isSi_es_Alumno() {
        return si_es_Alumno;
    }

    public void setSi_es_Alumno(boolean si_es_Alumno) {
        this.si_es_Alumno = si_es_Alumno;
    }

    public boolean isSi_es_Profesor() {
        return si_es_Profesor;
    }
    
    public void setSi_es_Profesor(boolean si_es_Profesor) {
        this.si_es_Profesor = si_es_Profesor;
    }

    

}


