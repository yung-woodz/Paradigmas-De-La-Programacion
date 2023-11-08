public class Estudiantes extends Persona {
    
    String carrera;
    int anio_ingreso;
    int semestre;
    float promedio_acumulado;


    public Estudiantes(int rut, String nombreCompleto, String facultad, boolean si_es_Alumno, boolean si_es_Profesor,
            String carrera, int anio_ingreso, int semestre, float promedio_acumulado) {
        super(rut, nombreCompleto, facultad, si_es_Alumno, si_es_Profesor);
        this.carrera = carrera;
        this.anio_ingreso = anio_ingreso;
        this.semestre = semestre;
        this.promedio_acumulado = promedio_acumulado;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setAnio_ingreso(int anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public float getPromedio_acumulado() {
        return promedio_acumulado;
    }
    
    public void setPromedio_acumulado(float promedio_acumulado) {
        this.promedio_acumulado = promedio_acumulado;
    }

}
