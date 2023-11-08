import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner lectura = new Scanner(System.in);
        int largo;
        String texto;
        String frase = "hola como estas".replaceAll(" ", "");

        texto = lectura.nextLine();

        texto = texto.replaceAll(" ", "");

        char[] textoCadena = texto.toCharArray();
        char[] fraseCadena = frase.toCharArray();

        char matriz[][] = new char[5][5];

        largo = frase.length();
        int cont = 0;
        int esta,stop;
        char aux[] = new char[largo];

        for(int i=0;i<largo;i++)
           aux[i]='1';

        for (int i = 0; i < largo; i++) {
            char caracter = fraseCadena[i];
        
            esta=0;  
            for(int j=0; j<largo && esta==0;j++)
                if(caracter==aux[j] || caracter== ' ')
                    esta=1;
                 
                if(esta==0){  
                    stop=0;
                    for(int j=0;j<largo && stop==0;j++)
                        if(aux[j]=='1' ){
                            aux[j]=caracter;
                            stop=1;
                        }
                    
                }
                           
        }

        // Reemplazar '1' por espacios en blanco
        for (int i = 0; i < largo; i++) {
            if (aux[i] == '1') {
                aux[i] = ' ';
            }
        }

        String nuevo = new String(aux).replaceAll(" ", "");

        char[] nuevo1 = nuevo.toCharArray();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (cont < nuevo1.length) {
                    matriz[i][j] = nuevo1[cont];
                    cont++;
                } else {
                    matriz[i][j] = ' '; // Si no hay más caracteres, llena con espacios en blanco
                }
            }
        }

        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

        for (int k = 0; k < textoCadena.length; k++) {
            char caracter = textoCadena[k];
            if (caracter != ' ') {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (matriz[i][j] == caracter) {
                            int newI = (i + 1) % 5;
                            int newJ = j;
                            textoCadena[k] = matriz[newI][newJ];
                        }
                    }
                }
            }
        }

        String cifrado = new String(textoCadena);

        System.out.println(cifrado);


        lectura.close();

    }



}
