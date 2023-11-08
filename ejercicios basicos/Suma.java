import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int nro1, nro2, resultado=0;

        System.out.println("Ingrese los dos numeros para sumar: ");
        
        nro1 = leer.nextInt();
        nro2 = leer.nextInt();
            
        resultado = nro1 + nro2;

        System.out.println("El resultado es: " + resultado);

        leer.close();

    }
}
