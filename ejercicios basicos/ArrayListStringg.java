import java.util.ArrayList;

public class ArrayListStringg{
     public static void main(String[] args){
        int i;
        ArrayList<String> array = new ArrayList<String>();  //declaracion de ArrayList en java
        for(i = 1; i <= 10;i++){
            array.add("Mensaje"+ i);                        // funcion add añade elementos a string 
        }

        System.out.println("Elementos del array");
        String mensaje;
        for(i = 0;i < array.size(); i++){
        mensaje = array.get(i);
        System.out.println(mensaje);
        }
        
        array.add(5,"Mensaje insertado");

        System.out.println("Elementos del array despues de insertar en index 5");
        for(i = 0;i < array.size(); i++){
        mensaje = array.get(i);
        System.out.println(mensaje);
        }

        array.remove(0);

        System.out.println("Elementos del array despues de remover en index 0");
        for(i = 0;i < array.size(); i++){
        mensaje = array.get(i);
        System.out.println(mensaje);
        }
        
     }
}