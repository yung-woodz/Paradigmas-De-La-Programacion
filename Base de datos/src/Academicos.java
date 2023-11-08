public class Academicos extends Persona{

    String departamento;
    String lineas_de_investigacion;
    int antiguedad;

    public Academicos(int rut, String nombreCompleto, String facultad, boolean si_es_Alumno, boolean si_es_Profesor,
            String departamento, String lineas_de_investigacion, int antiguedad) {
        super(rut, nombreCompleto, facultad, si_es_Alumno, si_es_Profesor);
        this.departamento = departamento;
        this.lineas_de_investigacion = lineas_de_investigacion;
        this.antiguedad = antiguedad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getLineas_de_investigacion() {
        return lineas_de_investigacion;
    }

    public void setLineas_de_investigacion(String lineas_de_investigacion) {
        this.lineas_de_investigacion = lineas_de_investigacion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    

}