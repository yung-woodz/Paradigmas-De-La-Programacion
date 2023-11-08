import java.util.ArrayList;

public class EjemploArrayListObjetos {
    public static void main(String[] args) {
        // crear una array list de objetos PERSONA
        funcion();
    }

    public static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {              // estas 3 funciones son necesarias para poder mostrar los elementos de la lista 
            return nombre;                       // de la forma for( Persona : listaPersonas); el : requiere
        }

        public int getEdad() {
            return edad;
        }

        public String toString() {
            return "Persona [Nombre = " + nombre + ", edad = " + edad + "]";
        }

    }

    public static void funcion() {
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        // Agregar objetos Persona a la lista
        listaPersonas.add(new Persona("Juan", 25));
        listaPersonas.add(new Persona("Pedro", 20));
        listaPersonas.add(new Persona("Jose", 24));

        // recorrer e imprimir la lista de personas
        for (Persona persona : listaPersonas) {                       
            System.out.println(persona);
        }

    }

}