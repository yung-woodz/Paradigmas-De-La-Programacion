import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        int n, fact, base=1, pot=0, resultado = 0;
        int i, j;

        System.out.println("Ingrese un valor para N > 0: ");

        do{

            n = numero.nextInt();

        }while(n <= 0);

        if(n % 2 == 0){

            for(i = 1 ; i <= n ; i++){

                if(i%2 == 0){

                    for(j = 1, fact = 1 ; j<=(i*(i-1)) ; j++){
                        fact = fact*j;
                    }

                    resultado = resultado + fact;

                }else{

                    for(i = 1 ; i <= base ; i++){

                        pot = pot * i;

                    }

                }

                

            }

        }

        

    }

}
