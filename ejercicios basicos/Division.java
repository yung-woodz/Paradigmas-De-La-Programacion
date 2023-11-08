import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int nro1, nro2;

        float divisor;

        System.out.println("Ingrese dos numeros para dividir");
        nro1 = leer.nextInt();

        do{
            
            nro2 = leer.nextInt();

            if(nro2 == 0){
                
                System.out.println("ERROR, ingrese otro valor");
                
            }

        }while(nro2 == 0);

        divisor = (float) nro1 / nro2;

        System.out.println("El resultado de la division es: " + divisor);

        leer.close();
        
    }


}
