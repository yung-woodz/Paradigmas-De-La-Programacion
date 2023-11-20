import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArchivosPersonas {

    public static void main(String[] args ) throws Exception{

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        File arch_persona = new File("Persona.txt");
        File arch_estudiante = new File("Estudiante.txt");
        File arch_academico = new File("Academico.txt");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Que datos desea ingresar?"+
            "\n1. Persona"+
            "\n2. Estudiante"+
            "\n3. Academico"+
            "\n4. Buscar");

        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = scanner.nextInt();

        int op = scanner.nextInt();

        switch (op) {
            case 1:
                // Bucle para ingresar datos de cada persona
                for (int i = 0; i < cantidadPersonas; i++) {
                    System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");

                    System.out.print("Rut: ");
                    int rut = scanner.nextInt();

                    System.out.print("Nombre completo: ");
                    String nombreCompleto = scanner.nextLine();

                    System.out.print("Facultad: ");
                    String facultad = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    int telefono = scanner.nextInt();

                    System.out.print("Correo electrónico: ");
                    String correoElectronico = scanner.nextLine();

                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();

                    Persona nuevaPersona = new Persona(rut, nombreCompleto, facultad, telefono, correoElectronico, direccion);
                    listaPersonas.add(nuevaPersona);
                }

                guardarDatosPersonas(arch_persona, listaPersonas);

                /* try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(arch_persona));
                    for (Persona persona : listaPersonas) {
                        writer.write(persona.getRut() + "," +
                                persona.getNombreCompleto() + "," +
                                persona.getFacultad() + "," +
                                persona.getTelefono() + "," +
                                persona.getCorreo_electronico() + "," +
                                persona.getDireccion());
                        writer.newLine();
                    }
                    System.out.println("Datos almacenados en el archivo " + arch_persona + " correctamente.");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } */
                    
            break;
            
            case 2:
                // estudiantes
                for (int i = 0; i < cantidadPersonas; i++) {
                    System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");

                    System.out.print("Rut: ");
                    int rut = scanner.nextInt();

                    System.out.print("Nombre completo: ");
                    String nombreCompleto = scanner.nextLine();

                    System.out.print("Facultad: ");
                    String facultad = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    int telefono = scanner.nextInt();

                    System.out.print("Correo electrónico: ");
                    String correoElectronico = scanner.nextLine();

                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                
                    //clase estudiante

                    System.out.println("Carrera: ");
                    String carrera = scanner.nextLine();

                    System.out.println("Ano ingreso: ");
                    int anio_ingreso = scanner.nextInt();

                    System.out.println("Semestre: ");
                    int semestre = scanner.nextInt();

                    System.out.println("Promedio acumulado: ");
                    float promedio_acumulado = scanner.nextFloat();

                    Estudiantes nuevoEstudiante = new Estudiantes(rut, nombreCompleto, facultad, telefono, correoElectronico, direccion, carrera, anio_ingreso, semestre, promedio_acumulado);

                    listaPersonas.add(nuevoEstudiante);
                }

                guardarDatosEstudiantes(arch_estudiante, listaPersonas);

            break;

            case 3:
                // academicos
                for (int i = 0; i < cantidadPersonas; i++) {
                    System.out.println("Ingrese los datos del académico " + (i + 1) + ":");
        
                    // Ingresar datos específicos de académico
                    System.out.print("Departamento: ");
                    String departamento = scanner.nextLine();
        
                    System.out.print("Líneas de investigación: ");
                    String lineasInvestigacion = scanner.nextLine();
        
                    System.out.print("Antigüedad: ");
                    int antiguedad = scanner.nextInt();
        
                    // Resto del código para ingresar datos generales de persona
                    System.out.print("Rut: ");
                    int rut = scanner.nextInt();
        
                    System.out.print("Nombre completo: ");
                    String nombreCompleto = scanner.nextLine();
        
                    System.out.print("Facultad: ");
                    String facultad = scanner.nextLine();
        
                    System.out.print("Teléfono: ");
                    int telefono = scanner.nextInt();
        
                    System.out.print("Correo electrónico: ");
                    String correoElectronico = scanner.nextLine();
        
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
        
                    // Crear la instancia de la clase Academico y agregarla a la lista
                    Academicos nuevoAcademico = new Academicos(
                            rut, nombreCompleto, facultad, telefono, correoElectronico, direccion,
                            departamento, lineasInvestigacion, antiguedad);
        
                    listaPersonas.add(nuevoAcademico);
                }

                guardarDatosAcademicos(arch_academico, listaPersonas);

            break;

            case 4:

                System.out.println("Que datos desea ingresar?"+
                    "\n1. Persona"+
                    "\n2. Estudiante"+
                    "\n3. Academico");

                int op1 = scanner.nextInt();

                switch (op1) {
                    case 1:

                        imprimirDatos(arch_persona);
                        
                    break;
                
                    case 2:

                        imprimirDatos(arch_estudiante);
                        
                    break;

                    case 3:
                        
                        imprimirDatos(arch_academico);

                    break;

                }


            break;
            


        }

       /*  // Imprimir la información de todas las personas ingresadas
        System.out.println("Información de las personas ingresadas:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona.mostrarDatos());
        } */
        scanner.close();
        
    }


    private static void guardarDatosPersonas(File archivo, ArrayList<Persona> listaPersonas) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
            for (Persona persona : listaPersonas) {
                writer.write(persona.getRut() + "," +
                        persona.getNombreCompleto() + "," +
                        persona.getFacultad() + "," +
                        persona.getTelefono() + "," +
                        persona.getCorreo_electronico() + "," +
                        persona.getDireccion());
                writer.newLine();
                writer.close();
            }
            System.out.println("Datos almacenados en el archivo " + archivo.getName() + " correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void guardarDatosEstudiantes(File archivo, ArrayList<Persona> listaPersonas) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
            for (Persona persona : listaPersonas) {
                Estudiantes estudiante = (Estudiantes) persona;
                writer.write(estudiante.getRut() + "," +
                        estudiante.getCarrera() + "," +
                       estudiante.getAnio_ingreso() + "," +
                        estudiante.getSemestre() + "," +
                        estudiante.getPromedio_acumulado());
                writer.newLine();
                writer.close();
            }
            System.out.println("Datos almacenados en el archivo " + archivo.getName() + " correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void guardarDatosAcademicos(File nombreArchivo, ArrayList<Persona> listaPersonas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Persona persona : listaPersonas) {
                Academicos academico = (Academicos) persona; // Convertir a Academico
                writer.write(academico.getRut() + "," +
                        academico.getDepartamento() + "," +
                        academico.getLineas_de_investigacion() + "," +
                        academico.getAntiguedad());
                writer.newLine();
                writer.close();
            }
            System.out.println("Datos almacenados en el archivo " + nombreArchivo + " correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private static void imprimirDatos(File archivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(linea, " ");
    
                if (archivo.getName().equals("Persona.txt")) {
                    Persona persona = new Persona(
                            Integer.parseInt(tokenizer.nextToken()),
                            tokenizer.nextToken(),
                            tokenizer.nextToken(),
                            Integer.parseInt(tokenizer.nextToken()),
                            tokenizer.nextToken(),
                            tokenizer.nextToken()
                    );
                    System.out.println(persona.mostrarDatos());
                } else if (archivo.getName().equals("Estudiante.txt")) {
                    Estudiantes estudiante = new Estudiantes(
                            Integer.parseInt(tokenizer.nextToken()),
                            tokenizer.nextToken(),
                            tokenizer.nextToken(),
                            Integer.parseInt(tokenizer.nextToken()),
                            tokenizer.nextToken(),
                            tokenizer.nextToken(),
                            tokenizer.nextToken(),
                            Integer.parseInt(tokenizer.nextToken()),
                            Integer.parseInt(tokenizer.nextToken()),
                            Float.parseFloat(tokenizer.nextToken())
                    );
                    System.out.println(estudiante.mostrarDatos());
                } else if (archivo.getName().equals("Academico.txt")) {
                    Academicos academico = new Academicos(
                            Integer.parseInt(tokenizer.nextToken()),
                            tokenizer.nextToken(),
                            tokenizer.nextToken(),
                            Integer.parseInt(tokenizer.nextToken()),
                            tokenizer.nextToken(),
                            tokenizer.nextToken(),
                            tokenizer.nextToken(),
                            tokenizer.nextToken(),
                            Integer.parseInt(tokenizer.nextToken())
                    );
                    System.out.println(academico.mostrarDatos());
                }
    
                System.out.println(); // Salto de línea entre cada conjunto de datos
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
